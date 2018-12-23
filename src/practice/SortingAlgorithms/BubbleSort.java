package practice.SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
	// Time complexity : O(n2) worst case , Best Case: O(n)
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);	
		
		int nofe = sc.nextInt();
		
		int arr[] = new int[nofe];
		
		for (int i = 0; i < nofe; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length-1; i++) {
			boolean swapFlag = false; // it will check if no swap has happened , then break the outer loop for optimization.
			for (int j = 0; j < arr.length-i-1; j++)  // inner loop will run everytime one less than previous time .
			{
				 if(arr[j] > arr[j+1])// ascending order
					 {
					  int temp = arr[j];
					  arr[j] = arr[j+1];
					  arr[j+1] = temp;
					  swapFlag= true;
				 }
			}
			if(!swapFlag){
				break;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
