package practice;

import java.util.ArrayList;
import java.util.List;

public class EqualSumPartition {

    public static void main(String[] args) {

        int arr[]= {1,5,11,8};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }


        if(sum %2 != 0){
            System.out.println("Equal sum partition is not possible");
        } else {
            System.out.println(subsetSum(arr,sum/2,arr.length));
        }
    }

    public static boolean subsetSum(int arr[] , int sum , int n){

        boolean dp[][] = new boolean[n+1][sum+1];

        // when the sum to achieve is 0 , we can have empty subset
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = true;
        }

        // when there is no element in the array
        for (int i = 1; i < sum+1; i++) {
            dp[0][i]= false;
        }

        // Logic to pick the element or not
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {

                if (arr[i - 1] <= j) {
                    dp[i][j]= dp[i-1][j] || dp[i-1][j-arr[i-1]];
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
