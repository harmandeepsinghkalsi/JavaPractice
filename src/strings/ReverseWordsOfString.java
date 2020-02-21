import java.util.Scanner;

public class ReverseWordsOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		String[] strArr = str.split(" ");
		String result = "";
		for (int i = 0; i < strArr.length; i++) {
			String temp = strArr[i];
			result+=reverseString(temp)+" ";
		}
		
		System.out.println(result.trim());
	
	}
	
	public static String reverseString(String s) {
		StringBuffer sb = new StringBuffer(s);
		return sb.reverse().toString();
	}
}
