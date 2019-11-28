package arrays;

import java.util.Scanner;

public class BringNegativeInFront {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc .nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right) {
			
			if(arr[left]>0 && arr[right]>0) {
				right--;
			} else if(arr[left]>0 && arr[right]<0){
				swap(arr,left,right);
				left++;
				right--;
			} else if(arr[left]<0 && arr[right]>0) {
				right--;
				left++;
			} else {
				left++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void swap(int arr[], int left,int right) {
		
		int temp = arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}
}
