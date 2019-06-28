package practice;

import java.util.Scanner;

public class InversionCountOfAnArray {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
//		int inversionCount =0;
//		for (int i = 0; i < n-1; i++) {
//			for (int j = i+1;j<n ; j++) {
//				if(arr[i]>arr[j]) {
//					inversionCount++;
//				}
//			}
//		}
//		System.out.println(inversionCount);
		
		
		System.out.println(mergeSort(arr,arr.length));
		
	}
	
	// merge sort approach
	public static int mergeSort(int arr[],int n) {
		
		int resultantArray[] = new int[n];
		return _mergeSort(arr,resultantArray,0,n-1);
	}
	
	public static int _mergeSort(int arr[], int temp[], int left, int right) {
		
		int mid,inversionCount=0;
		if(left<right) {
			
			mid = (left+right)/2;
			inversionCount = _mergeSort(arr,temp,left,mid);
			inversionCount+=_mergeSort(arr,temp,mid+1,right);
			
			inversionCount+= merge(arr,temp,left,mid+1,right);
			
		}
		
		return inversionCount;
	}
	
	public static int merge(int arr[] , int temp[], int left, int mid, int right) {
		
		
		int i = left ;
		int j = mid;
		int k = left;
		int count =0;
		while((i<=mid-1)&&(j<=right)) {
			if(arr[i]>=arr[j]) {
				temp[k++]=arr[j++];
				count = count +(mid-i);
			}else {
				temp[k++]=arr[i++];
			}
			
		}
		
		while(i<=mid-1) {
			temp[k++]=arr[i++];
		}
		
		while(j<=right) {
			temp[k++]=arr[j++];
		}
		
		for (i = left; i <= right; i++) 
            arr[i] = temp[i];
		
		return count;
	}
}
