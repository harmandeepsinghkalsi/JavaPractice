package practice;

import java.util.Arrays;

//Element appearing > n/2 times in an array -- we can use map as well , but below diff approach
public class MajorityElement {

    public static void main(String[] args) {

        int arr[] = {2,2,3,4,2,2,2,6};
        int count =0,ele = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele){ // if ele occurs again , we will increase count
                count++;
            }else{ // we decrease the count , if some other element
                count--;
            }

            if(count==0){ // if the count reaches zero, we pick up the element at that index, look for it
                ele=arr[i];
                count=1;
            }
        }

        count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele){
                count++;
            }
        }

        if(count > arr.length/2){
            System.out.println(ele);
        } else {
            System.out.println(-1);
        }
    }
}
