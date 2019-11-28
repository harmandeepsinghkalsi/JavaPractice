package practice;

import java.util.ArrayList;
import java.util.Scanner;
// This logic is for multiple sets of the buying and selling . If we want only one , then we can use approach 2.
public class StockBuySellProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int price[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			price[i]=sc.nextInt();
		}
		// Approach 1:
		ArrayList<Interval> al = new ArrayList<>();
		
		int i =0, count=0;
		
		while(i<n-1) {
			
			//find local minima
			while(i<n-1 && price[i+1]<=price[i])
				i++;
			
			if(i==n-1)
				break;
			
			Interval interval = new Interval();
			interval.buy = i++;
			
			
			while(i<n && price[i]>=price[i-1])
				i++;
			
			interval.sell = i-1;
			al.add(interval);
			
			count++;
		}
		
		if(count==0) {
			System.out.println("No stock to buy and sell");
		} else {
			for (int j = 0; j < count; j++) {
				System.out.println(al.get(j).buy + " " + al.get(j).sell);
			}
		}
		
	}

}

class Interval {
	int buy;
	int sell;
}

//Approach 2:

// We need to find the minimum element and max difference .
/*
 * int minDiff = arr[1]-arr[0];
 * int minElement = arr[0];
 * 
 * for(int i=1;i<n;i++){
 * 
 * if(arr[i]-minElement > maxDiff )
 * maxDiff = arr[i]-minElement;
 * 
 * if(arr[i]<minElement)
 * minElement = arr[i];
 */
