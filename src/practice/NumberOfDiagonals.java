package practice;

import java.io.IOException;
import java.util.Scanner;

public class NumberOfDiagonals {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		// int t= Integer.parseInt(br.readLine());

		while (t-- > 0) {

			// int n =Integer.parseInt(br.readLine());
			int n = sc.nextInt();
			int res=0;
			if(n%2==0){
				
				
				res = (n*(n/2-1))-n/2;
			}
			
			else{
				res =(n*(n/2-1));
			}
			
			System.out.println(res);

	}
}
	
}
