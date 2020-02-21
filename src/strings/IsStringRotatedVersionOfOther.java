import java.util.Scanner;

public class IsStringRotatedVersionOfOther {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String strA = sc.nextLine();
		
		if(str.length()!= strA.length()) {
			System.out.println("String strA is not rotated version of str");
		} else {
			String temp = str+str;
			if(temp.contains(strA)) {
				System.out.println("String strA is rotated version of str");
			} else {
				System.out.println("String strA is not rotated version of str");
			}
		}
	}
}
