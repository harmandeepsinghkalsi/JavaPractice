import java.util.Scanner;

//make string pallindrome by removing atmost one character
public class PallindromeString {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		makePallindrome(str);
	}
	
	// Solution by me
	public static void makePallindrome(String s) {
		
		int i = 0;
		int j = s.length()-1;
		int count = 0;
		
		while(i<=j) {
			if(s.charAt(i)== s.charAt(j)) {
				i++;
				j--;	
			} else {
				
				if(i==j-1) {
					count+=1;
					i++;
					j--;
				} else {
					if(s.charAt(i+1)==s.charAt(j)) {
						i++;
						count++;
					} else if (s.charAt(i)==s.charAt(j-1)) {
						j--;
						count++;
					} else {
						count=2;
						break;
					}
				}
				
			}
		}
		
		if(count<=1) {
			System.out.println("Can be made pallindrome");
		} else if(count>1) {
			System.out.println("Not possible to make pallindrome");
		}
		
	}

}



//public boolean validPalindrome(String s) {
//    int i = 0, j = s.length()-1;
//    while(i < j) 
//        if(s.charAt(i) == s.charAt(j)) { i++; j--; }
//        else return isPalindrome(s, i, j-1) || isPalindrome(s, i+1, j);     
//    return true;
//}
//
//private boolean isPalindrome(String s, int i, int j) {
//    while(i < j)
//        if(s.charAt(i++) != s.charAt(j--)) return false;
//    return true;
//}