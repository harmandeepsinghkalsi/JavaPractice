package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Dummy2 {

    public static void main(String[] args) {
         int segmentSize = 2;
         int spaces[] = {8,6,4,2};


        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<=spaces.length-segmentSize; i++) {

            int min = spaces[i];
            int j =i+1;
            while(j-i<segmentSize){
                if(spaces[j]<min){
                    min = spaces[j];
                }
                j++;
            }
            list.add(min);
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)>max){
                max = list.get(i);
            }
        }

        System.out.println(max);

    }
}
