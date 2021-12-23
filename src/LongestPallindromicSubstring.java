package practice;

public class LongestPallindromicSubstring {

    public static void main(String[] args) {
//aacabdkacaa
        String s1 = "ccc";
        String s2 = s1;

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        System.out.println(longestPallindromicSubstring(ch1,ch2,s1.length(),s2.length()));
    }

    public static String longestPallindromicSubstring(char[] ch1, char[] ch2, int l1, int l2){


        int dp[][] = new int[l1][l2];
        int maxLength = 1 ;
        String str = "";

        for (int i = 0; i < l1; i++) {
            dp[i][i] = 1;
        }

        int start = 0;
        for (int i = 0; i < l1-1; i++) {
                if(ch1[i]==ch2[i+1]){
                    dp[i][i+1]=1;
                    start = i;
                    maxLength = 2;
                }
        }

        //total_len=6, len=3,i ->0 to 6-3 = 3 and j -> 2 to 5
        for (int len = 3; len <= l1; len++) {
            for (int i = 0; i < l1-len+1; i++) {

                int j = i+len-1;
                if(ch1[i] == ch1[j] && dp[i+1][j-1]==1){
                    dp[i][j] =1;
                    if(len > maxLength){
                        start = i;
                        maxLength = len;
                    }
                }



            }
        }



        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                System.out.print(dp[i][j]+"|");
            }
            System.out.println();
        }

        System.out.println(maxLength);
        return String.valueOf(ch1).substring(start,maxLength+start);

    }


}
