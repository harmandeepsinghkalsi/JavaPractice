package practice;

public class ShortestCommonSupersequence {

    public static void main(String[] args) {

        String s1 = "aaaaaaaa";
        String s2 = "aaaaaaaa";
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        System.out.println(findShortestCommonSupersequence(ch1,ch2, s1.length(),s2.length()));
    }

        // idea is to get the length of the longest common subsequence and return l1+l2-LCS
        // the elements of LCS will be considered once.
        public static int findShortestCommonSupersequence(char[] ch1, char[] ch2, int l1, int l2){
            int lcs = LongestCommonSubsequence.longestCommmonSubsequenceTopDown(ch1,ch2,l1,l2);
            return ch1.length+ch2.length-lcs; // it will have all the characters from s1 and s2 and common elements from both of them
    }
}
