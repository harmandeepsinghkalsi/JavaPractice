package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Find the subsets with min diff. Sum of arr acts as range for us 0-sum , if one subset is s1 other will be
// range-S1 , so the relation is range-2s1 , if we just find the till the mid of range like what elements can
//contribute to making a subset in that range , other range we already have using range-2s1
public class MinSubsetSumDiff {

    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 2, 2, 1};
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        System.out.println(minSubsetDiff(arr,sum,arr.length));

    }

    public static int minSubsetDiff(int[] arr,int sum, int n){

        List<Integer> list = new ArrayList<>();
        boolean dp[][] =  new boolean[n+1][sum+1];

        for (int i = 0; i < n+1; i++) {
            dp[i][0]=true;
        }

        for (int i = 1; i < sum+1; i++) {
            dp[0][i]=false;
        }


        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {

                if(arr[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
                }

            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print("|"+dp[i][j]+"| ");
            }
            System.out.println();
        }



        int minDiff = Integer.MAX_VALUE;
        for (int i = sum/2; i >=0; i--) {
            if(dp[n][i]){
                minDiff = sum-2*i;
                break;
            }
        }

        System.out.println(list);
        return minDiff;
    }
}
