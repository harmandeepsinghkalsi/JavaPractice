package practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 20, 15, 25};
        int k = 3;
        System.out.println(k + " smallest element : " + findKthSmallestElement(arr, k));
    }

    public static int findKthSmallestElement(int arr[], int ele) {

        if(ele<1 || ele>arr.length){
            return -1;
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }
        System.out.println(minHeap);
        int res = Integer.MIN_VALUE;
        int len = minHeap.size();

        for (int i = 0; i < len; i++) {
            if (i == ele - 1) {
                res = minHeap.poll();
                break;
            }

            minHeap.poll();
            System.out.println(minHeap);
        }
        return res;
    }

}
