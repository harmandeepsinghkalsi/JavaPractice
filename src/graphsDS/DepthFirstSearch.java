package graphsDS;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {
	
	private int V;
	private LinkedList<Integer> adj[] ;
	
	DepthFirstSearch(int v){
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge(int u, int w) {
		adj[u].add(w);
	}
	
	public void doDFS(int edge) {
		
		boolean visited[]=new boolean[V];
		doDFSUtil(edge,visited);
	}
	
	public void doDFSAll() {
		boolean visited[]= new boolean[V];
		
		for (int i = 0; i < V; i++) {
			if(visited[i]==false)
				doDFSUtil(i,visited);
		}
	}
	
	public void doDFSUtil(int edge, boolean visited[]) {
		
		visited[edge] = true;
		System.out.print(edge+" ");
		
		Iterator<Integer> itr = adj[edge].listIterator();
		while(itr.hasNext()) {
			int next = itr.next();
			if(!visited[next]) {
				doDFSUtil(next, visited);
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		DepthFirstSearch dfs = new DepthFirstSearch(4);
		dfs.addEdge(0, 1); 
        dfs.addEdge(0, 2); 
        dfs.addEdge(1, 2); 
        dfs.addEdge(2, 0); 
        dfs.addEdge(2, 3); 
        dfs.addEdge(3, 3); 
        // traversal from a give vertex
        dfs.doDFS(2);
        System.out.println();
        // traversal for vertices
        dfs.doDFSAll();
	}

}
