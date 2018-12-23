package dynamicProgramming;

import java.io.*;
import java.util.ArrayList;

//Longest Increasing subproblem

public class LIS {
	
//	/* A Naive Java Program for LIS Implementation */
//	
//	   static int max_ref; // stores the LIS
//	 
//	   /* To make use of recursive calls, this function must return
//	   two things:
//	   1) Length of LIS ending with element arr[n-1]. We use
//	      max_ending_here for this purpose
//	   2) Overall maximum as the LIS may end with an element
//	      before arr[n-1] max_ref is used this purpose.
//	   The value of LIS of full array of size n is stored in
//	   *max_ref which is our final result */
//	   static int _lis(int arr[], int n)
//	   {
//	       // base case
//	       if (n == 1)
//	           return 1;
//	 
//	       // 'max_ending_here' is length of LIS ending with arr[n-1]
//	       int res, max_ending_here = 1;
//	 
//	        /* Recursively get all LIS ending with arr[0], arr[1] ...
//	           arr[n-2]. If   arr[i-1] is smaller than arr[n-1], and
//	           max ending with arr[n-1] needs to be updated, then
//	           update it */
//	        for (int i = 1; i < n; i++)
//	        {
//	            res = _lis(arr, i);
//	            if (arr[i-1] < arr[n-1] && res + 1 > max_ending_here)
//	                max_ending_here = res + 1;
//	        }
//	 
//	        // Compare max_ending_here with the overall max. And
//	        // update the overall max if needed
//	        if (max_ref < max_ending_here)
//	           max_ref = max_ending_here;
//	 
//	        // Return length of LIS ending with arr[n-1]
//	        return max_ending_here;
//	   }
//	 
//	    // The wrapper function for _lis()
//	    static int lis(int arr[], int n)
//	    {
//	        // The max variable holds the result
//	         max_ref = 1;
//	 
//	        // The function _lis() stores its result in max
//	        _lis( arr, n);
//	 
//	        // returns max
//	        return max_ref;
	
	
	
	//Second approach iterative one . The complexity is O(n2) , but it could be done in O(nlogn)
	
//		public static int lis(int arr[] , int n){
//				
//				int lis[] = new int [n];
//				int max=0;
//				
//				for (int i = 0; i < arr.length; i++) {
//					lis[i]=1;
//				}
//				
//				for (int i = 1; i < arr.length; i++) {
//					for (int j = 0; j < i; j++) {
//						
//						if(arr[i]>arr[j] && lis[i]<1+lis[j]){
//							lis[i]=1+lis[j];
//						}
//					}
//				}
//	
//				for (int i = 0; i < lis.length; i++) {
//					if(lis[i]>max)
//						max=lis[i];
//				}
//				
//				return max;
//	    }
		
		//Third approach with complexity O(NlogN).Binary Search is used in this approach.
		
		
	
		public static int findIndex(int tailIndex[],int l, int r , int key)
		{
			
			while(r-l >1){
				
				int m = (r+l)/2;
				
				if(tailIndex[m]>key){
					r=m;
				}else
					l=m;
				
			}
			return r;
		}
	
		public static int lis(int arr[] , int n){
			
			int lastIndex[] = new int [n];
			int length ;
			lastIndex[0]=arr[0];
			length =1;
			
			for (int i = 1; i < n; i++) {
				
				if(arr[i]>lastIndex[length-1])
					lastIndex[length++]=arr[i];
				
				else if(arr[i]<lastIndex[0])
					lastIndex[0]=arr[i];
				
				else{
					lastIndex[findIndex(lastIndex,-1,length-1,arr[i])]=arr[i];
				}
			}
			
			return length;
		}
		
		
		
		
		
		
	 
	    // driver program to test above functions
	    public static void main(String args[])
	    {
	        int arr[] = {50, 3, 10, 7, 40, 80};
	        int n = arr.length;
	        System.out.println("Length of lis is "
	                           + lis(arr, n) + "n");
	    }
	 }

