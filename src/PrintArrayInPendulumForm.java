package practice;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayInPendulumForm {

	
/*
 * 
 * Write a program to input a list of n integers in an array and arrange them in a way similar to the to-and-fro movement of a Pendulum.

The minimum element out of the list of integers, must come in center position of array. If there are even elements, then minimum element should be moved to (n-1)/2 index (considering that indexes start from 0)
The next number (next to minimum) in the ascending order, goes to the right, the next to next number goes to the left of minimum number and it continues like a Pendulum.
 */
	public static void main(String[] args) throws IOException, NumberFormatException {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int mid = 0;

			if (n % 2 == 0) {
				mid = (n / 2) - 1;
			} else {
				mid = n / 2;
			}

			int left = mid - 1;
			int right = mid + 1;
			int i = 1;
			int temp[] = new int[n];
			temp[mid] = arr[0];
			while (i < arr.length) {

				if (right < arr.length) {
					temp[right] = arr[i];
					i++;
					right++;
				}

				if (left >= 0) {
					temp[left] = arr[i];
					i++;
					left--;
				}

			}

			for (int j = 0; j < temp.length; j++) {
				System.out.print(temp[j] + " ");
			}
			
			System.out.println();
		}
	}
}
