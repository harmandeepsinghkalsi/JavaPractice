package practice;

import java.io.IOException;
import java.util.Scanner;

public class CheckBinaryString {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		// int t= Integer.parseInt(br.readLine());

		while (t-- > 0) {

			// int n =Integer.parseInt(br.readLine());
			String n = sc.next();
			String flag = "yes";
			if (n.length() < 2)
				System.out.println("INVALID");

			for (int i = 0; i < n.length(); i++) {

				if (n.charAt(i) == '1' && i != n.length() - 1) // IF we find 1 and length has not been reached
					{

					i++;
					while (true) {
						if (n.charAt(i) == '0' && i != n.length() - 1) //now we will check if 0 comes up and still we have not reached the length
						{
							i++;
						} else if (n.charAt(i) == '1') // if after one we get another 1 , will check for the previous element
						{

							if (n.charAt(i - 1) == '0') //if previous element if 0
								{
								flag = "no";
								break;
							} else // if previous element is 1
							{
								flag = "dummy";
								break;
							}
						} else // 0 and last element
							{
							flag = "yes";
							break;
						}

					}

					if (flag == "no") {
						System.out.println("INVALID");
						break;
					} else if (flag == "yes") {
						System.out.println("VALID");
						break;
					} else {
						i = i - 1;
						// continue;
					}

				} else if (n.charAt(i) == '0') // if traversing we find 0 , continue simply
					{
					if(i==n.length()-1)
						System.out.println("VALID");
					else
						continue;
					// System.out.println("VALID");
				} else {
					System.out.println("VALID");
				}

			}

		}

	}
}





//Another easy solution for the same problem


//public static void main(String[] args) throws NumberFormatException, IOException {
//	// code
//
//Scanner sc = new Scanner(System.in);
//	// BufferedReader br = new BufferedReader(new
//	// InputStreamReader(System.in));
//	int t = sc.nextInt();
//	// int t= Integer.parseInt(br.readLine());
//
//	while (t-- > 0) {
//
//		// int n =Integer.parseInt(br.readLine());
//		String n = sc.next();
//		String flag = "yes";
//		if (n.length() < 2)
//			System.out.println("INVALID");
//		
//		
//		int i=0,j=n.length()-1;
//		while(i<j) {
//			
//			if(n.charAt(i)!='1'){
//				i++;
//			}
//			if(n.charAt(j)!='1')
//				j--;
//			
//			if(n.charAt(i)=='1'&&n.charAt(j)=='1'){
//				i++;
//				j--;
//				
//				if(n.charAt(i)=='0'|| n.charAt(j)=='0'){
//					
//					flag="no";
//			}
//		}
//
//}
//		
//		if(flag=="yes")
//			System.out.println("VALID");
//		else
//			System.out.println("INVALID");
//	
//}
//
//}



//Another approach to solve the same question 


//public static void main(String[] args) throws NumberFormatException, IOException {
//	// code
//
//Scanner sc = new Scanner(System.in);
//	// BufferedReader br = new BufferedReader(new
//	// InputStreamReader(System.in));
//	int t = sc.nextInt();
//	// int t= Integer.parseInt(br.readLine());
//
//	while (t-- > 0) {
//
//		// int n =Integer.parseInt(br.readLine());
//		String n = sc.next();
//		String flag = "yes";
//		if (n.length() < 2)
//			System.out.println("INVALID");
//		
//		
//		Boolean res =n.matches("(.*1[0]+1.*)+");
//		System.out.println(res);
//	
//}
//
//}
