package practice;

import java.util.Arrays;

// Either add + or - sign in front of all the elements of the array such that sum is equal to given sum
// put all the number with + sign and - sign collectively such that there diff is equal to given sum
//like say we have 4 elements and we added two + signs and two - signs like (arr[0]+arr[1])-(arr[2]+arr[3])
//which brings this down to the count subset having given diff problem
public class TargetSumProblem {

    public static void main(String[] args) {
        int arr[] = {0,0,0,0,0,0,0,0,1}; //7
        int sum = 1;

        int total_sum = Arrays.stream(arr).sum();
        int subsetSum = (total_sum+sum)/2;

        System.out.println(targetSum(arr,subsetSum,arr.length));
    }

    static int targetSum(int[] arr, int sum, int n){

        int[][] dp = new int[n+1][sum+1];

        // this is different from actual since it was said in the question that num can have 0 in the arr as
        //well , so not making all the i values in the first column as 1 because we may or may not want
        // 0 in the actual array subset
        dp[0][0]=1;
        for (int i = 1; i < sum+1; i++) {
            dp[0][i]=0;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {

                if(arr[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-arr[i-1]];
                }

            }
        }

//        for (int i = 0; i < n+1; i++) {
//            for (int j = 0; j < sum+1; j++) {
//                System.out.print("|"+dp[i][j]+"|");
//            }
//            System.out.println();
//        }
        return dp[n][sum];
    }

}
