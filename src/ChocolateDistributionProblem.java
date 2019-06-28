package practice;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Given an array A of positive integers of size N, where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are M students, the task is to distribute chocolate packets such that :
1. Each student gets one packet.
2. The difference between the number of chocolates given to the students having packet with maximum chocolates and student having packet with minimum chocolates is minimum.

 */

public class ChocolateDistributionProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
			
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			
			int s = sc.nextInt();
			
			System.out.println(calculateDiff(arr,n,s));
			
		}
	}
	
	public static int calculateDiff(int arr[], int n , int s) {
		
		if(n==0||s==0)
			return 0;
		if(s>n)
			return -1;
		
		Arrays.sort(arr);
			int left = 0,right =0;
		int minDiff = Integer.MAX_VALUE;
		for (int i = 0; i+s-1<n; i++) {
			
			
			if((arr[i+s-1]-arr[i])<minDiff) {
				minDiff = arr[i+s-1]-arr[i];
				left=i;
				right=i+s-1;
			}
		}
		
		return (arr[right]-arr[left]);
		
	}
}
