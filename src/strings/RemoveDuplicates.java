package strings;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		while (t-- > 0) {
			
			String s = sc.nextLine();
			
			for(int i =0;i<s.length();i++) {
				
				if(i!=s.indexOf(s.charAt(i))) {
					String prev = s.substring(0,i);
					String next =s.substring(i+1,s.length());
					s=prev.concat(next);
					i--; // Because we removed one character
				}
				
			}
			
		System.out.println(s);
		}
	}

}
