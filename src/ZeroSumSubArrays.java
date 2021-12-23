package practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Pair{

    public int first,second;
    Pair(int first, int second){
        this.first=first;
        this.second = second;
    }
}
public class ZeroSumSubArrays {
    public static void main(String[] args) {
        //6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7
        int arr[] ={2,3,-1,2,-2,-4};
        List<Pair> subarrays = getZeroSumSubArrays(arr);
        for (Pair p :
                subarrays) {
            System.out.println("Subaary from " + p.first + " to " +p.second);
        }

    }

    static List<Pair> getZeroSumSubArrays(int arr[]){

        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        List<Pair> result = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum+=arr[i];
            if(sum==0){
                result.add(new Pair(0,i));
            }

            ArrayList<Integer> list = new ArrayList<>();

            if(map.containsKey(sum)){

                list = map.get(sum);
                for (int j = 0; j < list.size(); j++) {
                    int ele = list.get(j);
                    result.add(new Pair(ele+1,i));
                }
            }
            list.add(i);
            map.put(sum,list);

        }

        return result;
    }
}
