package practice;

import java.util.Scanner;

public class Seg012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Approach1: Use Arrays.sort(arr);
		// Approach 2: Use 3 counters

		int n = sc.nextInt();
		int arr[] = new int[n];
		int counter0 = 0, counter1 = 0, counter2 = 0;

		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
			if(arr[i] == 0)
				counter0++;
			else if(arr[i]==1)
				counter1++;
			else
				counter2++;
		}
		
		for (int i = 0; i < counter0; i++) {
			arr[i]=0;
		}
		
		for (int i = counter0; i < counter0+counter1; i++) {
			arr[i]=1;
		}
		
		for (int i = counter0+counter1; i < counter0+counter1+counter2; i++) {
			arr[i]=2;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
