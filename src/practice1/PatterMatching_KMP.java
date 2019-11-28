package practice;

import java.util.Scanner;

public class PatterMatching_KMP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		String pattern = sc.next();

		for (int i = 0; i <= text.length() - pattern.length(); i++) {
			int j = 0;
			for (j = 0; j < pattern.length(); j++) {
				if(text.charAt(i+j) != pattern.charAt(j))
					break;
			}
			
			if(j==pattern.length())
				System.out.println("Pattern found at index " + i);
		}
	}

}
