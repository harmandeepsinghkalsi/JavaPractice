package practice;


import java.util.Iterator;
import java.util.LinkedList;

class GraphD {
	private int V;
	private LinkedList<Integer> adj[]; // Adjacency List

	GraphD(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			adj[i] = new LinkedList();
		}
	}

	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	
//	void DFSUtil(int v , boolean visited[])     // This code traverses only the vertices reachable from a given source vertex.
													//All the vertices may not be reachable from a given vertex (example Disconnected graph)
//	{
//		visited[v]=true;
//		System.out.print(v+ " ");
//		
//		Iterator <Integer> i =  adj[v].listIterator();
//		while(i.hasNext()){
//			int n =i.next();
//			if(!visited[n]){
//				DFSUtil(n,visited);
//			}
//		}
//		
//	}
//	
//	
//	void DFS(int v){
//		boolean visited[] = new boolean[V];
//		DFSUtil(v,visited);
//	}
	
	
//	void DFSUtil(int v, boolean visited[])                //To do complete DFS traversal of such graphs, we must call DFSUtil() for every vertex. 
													//Also, before calling DFSUtil(), we should check if it is already printed by some other call of DFSUtil()
//	{
//		visited[v]= true;
//		System.out.println(v + " ");
//		Iterator<Integer> i = adj[v].listIterator();
//        while (i.hasNext())
//        {
//            int n = i.next();
//            if (!visited[n])
//                DFSUtil(n,visited);
//        }
//	}
//	
//	
//	
//	void DFS(){
//		
//		boolean visited[] = new boolean[V];
//		for (int i = 0; i < V; i++) {
//			if(!visited[i]){
//				DFSUtil(i,visited);
//			}
//		}
//		
//	}
//	
	
}


public class DFS {
	public static void main(String args[]) {
		GraphD g = new GraphD(4);

		g.addEdge(0, 0);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		// System.out.println("Following is Depth First Traversal "+ "(starting from vertex 2)");
		
		//g.DFS(2);
		 //g.DFS();
	}
}
