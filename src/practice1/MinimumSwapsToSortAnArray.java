package practice;

import java.util.Scanner;

public class MinimumSwapsToSortAnArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int swaps =0;
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean visited[] = new boolean[n];
		
		for (int i = 0; i < arr.length; i++) {
			int j = i,cycle=0;
			while (!visited[j]) {
				
				visited[j]=true;
				j=arr[j]-1;
				cycle++;
			}
			
			if(cycle!=0) {
				swaps+=cycle-1;
			}
		}
		
		System.out.println(swaps);
		
	}
}
