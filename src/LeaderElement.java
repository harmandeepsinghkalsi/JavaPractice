package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//Print the elements which are greater than all the elements on their right side

public class LeaderElement {

	public static void main(String[] args) throws IOException, NumberFormatException {

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

			// O(n^2) approach
			//leaderElements(arr);
			//O(n) approach
			leaderElementsOptimized(arr);

		}
	}
	
	
	public static void leaderElementsOptimized(int arr[]) {
		
		Stack<Integer> result = new Stack<>();
		
		int curr_max = arr[arr.length-1];
		result.push(curr_max);
		for (int i = arr.length-2; i >= 0; i--) {
			
			if(arr[i]>=curr_max) {
				curr_max=arr[i];
				result.push(arr[i]);
			}
		}
		
		while(!result.isEmpty()) {
			System.out.print(result.pop()+" ");
		}
		
		System.out.println();
	}

	public static void leaderElements(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			boolean isGreater = true;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] > arr[i]) {
					isGreater = false;
					break;
				}
			}

			if (isGreater) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(arr[arr.length - 1] + "");
	}

}
