package practice;

import java.util.Scanner;

// Pivot index means the index  whose  left side and right side numbers have same sum.
public class FindPivotIndex {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		int leftSum=0,i=0;
		for (i = 0; i < arr.length; i++) {
			sum-=arr[i];
			if(leftSum==sum) {
				System.out.println(i);
				break;
			}
			leftSum+=arr[i];
		}
		
		if(i==arr.length)
			System.out.println("No pivot element exists in an array");
			
		
		
	}

}
