package practice;

import java.io.IOException;

public class GcdOfNumbers {

	
public static void main(String[] args) throws IOException {
		
		System.out.println(gcd(12,100));
	}
	
	public static int gcd(int a , int b) {
		
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
	}
}

//For array of elements , we can calculate gcd in a loop
/*
	static int findGCD(int arr[], int n) 
    { 
        int result = arr[0]; 
        for (int i = 1; i < n; i++) 
            result = gcd(arr[i], result); 
  
        return result; 
    }
*/