package practice;

public class LongestCommonSubstring {
    public static void main(String[] args) {

        String s1 = "OldSite:GeeksforGeeks.org";
        String s2 = "NewSite:GeeksQuiz.com";
        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        System.out.println(longestCommonSubstring(ch1,ch2,s1.length(),s2.length()));

    }

    public static int longestCommonSubstring(char[] ch1, char[] ch2, int l1, int l2){

        int dp[][] = new int[l1+1][l2+1];
        int result = 0, row = 0, col = 0;
        String str = "";
        for (int i = 1; i < l1+1; i++) {
            for (int j = 1; j < l2+1; j++) {

                if(ch1[i-1] == ch2[j-1]){
                    dp[i][j] = 1+ dp[i-1][j-1];
                    if(dp[i][j]>result) {
                        result = dp[i][j];
                        row = i;
                        col = j;
                    }
                } else {
                    dp[i][j] = 0;
                }

            }
        }

//        for (int i = 0; i < l1+1; i++) {
//            for (int j = 0; j < l2+1; j++) {
//                System.out.print(dp[i][j]+"|");
//            }
//            System.out.println();
//        }

        //Print the longest common substring

        while(dp[row][col]!=0){
            str = str + ch1[row-1];
            row--;
            col--;
        }

        System.out.println(new StringBuilder(str).reverse().toString());
        return result;

    }
}
