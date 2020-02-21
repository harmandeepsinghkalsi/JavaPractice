import java.util.Scanner;

public class RevStringRecursively {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		RevStringRecursively obj = new RevStringRecursively();
		String result = obj.reverseString(str);
		System.out.println(result);
		
	}
	
	public String reverseString(String s) {
		
		if(s==null || s.length()==1)
			return s;
		
		return reverseString(s.substring(1))+s.charAt(0);
	}
}
