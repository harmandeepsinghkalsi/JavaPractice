import java.util.Scanner;

public class AllSubstrOfString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
// can also be solved using StringBuilder append method
/*
 * i=0 to str.length
 * create stringbuilder with one char and print it
 * j=0 to str.length
 * append the other characters one by one and print them
 */
