package codingTest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// geeksforgeeks solution is also there


//
////C++ program to find minimum sum of two
////elements chosen from two arrays such that
////they are not at same index.
//#include <bits/stdc++.h>
//using namespace std;
//
////Function which returnss minimum sum of two
////array elements such that their indexes are
////not same
//int minSum(int a[], int b[], int n)
//{
// // Finding minimum element in array A and
// // also/ storing its index value.
// int minA = a[0], indexA;
// for (int i=1; i<n; i++)
// {
//     if (a[i] < minA)
//     {
//         minA = a[i];
//         indexA = i;
//     }
// }
//
// // Finding minimum element in array B and
// // also storing its index value
// int minB = b[0], indexB;
// for (int i=1; i<n; i++)
// {
//     if (b[i] < minB)
//     {
//         minB = b[i];
//         indexB = i;
//     }
// }
//
// // If indexes of minimum elements are
// // not same, return their sum.
// if (indexA != indexB)
//     return (minA + minB);
//
// // When index of A is not same as previous
// // and value is also less than other minimum
// // Store new minimum and store its index
// int minA2 = INT_MAX, indexA2;
// for (int i=0; i<n; i++)
// {
//     if (i != indexA && a[i] < minA2)
//     {
//         minA2 = a[i];
//         indexA2 = i;
//     }
// }
//
// // When index of B is not same as previous
// // and value is also less than other minimum.
// // Store new minimum and store its index
// int minB2 = INT_MAX, indexB2;
// for (int i=0; i<n; i++)
// {
//     if (i != indexB && b[i] < minB2)
//     {
//         minB2 = b[i];
//         indexB2 = i;
//     }
// }
//
// // Taking sum of previous minimum of a[]
// // with new minimum of b[]
// // and also sum of previous minimum of b[]
// //  with new minimum of a[]
// // and return whichever is minimum.
// return min(minB + minA2, minA + minB2);
//}



public class TwinArray {
		
	 static int twinArrays(int[] ar1, int[] ar2){
	        // Complete this function
		 int min1 = ar1[0];
		 int index1 = 0;
		 int index2 =0;
		 
		 int min2 = ar2[0];
		 for (int i = 1; i < ar1.length; i++) {
			 if (ar1[i]<min1 ){
				 min1=ar1[i];
				 index1=i;
				
			 }
		 }
			 
			 for (int j = 0; j < ar2.length; j++) {
				 if( ar2[j]<min2){
					 min2 = ar2[j];
					 index2=j;
				 }
			}
			 
			 
		
		 if(index1==index2){
			 if(min1<min2){
				 Arrays.sort(ar2);
				 return min1+ar2[1];
			 }else{
				 Arrays.sort(ar1);
				 return min2+ar1[1];
			 }
		 }
		
		  return min1+min2;
		
		
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar1 = new int[n];
	        for(int ar1_i = 0; ar1_i < n; ar1_i++){
	            ar1[ar1_i] = in.nextInt();
	        }
	        int[] ar2 = new int[n];
	        for(int ar2_i = 0; ar2_i < n; ar2_i++){
	            ar2[ar2_i] = in.nextInt();
	        }
	        int result = twinArrays(ar1, ar2);
	        System.out.println(result);
	    }
	
}
