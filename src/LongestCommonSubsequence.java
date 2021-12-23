package practice;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

        String s1= "mhunuzqrkzsnidwbun";
        String s2="szulspmhwpazoxijwbq";
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        //System.out.println(longestCommmonSubsequenceRecursive(ch1,ch2,s1.length(),s2.length()));

        int dp[][] = new int[s1.length()+1][s2.length()+1];
        for (int i = 0; i < s1.length()+1; i++) {
            for (int j = 0; j < s2.length()+1; j++) {
                dp[i][j] = -1;
            }
        }
        //System.out.println(longestCommmonSubsequenceMemoize(ch1,ch2,s1.length(),s2.length(),dp));
        System.out.println(longestCommmonSubsequenceTopDown(ch1,ch2,s1.length(),s2.length()));
    }

    // not a good solution
    public static int longestCommmonSubsequenceRecursive(char[] s1, char[] s2, int l1, int l2){

        //base conditions
        if(l1 == 0 || l2 == 0){
            return 0;
        }

        if(s1[l1-1] == s2[l2-1]) {
            return 1 + longestCommmonSubsequenceRecursive(s1,s2,l1-1,l2-1);
        }


        return Integer.max(longestCommmonSubsequenceRecursive(s1,s2,l1-1,l2) , longestCommmonSubsequenceRecursive(s1,s2,l1,l2-1));
    }

    public static int longestCommmonSubsequenceMemoize(char[] s1, char[] s2, int l1, int l2, int[][] dp){

        //base conditions
        if(l1 == 0 || l2 == 0){
            return 0;
        }

        if(dp[l1][l2] != -1)
            return dp[l1][l2];

        if(s1[l1-1] == s2[l2-1]) {
            return dp[l1][l2]= 1 + longestCommmonSubsequenceRecursive(s1,s2,l1-1,l2-1);
        }


        return dp[l1][l2]=Integer.max(longestCommmonSubsequenceRecursive(s1,s2,l1-1,l2) , longestCommmonSubsequenceRecursive(s1,s2,l1,l2-1));
    }

    public static int longestCommmonSubsequenceTopDown(char s1[], char s2[], int l1, int l2){

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
        return dp[l1][l2];

    }
}
