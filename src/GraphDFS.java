package practice;

import java.util.LinkedList;
import java.util.Stack;

public class GraphDFS {

    private int V;//no. of vertices
    private LinkedList<Integer> adj[]; //array of adj list

    //constructor
    GraphDFS(int v){
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

    private void DFS(int startingVertex) {
        boolean visited[] = new boolean[V];
        DFSUtil(startingVertex,visited);

        /**
         * in case of disconnected graph, loop over all the vertices
         *
         * for(int i=0;i<V;i++){
         *  if(visited[i]==false){
         *     DFSUtil(i,visited)
         *  }
         * }
         */

    }

    private void DFSUtil(int startingVertex, boolean[] visited){

        if(!visited[startingVertex]){
            visited[startingVertex]=true;
            System.out.println(startingVertex);

            for (int i = 0; i < adj[startingVertex].size(); i++) {
                DFSUtil(adj[startingVertex].get(i),visited);
            }
        }
    }

    void DFSUsingStack(int startingVertex){

        Stack<Integer> stk = new Stack<>();
        boolean visited[] = new boolean[V];
        stk.push(startingVertex);
        visited[startingVertex]=true;

        while(!stk.isEmpty()){

            int current = stk.pop();
            System.out.println(current);
            for (int i = 0; i < adj[current].size(); i++) {
                int neighbour = adj[current].get(i);
                if(!visited[neighbour]) {
                    visited[neighbour] = true;
                    stk.push(neighbour);
                }
            }
        }

    }

    public static void main(String[] args){

        GraphDFS g = new GraphDFS(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        int startingVertex = 2;
       // g.DFS(startingVertex);
        g.DFSUsingStack(startingVertex);

    }
}
