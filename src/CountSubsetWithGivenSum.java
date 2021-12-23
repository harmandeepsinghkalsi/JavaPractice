package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountSubsetWithGivenSum {

    public static void main(String[] args) {

        int arr[] = {2,3,5,8,2};
        int sum = 8;

        System.out.println(noOfSubsetWithGivenSum(arr, sum, arr.length));


    }



    public static int noOfSubsetWithGivenSum(int arr[], int sum, int n){

        int[][] dp = new int[n+1][sum+1];

        for (int i = 0; i < n+1; i++) {
            dp[i][0]=1;
        }

        for (int i = 1; i < sum+1; i++) {
            dp[0][i]=0;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {

                if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }

            }
        }

        return dp[n][sum];
    }
}
