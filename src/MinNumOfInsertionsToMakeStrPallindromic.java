package practice;

// This is similar to get the min no of deletions
public class MinNumOfInsertionsToMakeStrPallindromic {

    public static void main(String[] args) {

        String s = "aebcbda";
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();

        int minInsertions = MinDeletionsToMakeStrPallindrome.minDeletions(s,s2);
        System.out.println(minInsertions);
    }
}
