package graphsDS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class BreadthFirstSearch {

	
	private int V;
	private LinkedList<Integer> adj[] ;
	
	BreadthFirstSearch(int v){
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge(int u, int w) {
		adj[u].add(w);
	}
	
	public void doBFS(int edge) {
		
		boolean visited [] = new boolean[V];
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[edge]= true;
		queue.add(edge);
		
		while(!queue.isEmpty()) {
			
			int curr = queue.poll();
			
			System.out.print(curr+" ");
			
			Iterator<Integer> itr = adj[curr].listIterator();
			while(itr.hasNext()) {
				int next = itr.next();
				if(!visited[next]) {
					visited[next]=true;
					queue.add(next);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		BreadthFirstSearch bfs = new BreadthFirstSearch(4);
		bfs.addEdge(0, 1); 
		bfs.addEdge(0, 2); 
		bfs.addEdge(1, 2); 
		bfs.addEdge(2, 0); 
		bfs.addEdge(2, 3); 
		bfs.addEdge(3, 3); 
        // traversal from a give vertex
		bfs.doBFS(2);
        System.out.println();
        // traversal for vertices
        //bfs.doBFSAll();
	}
}
