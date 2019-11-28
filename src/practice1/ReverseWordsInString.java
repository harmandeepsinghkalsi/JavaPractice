package practice;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String strArr[] = str.split("\\.");
		
		String result = "";
		
		for (int i = strArr.length-1; i >=0 ; i--) {
			result+=strArr[i]+".";
		}
		
		System.out.println(result.substring(0,result.length()-1));
	}
}
