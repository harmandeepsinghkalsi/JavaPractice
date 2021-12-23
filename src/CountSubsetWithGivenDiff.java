package practice;

import java.util.Arrays;

//s1-s2 = diff and s1+s2=total_sum , so adding both we get 2s1=diff+total_sum and s1 = diff+total_sum/2;
public class CountSubsetWithGivenDiff {

    public static void main(String[] args) {
        int arr[] = {1,1,2,3};
        int diff = 1;
        int total_sum = Arrays.stream(arr).sum();

        int sumOfSubset1 = (diff+total_sum)/2;

        System.out.println(countSubsetWithGivenDiff(arr,sumOfSubset1,arr.length));
    }

    public static int countSubsetWithGivenDiff(int arr[] , int sum, int n){

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
