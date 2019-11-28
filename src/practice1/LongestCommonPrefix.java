package practice;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String arr[] = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		if (arr.length == 0)
			System.out.println("");
		else if (arr.length == 1)
			System.out.println(arr[0]);
		else {

			String result = "";

			// 1. Sort the array
			Arrays.sort(arr);

			int len1 = arr[0].length();
			int len2 = arr[arr.length - 1].length();
			// Find the min length from first and last element in the array
			int minLen = Math.min(len1, len2);

			for (int i = 0; i < minLen; i++) {

				char ch1 = arr[0].charAt(i);
				char ch2 = arr[arr.length - 1].charAt(i);
				// if the characters in the strings match , add them to the resultant string and
				// return .
				if (ch1 == ch2) {
					result += String.valueOf(ch1);
				} else {
					break;
				}
			}

			System.out.println(result);
		}
	}
}
