package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateAnArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		// This is one method . Other methods are running loop skip number of times and move one by one
		//THird method is juggling method based on gcd on skip and no of array elements
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- >0) {
			int n = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String[] strs = str.trim().split("\\s+");
			int skip = Integer.parseInt(br.readLine());
			int[] arr = new int[strs.length];
			int co = 0;
			for (String x : strs) {
				arr[co] = Integer.parseInt(x);
				co++;
			}
			
			
			for (int i = 0; i < arr.length-skip; i++) {
				
				System.out.print(arr[i+skip]+ " ");
				
			}
			
			int j = arr.length-skip;
			for (int i = 0; i < skip; i++) {
				System.out.println((arr[i]+" "));
				j++;
			}
				
			System.out.println();
			
		}
	}

}


/*
Juggling method 

1. Calculate the gcd of n ,d ;
2. for loop till gcd

temp = arr[i];
j=i;
4. Run a while loop (infinte)

while(true)
{
	k=j+d;
	
	if(k>=n){
	k=k-n;}
	if(k==i){
		break;
	}
	arr[j]=arr[k];
	j=k;
	
	
}
arr[j]= temp;

*/

/*
Reversal algorithm for array rotation 
1. Left rotation:

Suppose A and B are teo parts of an array . A = 0 to skip-1 and B = skip to n-1
reverse A to make  Ar
Reverse B to make Br
Reverse new array full 

2. Right rotation

Reverse full array
left reverse left part and right part , considering skip as center

*/