package practice;

// find minimum number of insertion and deletion to make string B from string A
// Concept uses LCS as String A ->(no of deletion) LCS -> (number of insertions) String B
public class MinInsDelStrAToStrB {

    public static void main(String[] args) {

        String s1 = "cockpit";
        String s2 = "pit";

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        int res[] = minInsertionAndDeletionToMakeStrBFromStrA(ch1,ch2,s1.length(),s2.length());
        System.out.println("Minimum insertion needed: "+ res[0]);
        System.out.println("Minimum deletion needed: "+ res[1]);

    }

    public static int[] minInsertionAndDeletionToMakeStrBFromStrA(char ch1[], char ch2[], int l1, int l2){

        int dp[][] = new int[l1+1][l2+1];

        for (int i = 1; i < l1+1; i++) {
            for (int j = 1; j < l2+1; j++) {

                if(ch1[i-1]==ch2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                } else {
                    dp[i][j] = Integer.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

//        for (int i = 0; i < l1+1; i++) {
//            for (int j = 0; j < l2+1; j++) {
//                System.out.print(dp[i][j]+"|");
//            }
//            System.out.println();
//        }

        int lcs = dp[l1][l2];
        int res[] = new int[2];
        res[0] = ch2.length - lcs; // number of insertions
        res[1] = ch1.length - lcs; // number of deletions
        return res;
    }
}
