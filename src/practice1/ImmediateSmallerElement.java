package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImmediateSmallerElement {
	
	// Try using bufferedReader and string buffer

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String[] strs = str.trim().split("\\s+");

			int[] arr = new int[strs.length];
			int co = 0;
			for (String x : strs) {
				arr[co] = Integer.parseInt(x);
				co++;
			}
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[i - 1]) {
					System.out.print(arr[i] + " ");
				} else {
					System.out.print("-1" + " ");
				}
			}
			System.out.print("-1");

		}

	}
}
