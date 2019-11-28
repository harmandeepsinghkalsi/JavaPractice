package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
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
			leaderElements(arr);
			//O(n) approach
//			leaderElementsOptimized(arr);

		}
	}
	
	
	public static void leaderElementsOptimized(int arr[]) {
		
		//Stack<Integer> result = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
	    List<Integer> list = new ArrayList<Integer>();
		
		int curr_max = arr[arr.length-1];
		list.add(curr_max);
		for (int i = arr.length-2; i >= 0; i--) {
			
			if(arr[i]>=curr_max) {
				curr_max=arr[i];
				list.add(arr[i]);
			}
		}
		
		for(int j=list.size()-1;j>=0;j--)
	    {
	        sb.append(list.get(j));
	        sb.append(' ');
	    }
		System.out.print(sb);
		
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
