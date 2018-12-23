package practice.SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]= sc.nextInt();
		}
		
		
		
		for (int i = 1; i < n; i++) {
			
			int hole = i;
			int valueHole = arr[i];
			
			while(hole > 0 && arr[hole-1]> valueHole){
				
				arr[hole]=arr[hole-1];
				hole--;
			}
			
			arr[hole]=valueHole;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
