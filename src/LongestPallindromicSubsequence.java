package practice;


public class LongestPallindromicSubsequence {

    public static void main(String[] args) {

        String s1 = "BBABCBCAB";
        String s2 =  "";
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        s2 = sb.toString();

        int res[][] = PrintLongestCommonSubsequence.longestCommmonSubsequenceTopDown(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());
        PrintLongestCommonSubsequence.printLongestCommonSubsequence(s1.toCharArray(),s2.toCharArray(),res);

    }
}
