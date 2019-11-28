package strings;

import java.util.Scanner;

public class ReverseWordsOfString {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0){
		    String s = sc.next();
		    String strArr[] =s.split("\\.");
		    
		    for(int i=0,j=strArr.length-1;i<j;i++,j--){
		        String temp = strArr[i];
		        strArr[i]=strArr[j];
		        strArr[j]=temp;
		    }
		    
		    System.out.println(String.join(".", strArr));
		}
	}

}
