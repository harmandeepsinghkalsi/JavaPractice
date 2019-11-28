package arrays;

import java.util.Scanner;

public class EquilibriumPoint {

	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int sum = 0;

			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				sum+=arr[i];
			}
			
			int leftSum =0,i=0;
			for(i =0;i<n;i++){
			    sum-=arr[i];
			    if(leftSum==sum){
			        System.out.println(i+1);
			        break;
			    }
			    leftSum+=arr[i];
			    
			}
			
			if(i==arr.length){
			    System.out.println("-1");
			}
			
		}
	}

}
