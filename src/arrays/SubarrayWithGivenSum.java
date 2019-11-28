package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int totalSum = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			findSubArr(arr,n,totalSum);
		}
			

//			int currSum = 0, start = 0;
//			int i = 0,end =i;
//			boolean found = false;
//			while (i < arr.length) {
//
//				currSum = currSum + arr[i];
//				
//				if (currSum == totalSum) {
//					found = true;
//					System.out.print((start + 1) + " " + (i + 1));
//					break;
//				} else if (currSum > totalSum) {
//					currSum=0;
//					i = start = start+1;
//				} else {
//					i++;
//				}
//			}
//			
//			if(!found) {
//				System.out.print("-1");
//			}
//			
//			System.out.println();
//		}
	}



 public static void findSubArr(int arr[],int n,int sum) {
	int cur_sum = 0; 
        int start = 0; 
        int end = -1; 
        HashMap<Integer, Integer> hashMap = new HashMap<>(); 
  
        for (int i = 0; i < n; i++) { 
            cur_sum = cur_sum + arr[i]; 
            //check whether cur_sum - sum = 0, if 0 it means 
            //the sub array is starting from index 0- so stop 
            if (cur_sum - sum == 0) { 
                start = 0; 
                end = i; 
                break; 
            } 
            //if hashMap already has the value, means we already  
            // have subarray with the sum - so stop 
            if (hashMap.containsKey(cur_sum - sum)) { 
                start = hashMap.get(cur_sum - sum) + 1; 
                end = i; 
                break; 
            } 
            //if value is not present then add to hashmap 
            hashMap.put(cur_sum, i); 
  
        } 
        // if end is -1 : means we have reached end without the sum 
        if (end == -1) { 
            System.out.println("No subarray with given sum exists"); 
        } else { 
            System.out.println("Sum found between indexes " 
                            + start + " to " + end); 
        } 
       }
}
