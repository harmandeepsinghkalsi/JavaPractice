package graphsDS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


// We can also use Kahn's algorithm for topological sorting.
public class TopologicalSort {
	
	 private int V;   // No. of vertices 
	    private LinkedList<Integer> adj[]; // Adjacency List 
	  
	    //Constructor 
	    TopologicalSort(int v) 
	    { 
	        V = v; 
	        adj = new LinkedList[v]; 
	        for (int i=0; i<v; ++i) 
	            adj[i] = new LinkedList(); 
	    } 
	  
	    // Function to add an edge into the graph 
	    void addEdge(int v,int w) { adj[v].add(w); }
	    
	    void topologicalSortUtil(int edge, boolean visited[], Stack stack ) {
	    	
	    	visited[edge]= true;
	    	
	    	Iterator<Integer> itr = adj[edge].listIterator();
	    	
	    	while(itr.hasNext()) {
	    		int next = itr.next();
	    		if(!visited[next]) {
	    			topologicalSortUtil(next, visited, stack);
	    		}
	    	}
	    	
	    	stack.push(edge);
	    	
	    }
	    
	    void topologicalSort() {
	    	
	    	Stack newStack = new Stack();
	    	
	    	boolean visited[] = new boolean[V];
	    	
	    	for (int i = 0; i < V; i++) {
				if(!visited[i]) {
					topologicalSortUtil(i, visited, newStack);
				}
			}
	    	
	    	while(!newStack.isEmpty()) {
	    		System.out.print(newStack.pop()+" ");
	    	}
	    }
	    
	    public static void main(String args[]) 
	    { 
	    	
	        // Create a graph given in the above diagram 
	    	TopologicalSort g = new TopologicalSort(6); 
	        g.addEdge(5, 2); 
	        g.addEdge(5, 0); 
	        g.addEdge(4, 0); 
	        g.addEdge(4, 1); 
	        g.addEdge(2, 3); 
	        g.addEdge(3, 1); 
	  
	        System.out.println("Following is a Topological " + 
	                           "sort of the given graph"); 
	        g.topologicalSort(); 
	    } 

}
