package practice;

public class ZeroOneKnapsack {

    static int dp[][];
    public static void main(String[] args) {

        int val[] = {60,100,120};
        int wt[] = {10,20,30};
        int W=50;
        dp = new int[val.length+1][W+1];
        //Need this for memoize approach
//        for (int i = 0; i < val.length+1; i++) {
//            for (int j = 0; j < W+1; j++) {
//                dp[i][j]=-1;
//            }
//        }

        //System.out.println(knapsackRecursive(W,wt,val,val.length));
        //System.out.println(knapsackMemoize(W,wt,val,val.length));
        System.out.println(knapsackIterative(W,wt,val,val.length));

    }

    public static int knapsackRecursive(int W,int wt[], int val[], int n){

        //base condition
        if(W==0 || n==0){
            return 0;
        }

        // if weight os current item is more then the weight of knapsack
        if(wt[n-1] > W){
            return knapsackRecursive(W,wt,val,n-1);
        } else{//choice of choosing a particular item or not
            return Integer.max(knapsackRecursive(W,wt,val,n-1),
                    val[n-1] +knapsackRecursive(W-wt[n-1],wt,val,n-1));
        }
    }

    // problem using memoization to save the recursive calls
    public static int knapsackMemoize(int W,int wt[], int val[], int n){

        //base condition
        if(W==0 || n==0){
            return 0;
        }

        if(dp[n][W] != -1)
            return dp[n][W];
        // if weight os current item is more then the weight of knapsack
        if(wt[n-1] > W){
            dp[n][W]= knapsackRecursive(W,wt,val,n-1);
        } else{//choice of choosing a particular item or not
            dp[n][W]=Integer.max(knapsackRecursive(W,wt,val,n-1),
                    val[n-1] +knapsackRecursive(W-wt[n-1],wt,val,n-1));
        }
        return dp[n][W];
    }

    // Knapsack dynamic programming approach(iterative)
    public static int knapsackIterative(int W,int wt[], int val[], int n){


        //populating other values
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < W+1; j++) {

                if(i==0 ||j==0) {
                    dp[i][j] = 0;
                }
                else if(wt[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    dp[i][j]= Integer.max(dp[i-1][j] , val[i-1]+dp[i-1][j-wt[i-1]]);
                }
            }
        }

        return dp[n][W];
    }
}
