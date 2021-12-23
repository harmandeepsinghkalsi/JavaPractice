package practice;

public class UnboundedKnapsack {

    public static void main(String[] args) {

        int val[] = {1,4,7,10};
        int wt[] = {1,2,3,5};
        int W = 8;

        System.out.println(maxProfit1DP(val, wt, W, val.length));
    }

    public static int maxProfit(int[] val, int[] wt, int W, int n){

        int dp[][] = new int[n+1][W+1];

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < W+1; j++) {
                if(i==0 || j ==0){
                    dp[i][j]=0;
                } else if(wt[i-1] > j){
                    dp[i][j] = dp[i-1][j];
                } else {
                    dp[i][j] = Integer.max(dp[i-1][j], val[i-1]+dp[i][j-wt[i-1]]);
                }
            }
        }

        return dp[n][W];
    }

    public static int maxProfit1DP(int val[] , int wt[], int W, int n){

        int dp[] = new int[W+1];

        for (int i = 0; i < W+1; i++) {
            for (int j = 0; j < n; j++) {

                if(wt[j]<=i){
                    dp[i]=Integer.max(dp[i], dp[i-wt[j]]+val[j]);
                }

            }
        }

        return dp[W];

    }
}
