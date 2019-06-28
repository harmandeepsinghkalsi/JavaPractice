package practice;

import java.io.IOException;
import java.util.Scanner;

public class ReverseArrayInGroups {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			int groupSize = sc.nextInt();
			
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			
			for (int i = 0; i < arr.length; i+=groupSize) {
				
				int left = i;
				int right = Math.min(left+groupSize-1, arr.length-1);
				
				while(left<right) {
					
					int temp = arr[left];
					arr[left]=arr[right];
					arr[right]=temp;
					left++;
					right--;
				}
				
			}
			
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			
			System.out.println();

		}
	}

}

//Variation : k+m - at particular distance reverse  . doubling k itself
