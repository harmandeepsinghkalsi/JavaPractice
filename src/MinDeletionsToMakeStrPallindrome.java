package practice;

// Idea is to get the Longest Pallindromic Seq from string and its reverse and return total string length
// minus the LPS , which will be number of deletions needed to make str pallindrome
public class MinDeletionsToMakeStrPallindrome {

    public static void main(String[] args) {

        String s1 = "abefbac";
        String s2 = "";
        StringBuilder sb = new StringBuilder(s1);
        s2 = sb.reverse().toString();

        System.out.println(minDeletions(s1,s2));

    }

    public static int minDeletions(String s1, String s2){
        int lcs = LongestCommonSubsequence.longestCommmonSubsequenceTopDown(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());
        return s1.length()-lcs;
    }
}
