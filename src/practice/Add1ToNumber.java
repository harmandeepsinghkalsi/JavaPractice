package practice;

import java.io.IOException;
import java.util.Scanner;

public class Add1ToNumber {
	
public static void main(String[] args) throws IOException , NumberFormatException{
		

		Scanner sc = new Scanner(System.in);
		
		int number = 99999997;
		
		// This is one way by 2's complement
		
		//System.out.println(-(~number));
	   
	    // or the other approach is : 
		
		int m = 1;
		
		while((int) (number & m)== m ){
		
		number = number ^ m;
		m <<=1;
		
	}
	
	number = number ^m;
	System.out.println(number);
	

}
}
