package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// problem wants to know whether string a in subsequence of string b
public class SequencePatternMatching {

    public static void main(String[] args) {

            String s1 = "A";
            String s2 = "ADXBZY";

            // first we find the lcs
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            int lcs = findLCS(ch1,ch2,s1.length(),s2.length());

            if(lcs == s1.length())
                System.out.println(true);
            else
                System.out.println(false);
    }

    public static int findLCS(char[] ch1, char[] ch2, int l1, int l2){

        int dp[][] = new int[l1+1][l2+1];

        for (int i = 1; i < l1+1; i++) {
            for (int j = 1; j < l2+1; j++) {
                //matching character
                if(ch1[i-1]==ch2[j-1]){
                    dp[i][j] = 1+dp[i-1][j-1];
                } else {
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[l1][l2];
    }
}
