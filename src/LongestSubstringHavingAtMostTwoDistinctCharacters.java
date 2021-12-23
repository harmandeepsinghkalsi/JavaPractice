package practice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringHavingAtMostTwoDistinctCharacters {

    public static void main(String[] args) {

        String s = "abcabcabc";
        System.out.println(lengthOfSubstringHavingTwoDistinctCharacters(s));
    }

    public static int lengthOfSubstringHavingTwoDistinctCharacters(String s){

        int start = 0,end = 0;
        int maxLength = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i),i);
            if(map.size()>2){
                int minIndex = removeOldestEntryFromMap(map);
                start = minIndex+1;
            }
            end++;

            if(end-start > maxLength)
                maxLength=end-start;
        }

        return maxLength;
    }

    public static int removeOldestEntryFromMap(Map<Character,Integer> map){

        Map.Entry<Character,Integer> min = null;
        for (Map.Entry<Character, Integer> entry :
                map.entrySet()) {
            if(min == null || entry.getValue() < min.getValue()){
                min = entry;
            }
        }
        map.remove(min.getKey());
        return min.getValue();
    }
}
