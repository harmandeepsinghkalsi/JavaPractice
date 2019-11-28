package practice;

import java.util.Scanner;

// If it a string , use two pointer technique , one at right end other at left end keep moving to center.
public class PallindromNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =n;
		int rev =0;
		
		while(n!=0) {
			int rem = n%10;
			rev=rev*10+rem;
			n/=10;
		}
		
		if(temp==rev)
			System.out.println("Pallindrome");
		else
			System.out.println("Not a pallindrom");
	}
}
