package strings;

import java.util.Scanner;

public class CheckRotatedStrings {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    String a = sc.next();
		    String b = sc.next();
		    
		    String temp1 = a.substring(2,a.length())+a.substring(0,2);
		    String temp2 = a.substring(a.length()-2,a.length())+a.substring(0,a.length()-2);
		    
		    if(temp1.equals(b) || temp2.equals(b)) {
		    	System.out.println("1");
		    } else {
		    	System.out.println("0");
		    }
		    
		}
	}
}
