package practice;

import java.io.IOException;
import java.util.Scanner;


//Given a time in the format of hh:mm (12-hour format) 0 < hh < 12, 0 <= mm < 60. The task is to convert it into words

//Input:
//The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two space separated integers 'h' and 'm' denoting hours and minutes respectively.

//Output:
//Output the input time into words.


public class TimeToWords {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		// int t= Integer.parseInt(br.readLine());

		while (t-- > 0) {

				int h = sc.nextInt();
				int m = sc.nextInt();
					
				if(m==0)
					System.out.println(intToData(h)+" o' clock");
				else if(m==30){
					System.out.println("half past "+ intToData(h));
				}else if(m<30)
				{	
					if(m==15)
					System.out.println(intToData(m)+" past "+intToData(h));
					else if(m==1){
					   System.out.println(intToData(m)+" minute past "+intToData(h));
					}
					else
						System.out.println(intToData(m)+" minutes past "+intToData(h));
				}else{
					if(m==45)
						System.out.println(intToData(60-m)+" to "+intToData(h+1));
					else if(m==59){
					   System.out.println(intToData(60-m)+" minute to "+intToData(h+1));
					}
					else
						System.out.println(intToData(60-m)+" minutes to "+ intToData(h+1));
				}
		}
	}
	
	
	
	public static String intToData(int n){
		
		
		switch(n){
		
		
		case 1:
			return "one";
		case 2: 
			return "two";
		case 3: 
			return "three";
		case 4:
			return "four";
		case 5: 
			return "five";
		case 6: 
			return "six";
		case 7:
			return "seven";
		case 8 :
			return "eight";
		case 9 :
			return "nine";
		case 10 :
			return "ten";
		case 11:
			return "eleven";
		case 12:
			return "twelve";
		case 13:
			return "thirteen";
		case 14:
			return "fourteen";
		case 15:
			return "quarter";
		case 16:
			return "sixteen";
		case 17:
			return "seventeen";
		case  18 :
			return "eighteen";
		case 19 :
			return "nineteen";
		case 20 :
			return "twenty";
		case 21:
			return "twenty-one";
		case 22:
			return "twenty-two";
		case 23:
			return "twenty-three";
		case 24: 
			return "twenty-four";
		case 25:
			return "twenty-five";
		case 26:
			return "twenty-six";
		case 27: 
			return "twenty-seven";
		case 28 :
			return "twenty-eight";
		case 29 : 
			return "twenty-nine";
		case 30 :
			return "half";
		
		}
		
		return "";
	}

}
