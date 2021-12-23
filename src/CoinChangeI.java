package practice;

// Find no of ways to make the given change from the set of coins given, infinite supply of coins
public class CoinChangeI {

    public static void main(String[] args) {

        int coins[] = {1,2,6,3,9};
        int sum = 10;

        System.out.println(noOfWays(coins,coins.length,sum));
    }

    public static int noOfWays(int[] coins, int n, int sum){

        int dp[][] = new int[n+1][sum+1];

        //empty set is possible for sum is 0
        for (int i = 0; i < n+1; i++) {
            dp[i][0]=1;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {

                if(j<coins[i-1]){
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                }
            }
        }

        return dp[n][sum];
    }
}
