import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.IntStream;


public class Coding {
	
	static ArrayList<Integer>findKthMostOccurring(
		       ArrayList<Integer> arr, int K)
		{
		     
		    // Initializing a dictionary
		    HashMap<Integer, Integer> d = new HashMap<>();
		 
		    // Iterating through the array
		    for(int i = 0; i < arr.size(); i++)
		    {
		         
		        // If the element is not in
		        // the dictionary, adding it
		        // with the frequency as 1
		        if (!d.containsKey(arr.get(i)))
		            d.put(arr.get(i), 1);
		 
		        // If the element is already
		        // present in the dictionary,
		        // increment its frequency
		        else
		        {
		            int temp = d.get(arr.get(i));
		            temp += 1;
		            d.put(arr.get(i), temp);
		        }
		    }
		 
		    // Now, the dictionary signifies
		    // the number of unique elements.
		    // If the count of this is
		    // less than K, then we cant find
		    // the elements whose occurrence is
		    // K-th most occurring.
		    if (d.size() < K)
		        return new ArrayList<Integer>();
		 
		    // Initializing a new dictionary
		    // to store the elements according
		    // to their frequency
		    HashMap<Integer, 
		            ArrayList<Integer>> occu = new HashMap<Integer,
		                                                   ArrayList<Integer>>();
		 
		    // Iterating through the dictionary
		    for(Map.Entry<Integer, Integer> freq : d.entrySet())
		    {
		         
		        // If the element is not in
		        // the dictionary, then store
		        // the element in an array
		        // with key as the frequency
		        if (!occu.containsKey(freq.getValue())) 
		        {
		            occu.put(freq.getValue(),
		                     new ArrayList<Integer>());
		            occu.get(freq.getValue()).add(
		                     freq.getKey());
		        }
		 
		        // Else, add the element to
		        // the array of elements
		        else
		        {
		            occu.get(freq.getValue()).add(
		                     freq.getKey());
		        }
		    }
		 
		    // Since the dictionary is sorted
		    // and not indexed, find (M - K)-th
		    // element where M is the length
		    // of the dictionary
		    //K = occu.size() - K;
		 
		    // Since we for sure know that the
		    // element exists, we iterate
		    // through the dictionary and
		    // return the element
		    int i = 1;
		    for(Map.Entry<Integer, 
		        ArrayList<Integer>> a : occu.entrySet()) 
		    {
		        if (i == K)
		            return a.getValue();
		 
		        i++;
		    }
		    
		    return new ArrayList<Integer>();
		}
		 
		// Driver code
		public static void main(String[] args)
		{
//		    ArrayList<Integer> arr = new ArrayList<Integer>(
//		        Arrays.asList(1, 4, 4, 4, 2, 2, 2, 5, 5,
//		                      5, 5, 5, 7,7,7, 8, 8, 8, 8,9,9));
//		                       
//		    int K = 2;
//		    //{1=1,4=3,2=3,5=5,7=2,8=4}=> {1=[1],2=[7],3=[4,2],4=[8],5=[5],6=[9]}, k=2 
//		    ArrayList<Integer> a = new ArrayList<Integer>(
//		        findKthMostOccurring(arr, K));
//		 
//		    System.out.print("[");
//		    for(int i = 0; i < a.size() - 1; i++)
//		    {
//		        System.out.print(a.get(i) + ", ");
//		    }
//		     
//		    if (a.size() >= 1)
//		        System.out.print((int)a.get(
//		            a.size() - 1) + "]");
			
		
				
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				
				while(t-->0){
				    String a = sc.next();
				    String b = sc.next();
				    
				    String temp1 = a.substring(2,a.length())+a.substring(0,2);
				    String temp2 = a.substring(a.length()-2,a.length())+a.substring(0,a.length()-2);
				    
				    if(temp1.equals(b) || temp2.equals(b)) {
				    	System.out.println("1");
				    } else {
				    	System.out.println("0");
				    }
				    
				}
			}
		    
		
	
	}

