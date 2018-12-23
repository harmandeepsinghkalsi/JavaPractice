package practice;

import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class FirstLetterCaptialOfAllWordInString {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		sc.nextLine();
		// int t= Integer.parseInt(br.readLine());

		while (t-- > 0) {
			
			
			String s ;
			s = sc.nextLine();
			
			char ch[] = s.toCharArray();
				
			
			for (int i = 0; i < ch.length; i++) {
				
				if(i==0 && Character.isLowerCase(ch[i]))
					ch[i]= Character.toUpperCase(ch[i]);
				else if(i+1!=ch.length  && ch[i]==' '&& Character.isLowerCase(ch[i+1]))
					ch[i+1]=Character.toUpperCase(ch[i+1]);
				
			}
			
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch[i]);
			}
			
			System.out.println();
			
			
		}
			
	}
	
	
	

	

}
