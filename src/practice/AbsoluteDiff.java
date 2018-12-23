package practice;

import java.io.IOException;
import java.util.Scanner;

public class AbsoluteDiff {
	
	public static void main(String[] args) throws IOException, NumberFormatException {

		// https://www.geeksforgeeks.org/maximum-absolute-difference-value-index-sums/

		Scanner sc = new Scanner(System.in);
		//|A[i] - A[j]| + |i - j|
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int max1 = Integer.MIN_VALUE; 
        int min1 = Integer.MAX_VALUE; 
        int max2 = Integer.MIN_VALUE; 
        int min2 = Integer.MAX_VALUE; 
  
        for (int i = 0; i < arr.length; i++) 
        { 
  
            // Updating max and min variables 
            // as described in algorithm. 
            max1 = Math.max(max1, arr[i] + i); 
            min1 = Math.min(min1, arr[i] + i); 
            max2 = Math.max(max2, arr[i] - i); 
            min2 = Math.min(min2, arr[i] - i); 
        } 
  
        // Calculating maximum absolute difference. 
        System.out.println(Math.max(max1 - min1, max2 - min2));

}

}