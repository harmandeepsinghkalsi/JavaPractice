package practice;

import java.util.Locale;

public class PrintShortestSuperSequence {

    public static void main(String[] args) {

        String s1 = "aaaaaaaa";
        String s2 = "aaaaaaaa";

        System.out.println(printShortestSupersequence(s1.toCharArray(), s2.toCharArray(), s1.length(),s2.length()));
    }

    public static String printShortestSupersequence(char ch1[], char ch2[] , int l1, int l2){

        int dp[][] = shortestSupersequenceTable(ch1,ch2,l1,l2);

        StringBuilder result = new StringBuilder();
        int i = l1, j = l2;
        // printing the supersequence

        while(i>0 && j>0){

            if(ch1[i-1]==ch2[j-1]){
                result.append(ch1[i-1]);
                i--;
                j--;
            } else {
                if(dp[i-1][j] > dp[i][j-1]){  // choose the max
                    result.append(ch1[i-1]);
                    i--;
                } else {
                    result.append(ch2[j-1]);
                    j--;
                }
            }
        }

        while(i>0){
            result.append(ch1[i-1]);
            i--;
        }

        while(j>0){
            result.append(ch2[j-1]);
            j--;
        }

        return result.reverse().toString();
    }

    public static int[][] shortestSupersequenceTable(char ch1[], char ch2[], int l1, int l2){

        int dp[][] = new int[l1+1][l2+1];

        for (int i = 1; i < l1+1; i++) {
            for (int j = 1; j < l2+1; j++) {

                if(ch1[i-1] == ch2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                } else {
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp;
    }
}
