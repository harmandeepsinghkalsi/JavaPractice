package practice;

import java.io.IOException;
import java.util.Scanner;




/*Given a array, write a program to construct a triangle where last row contains elements of given array, every element of second last row contains sum of below two elements and so on.

Example:
Input: arr[] = {4, 7, 3, 6, 7};
Output:
81
40 41
21 19 22
11 10 9 13
4 7 3 6 7

*/

public class SumTriangleArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		// int t= Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = sc.nextInt();
			int temp =n;
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
					arr[i]=sc.nextInt();
			}

			int res[][] = new int[n][];
			for (int i = n - 1; i >= 0; i--) {
				res[temp-1]= new int[i+1];
				if (i == n - 1) {
					for (int j = 0; j < n; j++) {

						res[i][j] = arr[j];
					}
				} else {
					for (int j = 0; j <temp; j++) {

						res[i][j] = res[i+1][j]+res[i+1][j+1];
					}
				}
				
				temp--;
			}
			
			int sum = n*(n+1)/2;
			int k =0;
			int finalRes[] = new int [sum];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < i+1; j++) {
					
					
						finalRes[k]=res[i][j];
						k++;
					
				}
			}
			
			for (int i = 0; i < finalRes.length; i++) {
				System.out.print(finalRes[i]+ " ");
			}
			

		}
	}

}
