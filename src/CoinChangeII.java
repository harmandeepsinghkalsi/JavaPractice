package practice;

// Find min coins needed to make the given change
public class CoinChangeII {

    public static void main(String[] args) {

        int coins[] = {};
        int sum = 1;
        //System.out.println(findMinCoins(coins, coins.length, sum));
        System.out.println(findMinCoins1DP(coins, coins.length, sum));
    }
    
    public static int findMinCoins(int[] coins, int n, int sum){
        
        int dp[][] = new int[n+1][sum+1];

        for (int i = 0; i < sum+1; i++) {
            dp[0][i] = Integer.MAX_VALUE-1;
        }

        for (int i = 0 ; i < n+1; i++) {
            dp[i][0]=0;
        }

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < sum+1; j++) {

                if(coins[i-1]<=j){
                    dp[i][j] = Integer.min(dp[i-1][j],1+dp[i][j-coins[i-1]]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                System.out.print("|"+dp[i][j]);
            }
            System.out.println();
        }
        return (dp[n][sum]==Integer.MAX_VALUE-1)?-1:dp[n][sum];
    }

    public static int findMinCoins1DP(int[] coins, int n, int sum){

        int dp[] = new int[sum+1];

        dp[0]=0;

        for (int i = 1; i < sum+1; i++) {
            dp[i] = Integer.MAX_VALUE-1;
        }

        for (int i = 1; i < sum+1; i++) {

            for(int coin: coins){

                if(coin<=i){
                    dp[i] = Integer.min(dp[i],1+dp[i-coin]);
                }
            }
        }

        return dp[sum]==Integer.MAX_VALUE-1?-1:dp[sum];
    }


}
