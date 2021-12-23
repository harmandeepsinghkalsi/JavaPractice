package practice;

import java.util.*;
public class IntersectionOfArrays {

        public int[] intersection(int[] arr1, int[] arr2){

            HashSet<Integer> hs = new HashSet<Integer>();
            HashSet<Integer> res = new HashSet<>();
            for(int i: arr1){
                hs.add(i);
            }

            for (int j: arr2){
                if(hs.contains(j)){
                    res.add(j);
                }
            }
            int finalRes[] = new int[res.size()];
            int i = 0;
            for(int ele : res){
                finalRes[i++]=ele;
            }
            return finalRes;
        }

        public static void main(String[] args){
            IntersectionOfArrays obj = new IntersectionOfArrays();
            int arr1[]= new int[]{4,9,5,8,8};
            int arr2[]= new int[]{9,3,8};

            int res[]  = obj.intersection(arr1,arr2);// can use retainAll collection method as well
            for (int i: res){
                System.out.println(i+"");
            }

        }
}
