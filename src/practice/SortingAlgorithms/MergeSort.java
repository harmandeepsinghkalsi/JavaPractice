package practice.SortingAlgorithms;

import java.util.Scanner;
// Time complexity is O(nlogn) and in best case it is 

public class MergeSort {
	
	public static void main (String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		mergeSort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	
	public static void mergeSort(int arr[]){
			
		if(arr.length<2)
			return;
		
		int mid = arr.length/2;
		
		int left[] = new int[arr.length-mid];
		int right[] = new int[mid];
		
		int i=0 , j=0;
		
		while( i < arr.length-mid) {
			left[i] = arr[j];
			i++;j++;
		}
		
		 i=0;
		while(i < mid) {
			right[i]=arr[j];
			i++;j++;
		}
		
		mergeSort(left);
		mergeSort(right);
		
		merge(left,right,arr);
		
		
	}
	
	
	public static void merge(int left[],int right[],int arr[]){
		
		int ll = left.length;
		int rl = right.length;
		
		int i=0,j=0,k=0;
		
		while(i<ll && j < rl){
			
			if(left[i] < right[j]){
				
				arr[k]= left[i];
				i++;
				k++;
			}else{
				arr[k]= right[j];
				j++;
				k++;
				
			}
		}
		
		while(i<ll){
			arr[k]= left[i];
			i++;
			k++;
		}
		while(j<rl){
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}
