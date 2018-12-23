package codingTest;

import java.util.Scanner;


// An array has good subarray if in one of the subarrays , starting element is greater than the last element. Also we have to find longest good sub array.
//completed with 30% score. need further modification
public class LongestGoodSubArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			long n = sc.nextLong();

			long arr[] = new long[(int) n];

			for (long i = 0; i < arr.length; i++) {
				arr[(int) i] = sc.nextLong();
			}

			long longest=0;

			for (long i = 0; i < arr.length; i++) {

				long j = i + 1;

				while (j < n) {
					if (arr[(int) i] >= arr[(int) j] && ((j-i+1)>longest)) {
						longest = j - i+1;
					}
					j++;
				}

			}
			if(longest>0)
			System.out.println(longest);
			else
				System.out.println(longest+1);
		}
		
	}
}
