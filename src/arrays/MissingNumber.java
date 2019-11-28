package arrays;

import java.util.Scanner;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			 int n = sc.nextInt();
			 int arr[] = new int[n-1];
			 
			 int arrSum = 0;
			 for (int i = 0; i <n-1; i++) {
				arr[i]=sc.nextInt();
				arrSum=arrSum+arr[i];
			}
			 
			int totalSum = (n*(n+1)) / 2;			
			System.out.println(totalSum-arrSum);
			
			
					 
		}
	}

}
