package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class SortAnArrayOf012 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String s[] = br.readLine().split(" ");
			int zeroCount = 0, oneCount = 0, twoCount = 0;
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s[i]);
			}

			StringBuilder sb = new StringBuilder();
			Arrays.sort(arr);
			for (int i = 0; i < n; i++) {
				sb.append(arr[i] + " ");
			}

			System.out.println(sb.toString());
		}
	}
}
