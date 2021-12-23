package practice;

public class LongestRepeatingSubsequence {

    public static void main(String[] args) {

        String s1 = "AABEBCDD";
        String s2 = s1;

        System.out.println(longestRepeatingSubsequence(s1.toCharArray(), s2.toCharArray(), s1.length(),s2.length()));
    }

    public static int longestRepeatingSubsequence(char[] ch1, char[] ch2, int l1, int l2){

        int dp[][] = new int[l1+1][l2+1];

        for (int i = 1; i < l1+1; i++) {
            for (int j = 1; j < l2+1; j++) {

                if( (ch1[i-1] == ch2[j-1]) &&  (i!=j) ){
                    dp[i][j] = 1+dp[i-1][j-1];
                } else {
                    dp[i][j] = Integer.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

//        for (int i = 0; i < l1+1; i++) {
//            for (int j = 0; j < l2+1; j++) {
//                System.out.print(dp[i][j]+"|");
//            }
//            System.out.println();
//        }

        //PrintLongestCommonSubsequence.printLongestCommonSubsequence(ch1,ch2,dp);
        return dp[l1][l2];

    }
}
