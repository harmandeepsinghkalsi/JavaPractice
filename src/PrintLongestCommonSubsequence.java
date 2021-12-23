package practice;

public class PrintLongestCommonSubsequence {

    public static void main(String[] args) {

        String s1= "abcghij";
        String s2="abhidj";
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        int result[][] = longestCommmonSubsequenceTopDown(ch1,ch2,s1.length(),s2.length());

        printLongestCommonSubsequence(ch1, ch2,result);

    }

    public static void printLongestCommonSubsequence(char[] ch1, char[] ch2,int dp[][]){

            int i=dp.length-1;
            int j = dp[0].length-1;
            StringBuilder sb = new StringBuilder();

            while(i>0 && j >0){

                if(ch1[i-1] == ch2[j-1]){
                    sb.append(ch1[i-1]);
                    i--;
                    j--;
                } else {
                    if(dp[i-1][j]>dp[i][j-1]){
                        i--;
                    } else {
                        j--;
                    }
                }
            }

        System.out.println(sb.reverse().toString());

    }



    public static int[][] longestCommmonSubsequenceTopDown(char s1[], char s2[], int l1, int l2){

        int dp[][] = new int[l1+1][l2+1];
        for (int i = 1; i < l1+1 ; i++) {
            for (int j = 1; j < l2+1; j++) {
                if(s1[i-1] == s2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                } else {
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp;

    }

}
