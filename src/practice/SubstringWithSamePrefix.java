package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class SubstringWithSamePrefix {
	
	// this is one way , other ways can be checked at geeksforgeeks
	
	
	/*
	 * 
	 * 0-0a
	0-1ab
	0-2abc
	0-3abcd
	0-4abcda
	0-5abcdac
	4-4a
	4-5ac
	[a, ab, abc, abcd, abcda, abcdac, a, ac]
	 * 
	 */

public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	// |A[i] - A[j]| + |i - j|

	String s = "abcdac";
	ArrayList<String> al = new ArrayList<>();
	 
	for (int i = 0; i <s.length(); i++) {
		if(s.startsWith(s.charAt(i)+"")){
		for (int j = i; j < s.length(); j++) {
			if(i==j){
				System.out.println(i + "-" +j+ s.charAt(i));
				
					al.add(s.charAt(i)+"");
				
			}
			else{
			System.out.println(i + "-" +j+ s.substring(i, j+1));
			
				al.add(s.substring(i, j+1));
			
			}
		}
	}
	}
	
	//System.out.println(Integer.valueOf('d')-96);
	System.out.println(al);

 }
	
}
	


