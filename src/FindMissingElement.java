package practice;

import java.util.Scanner;

// should be implemented in constant space
public class FindMissingElement {
	
	public static void main(String[] args) {
		// We can use XOR for implementing the same
		//Other way we can implement this is using sort and check if next element is 1+ the previous one.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[]= new int[n];
		
		int arrXor = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			arrXor = arrXor^arr[i];
		}
		
		int fullXor = 0;
		for (int i = 0; i <= arr.length; i++) {
			fullXor = fullXor ^ i;
		}
		
		
		System.out.println(fullXor^arrXor);
		
		
	}

}
