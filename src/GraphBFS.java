package practice;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;

public class GraphBFS {

    private int V;//no. of vertices
    private LinkedList<Integer> adj[]; //array of adj list

    //constructor
    GraphBFS(int v){
        V=v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    //function to add the edge from v to w
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void BFSUsingQueue(int startingVertex){

        boolean visited[] = new boolean[V];
        LinkedList<Integer> list = new LinkedList<>();
        list.add(startingVertex);
        visited[startingVertex] = true;

        while(!list.isEmpty()){

            int current = list.poll();
            System.out.println(current);
            for (int i = 0; i < adj[current].size(); i++) {
                int neighbour = adj[current].get(i);
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    list.add(neighbour);
                }
            }

        }

    }

    public static void main(String[] args){

        GraphBFS g = new GraphBFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        int startingVertex = 2;

        g.BFSUsingQueue(startingVertex);
    }
}
