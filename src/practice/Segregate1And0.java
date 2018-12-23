package practice;

import java.io.IOException;
import java.util.Scanner;

public class Segregate1And0 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		// int t= Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = sc.nextInt();
			
			int arr []= new int[n];
			int oneCount=0;
			
			for (int i = 0; i <n; i++) {
				arr[i]=sc.nextInt();
				if(arr[i]==1)
					oneCount++;
			}
			
			int zeroCount=n-oneCount;
			
			for (int i = 0; i < n; i++) {
				if(oneCount==0)
					System.out.print("0" + " ");
				else if(zeroCount==0)
					System.out.print("1" +" ");
				else
				{
					if(i<zeroCount)
						System.out.print("0"+" ");
					else
						System.out.print("1"+" ");
				}
			}
			
			System.out.println();
			
		}
	}

}
