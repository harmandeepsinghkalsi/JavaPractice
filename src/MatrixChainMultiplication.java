package practice;

public class MatrixChainMultiplication {

    static int dp[][];
    static char name;
    public static void main(String[] args) {

            int arr[] = {4,2,3,1,3};
            dp = new int[arr.length][arr.length];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    dp[i][j] = -1;
                }
            }
            int start = 1; // 0 is not possible since we need two value for a valid matrix (0,1) = 40x20
            int end = arr.length-1;
            //System.out.println(MCMRecursive(arr, start , end));

            //System.out.println(MCMMemoize(arr, start, end));
            System.out.println(MCMTabulation(arr, start, end));
//            for (int i = 0; i < dp.length; i++) {
//                for (int j = 0; j < dp[0].length; j++) {
//                    System.out.print(dp[i][j]+"|");
//                }
//            System.out.println();
//        }
    }

    public static int MCMRecursive(int[] arr, int start , int end){

        //base conditions
        // if start = end , we cant make a valid matrix
        if(start>=end)
            return 0;

        int minCost = Integer.MAX_VALUE;
        for (int k = start; k < end; k++) {
            int tempCost = MCMRecursive(arr,start,k)+MCMRecursive(arr,k+1,end)
                    + arr[start-1]*arr[k]*arr[end];
            if(tempCost < minCost){
                minCost = tempCost;
            }
        }
        return minCost;
    }

    public static int MCMMemoize(int[] arr, int start, int end){

        //base conditions
        // if start = end , we cant make a valid matrix
        if(start>=end)
            return 0;
        if(dp[start][end]!=-1){
            return dp[start][end];
        }
        int minCost = Integer.MAX_VALUE;
        for (int k = start; k < end; k++) {
            int tempCost = MCMRecursive(arr,start,k)+MCMRecursive(arr,k+1,end)
                    + arr[start-1]*arr[k]*arr[end];
            if(tempCost < minCost){
                minCost = tempCost;
            }
        }


        return dp[start][end]= minCost;
    }

    public static int MCMTabulation(int arr[] , int start, int end){

        int bracket[][] = new int[arr.length][arr.length];
        // when start and end are same , you can't make a matrix, so fill 0

        for (int i = 0; i < arr.length; i++) {
            dp[i][i] = 0;
        }

        for (int len = 2; len < arr.length; len++) {
            for (int left = 1; left < arr.length-len+1; left++) {
                int right= len+left-1;
                dp[left][right] = Integer.MAX_VALUE;
                for (int k = left; k < right; k++) {
                    int temp = dp[left][k]+dp[k+1][right]+(arr[left-1]*arr[k]*arr[right]);
                    if(temp < dp[left][right]){
                        dp[left][right] = temp;

                        bracket[left][right] = k;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(bracket[i][j]+"|");
            }
            System.out.println();
        }
        name = 'A';
        printParanthesis(1,arr.length-1, bracket);
        return dp[1][arr.length-1];
    }

    public static void printParanthesis (int start , int end , int[][] bracket ){

        if(start==end){
            System.out.print(name++);
            return;
        }
        System.out.print("(");

        printParanthesis(start,bracket[start][end],bracket);
        printParanthesis(bracket[start][end]+1, end,bracket);
        System.out.print(")");
    }
}
