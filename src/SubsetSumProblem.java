package practice;

public class SubsetSumProblem {

    static int dp[][];
    public static void main(String[] args) {

        int arr[] = {3, 34, 4, 12, 5, 2};
        int sum = 13;

        dp = new int[arr.length+1][sum+1];
        for (int i = 0; i < arr.length+1; i++) {
            for (int j = 0; j < sum+1; j++) {
                dp[i][j]=-1;
            }
        }

        //System.out.println(subsetSumRecursive(arr,sum,arr.length));
        //System.out.println(subsetSumMemoize(arr,sum,arr.length));
        System.out.println(subsetSumDP(arr,sum,arr.length));
    }

    static boolean subsetSumRecursive(int arr[], int sum , int n){

        //Base conditions
        if(n==0)
            return false;
        if(sum==0)
            return true;

        //Logic
        // if the current element is greater than desired sum , we don't pick it
        if(arr[n-1] > sum){
            return subsetSumRecursive(arr,sum,n-1);
        }else{
            return (subsetSumRecursive(arr,sum,n-1) || subsetSumRecursive(arr,sum-arr[n-1],n-1));
        }
    }

    static int subsetSumMemoize(int arr[], int sum , int n){

        //Base conditions
        if(n<=0)
            return 0;
        if(sum==0)
            return 1;

        //if already computed return
        if(dp[n-1][sum]!= -1){
            return dp[n-1][sum];
        }

        //Logic
        // if the current element is greater than desired sum , we don't pick it
        if(arr[n-1] > sum){
            return dp[n-1][sum] = subsetSumMemoize(arr,sum,n-1);
        }else{

            if(subsetSumMemoize(arr,sum,n-1) != 0 || subsetSumMemoize(arr,sum-arr[n-1],n-1) != 0){
                return dp[n-1][sum]=1;
            } else {
                return dp[n-1][sum]=0;
            }
        }

    }

    static boolean subsetSumDP(int arr[], int sum, int n){


        boolean dp1[][] = new boolean[arr.length+1][sum+1];

        // if sum =0 , we can create using empty subset {}
        for (int i = 0; i < arr.length+1; i++) {
            dp1[i][0] = true;
        }

        // if array is empty, then sum can never be achieved
        for (int j = 1 ; j < sum+1; j++) {
            dp1[0][j]= false;
        }

        for (int i = 1; i < arr.length+1; i++) {
            for (int j = 1; j < sum+1; j++) {

                if(arr[i-1] <= j){
                    dp1[i][j]= dp1[i-1][j] || dp1[i-1][j-arr[i-1]];
                } else {
                    dp1[i][j]=dp1[i-1][j];
                }
            }
        }

        //for printing matrix
//        for (int i = 0; i < dp1.length; i++) {
//            for (int j = 0; j < dp1[0].length; j++) {
//                System.out.print("|"+dp1[i][j]+"| ");
//            }
//            System.out.println();
//        }



        return dp1[arr.length][sum];
    }
}
