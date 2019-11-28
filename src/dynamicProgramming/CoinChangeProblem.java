package dynamicProgramming;

import java.util.Scanner;

public class CoinChangeProblem {

	// There are two parts in coin change problem .
	// 1. Find minimum number of coins to make a certain sum.
	// 2. Find the number of ways to make a certain sum.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = sc.nextInt();
		CoinChangeProblem ccp = new CoinChangeProblem();
		System.out.println(ccp.minimumNumberOfCoins(arr, sum));

	}

	int minimumNumberOfCoins(int arr[], int total) {
		
		int countWays[]= new int[total+1];
		
		for (int i = 1; i <= total; i++) {
			countWays[i]=Integer.MAX_VALUE-1;
		}
		
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j <=total; j++) {
				
				if(arr[i]<=j){
					countWays[j] = Math.min(countWays[j], (1+countWays[j-arr[i]]));
				}
			}
		}
		return countWays[total];
	}

//	int waysToMakeSum() {
//
//	}
}
