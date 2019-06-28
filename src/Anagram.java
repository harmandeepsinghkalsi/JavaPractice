package practice;

import java.util.Arrays;
import java.util.Scanner;

// Other solution will be use of hashmap
public class Anagram {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(s1.length()!=s2.length())
			System.out.println("Not an anagram");
		else {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			s1 = new String(ch1);
			s2 = new String(ch2);
			
			if(s1.equals(s2))
				System.out.println("It is an anagram");
			else
				System.out.println("Not an anagram");
		}
	}
}
