package practice;

import java.util.Scanner;

public class SubArrayWithGivenSum {
	
	public static void main(String[] args) {
		// 1, 2,3,7,5
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int reqSum = sc.nextInt();
		
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum = 0, startIndex =0, endIndex =0;
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];
			startIndex = i;
			for (int j = i+1; j < arr.length; j++) {
				sum+=arr[j];
				if(sum==reqSum) {
					endIndex = j;
					found=true;
					break;
				}
					
			}
			
			if(found) {
				System.out.print("Start Index = "+(startIndex+1)+" and End Index = "+ (endIndex+1));
				break;
				}
			else
				continue;
				
		}
	}

}

//Sliding window concept can also be used
/*
 * header = 0 ;
 * for i -0 to length-1
 * cur_sum+=arr[i];
 * 
 * while(cur_sum>req_sum){curr_sum-arr[header]; header ++;}
 * if(curr_sum=req_sum), set some flag for indication
 * break;
 * 
 * 
 */
