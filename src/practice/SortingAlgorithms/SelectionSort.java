package practice.SortingAlgorithms;

import java.util.Scanner;
// Complexity is O(n2) . It is slow sorting algorithm .
public class SelectionSort {
	
	public static void main (String args[]){
			
		Scanner sc =  new Scanner(System.in);
		
		int nofe = sc.nextInt();
		
		int arr[] = new int[nofe];
		
		for (int i = 0; i < nofe; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]< arr[minIndex]){
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp; 
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
