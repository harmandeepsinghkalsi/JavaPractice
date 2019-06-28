package practice;

import java.io.IOException;
import java.util.Scanner;

// Find closest number to given number , if there are two such numbers , print the larger one.
public class ClosestNumber {
	public static void main(String[] args) throws IOException, NumberFormatException {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			int numCloseTo = sc.nextInt();
			int arr[] = new int[n];
			
			for (int i = 0; i < n; i++) {
				arr[i]=sc.nextInt();
			}
			
			int minDiff = Math.abs(arr[0]-numCloseTo);
			int closestNum = arr[0];
			for (int i = 1; i < arr.length; i++) {
				
				if(Math.abs(arr[i]-numCloseTo) <= minDiff ) {
					minDiff = Math.abs(arr[i]-numCloseTo);
					closestNum = arr[i];
				}
			}
			
			System.out.println(closestNum);
		}
	}

}
