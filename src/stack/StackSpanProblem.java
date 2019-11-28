package stack;

import java.util.Scanner;
import java.util.Stack;

public class StackSpanProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    int res[] = new int[n];
		    Stack<Integer> myStack = new Stack<>();
		    for(int i =0;i<n;i++){
		        arr[i]=sc.nextInt();
		    }
		    
		    myStack.push(0);
		    res[0]=1;
		    
		    int prevCount=0;
		    for(int i=0;i<n;i++){
		      
		               while(!myStack.isEmpty() && arr[myStack.peek()]<=arr[i]){
		                   myStack.pop();
		               }
		               
		               res[i]= myStack.isEmpty()?i+1:i-myStack.peek(); 
		               myStack.push(i);
		           
		    }
		    
		    for(int i=0;i<n;i++){
		        System.out.print(res[i]+" ");
		    }
		    System.out.println();
		}
	}

}

//Without using stack
//static void calculateSpan(int A[], 
//        int n, int ans[]) 
//{ 
//// Span value of first element is always 1 
//ans[0] = 1; 
//
//// Calculate span values for rest of the elements 
//for (int i = 1; i < n; i++) { 
//int counter = 1; 
//while ((i - counter) >= 0 && A[i] > A[i - counter]) { 
//counter += ans[i - counter]; 
//} 
//ans[i] = counter; 
//} 
//}
