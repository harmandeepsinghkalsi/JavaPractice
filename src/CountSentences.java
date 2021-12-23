package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Dummy {

    public static void main(String[] args) {

        String wordSet[] = {"listen","silent","it","is"};
        String sentences[]  ={"listen it is silent"};

        System.out.println(countSentences(wordSet,sentences));
    }

    public static int[] countSentences(String[] wordsSet, String[] sentences){

        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < wordsSet.length; i++) {
            ArrayList<String> al = new ArrayList<>();
            for (int j = 0; j < wordsSet.length; j++) {
                if(i!=j) {
                    boolean isAnagram = checkIfAnagram(wordsSet[i], wordsSet[j]);
                    if (isAnagram) {
                        al.add(wordsSet[j]);
                        map.put(wordsSet[i], al);
                    }
                }
            }
        }

        int[] result= new int[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            String words[] = sentences[i].split(" ");
            int tempResult = 0;
            for (int j = 0; j < words.length; j++) {
                if(map.containsKey(words[j])){
                    List<String> list = map.get(words[j]);
                    tempResult+=list.size()+1;
                }
            }
            result[i] = tempResult;
        }
        return result;
    }

    public static boolean checkIfAnagram(String a , String b){


        if (a.length() != b.length())
            return false;

        char ch1[] = a.toCharArray();
        char ch2[] = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(String.valueOf(ch1).equals(String.valueOf(ch2)))
            return true;
        else
            return false;

    }
}
