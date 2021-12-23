package practice;

import java.util.*;



public class PallindromePartitioning {

    public static void main(String[] args){
        String str = "abba";

        System.out.println(minNumOfPartitionsRecursive(str.toCharArray(), 0, str.length()-1));

    }

    public static int minNumOfPartitionsRecursive(char[] ch, int start, int end){

        // if string is empty or there is only one char , then no partition is needed, so return 0
        if(start>=end)
            return 0;

        if(checkIfPallindrome(String.valueOf(ch), start , end))
            return 0;

        int min = Integer.MAX_VALUE;

        for (int k = start; k < end; k++) {

            int temp = minNumOfPartitionsRecursive(ch,start,k)
                    + minNumOfPartitionsRecursive(ch, k+1, end) + 1;

            if(temp < min){
                min = temp;
            }
        }
        return min;
    }

    public static boolean checkIfPallindrome(String input, int i , int j){


        while(i<j){
            if (input.charAt(i) != input.charAt(j))
                return false;
                i++;
                j--;

        }
        return true;
    }


}
