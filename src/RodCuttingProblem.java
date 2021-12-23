package practice;

public class RodCuttingProblem {

    public static void main(String[] args) {

        int lengthOfRod = 4;
        int length[] = new int[lengthOfRod]; // in case the lengths array is not given ,construct it else use the one given

        int price[] = {1, 5, 8, 9, 10, 17, 17, 20};

        for (int i = 1; i <=lengthOfRod; i++) {
            length[i-1] = i;
        }

        System.out.println(maxProfit1DP(length,length.length,price,lengthOfRod));
    }

    public static int maxProfit(int rodLen[] , int n ,int price[] , int rodLength){

        int dp[][] = new int[n+1][rodLength+1];

        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < rodLength+1; j++) {
                if(rodLen[i-1] <= j){
                    dp[i][j] = Integer.max(dp[i-1][j],price[i-1]+dp[i][j-rodLen[i-1]]);
                } else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][rodLength];
    }

    public static int maxProfit1DP(int rodLen[] , int n ,int price[] , int rodLength){

        int dp[] = new int[rodLength+1];
        for (int i = 0; i < rodLength+1; i++) {
            for (int j = 0; j < n; j++) {
                if(rodLen[j]<=i){
                    dp[i]=Integer.max(dp[i],price[j]+dp[i-rodLen[j]]);
                }
            }
        }

        for (int i = 0; i < rodLength; i++) {
            System.out.print(dp[i]+"|");
        }
        return dp[rodLength];
    }
}
