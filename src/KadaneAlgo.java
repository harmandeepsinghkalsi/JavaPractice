import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadaneAlgo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int arr[] = new int[n];
			String num = br.readLine();
			String nums[] = num.split(" ");
			for(int i=0;i<nums.length;i++){
		        arr[i]=Integer.parseInt(nums[i]);
		    }
			int currSum = arr[0];
			int globalSum = arr[0];

			for (int i = 1; i < n; i++) {
				currSum = Math.max(arr[i], currSum + arr[i]);

				globalSum = Math.max(currSum, globalSum);
			}
			System.out.println(globalSum);
		}
	}
}
