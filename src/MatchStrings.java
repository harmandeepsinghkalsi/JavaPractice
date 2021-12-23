package practice;

import java.util.ArrayList;
import java.util.Scanner;

class MatchingStrings{
    String str1;
    String str2;
    String result;

}

// problem is you will be given two string , it char at same index match mark it as . else *
public class MatchStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<MatchingStrings> list = new ArrayList<>();
        while(t -- > 0){

            MatchingStrings matchingStrings = new MatchingStrings();
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            matchingStrings.str1 = str1;
            matchingStrings.str2 = str2;
            //Logic
            int i=0;
            StringBuilder res = new StringBuilder();
            while(i<str1.length()){
                if(str1.charAt(i) == str2.charAt(i)){
                    res.append(".");
                } else{
                    res.append("*");
                }
                i++;
            }
            matchingStrings.result = res.toString();
            list.add(matchingStrings);
        }

        for (int i = 0; i < list.size(); i++) {
            MatchingStrings matchingStrings = list.get(i);
            System.out.println(matchingStrings.str1);
            System.out.println(matchingStrings.str2);
            System.out.println(matchingStrings.result);
            System.out.println();
        }

    }
}
