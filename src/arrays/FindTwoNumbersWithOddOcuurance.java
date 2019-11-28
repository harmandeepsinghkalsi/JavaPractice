package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class FindTwoNumbersWithOddOcuurance {
	
	
	// In array we have to find two number which appear only once and rest elements appear twice.
	// 1. Approach1: I could think of using hashMap and solve this.
	// 2. Approach 2: Trick is using XOR , because a^a =0 and a^b=1 and hence we can easily find out the odd numbers
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    HashMap<Integer,Integer> hm = new HashMap<>();
		    for(int i=0;i<n;i++){
		        arr[i]=sc.nextInt();
		        if(hm.containsKey(arr[i])){
		            int freq = hm.get(arr[i]);
		            hm.put(arr[i], ++freq);
		        } else {
		            hm.put(arr[i],1);
		        }
		    }
		    
		    FindTwoNumbersWithOddOcuurance obj = new FindTwoNumbersWithOddOcuurance();
		    obj.findOddOccuranceApproach2(arr);
		    
		    int number = 0;
		    for(int i: hm.keySet()){
		        if(hm.get(i)%2!=0)
		        	if(number !=0) {
		        		if(i>number) {
		        			System.out.print(i+" "+ number);
		        		} else {
		        			System.out.print(number+" "+i);
		        		}
		        	} else {
		        		number = i;
		        	}
		    }
		
	}
	
	public void findOddOccuranceApproach2(int arr[]){
		
		int xor =0;
		
		for (int i = 0; i < arr.length; i++) {
			xor=xor^arr[i];
		}
		
		int x=0 , y=0;
		
		// rightmost set bit
		int set_bit = xor & ~(xor-1);
		
		for (int i = 0; i < arr.length; i++) {
			
			if((arr[i]&set_bit)>0)
			{
				x=x^arr[i];
			} else {
				y=y^arr[i];
			}
		}
		
		System.out.println("Optimized Method using Xor output is: " +x+" "+y);
	}

}
