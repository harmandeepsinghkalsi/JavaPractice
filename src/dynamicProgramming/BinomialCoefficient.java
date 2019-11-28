package dynamicProgramming;

import java.util.Scanner;

public class BinomialCoefficient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// expression power (1+x)^n
		int k = sc.nextInt(); // x^k

		BinomialCoefficient bc = new BinomialCoefficient();
		System.out.println(bc.recursiveBinomialCoeff(n, k));
		System.out.println(bc.dpBinomialCoeff(n,k));
		System.out.println(bc.spaceOptBiCoeff(n, k));

	}
//Recursive method
	 int recursiveBinomialCoeff(int n, int k) {
		
		if(k==0||k==n) {
			return 1;
		}
		
		
		return recursiveBinomialCoeff(n-1, k-1) +recursiveBinomialCoeff(n-1, k);

	}
	 
	// DP Approach
	 
	 int dpBinomialCoeff(int n , int k) {
		 
		 int c[][] = new int[n+1][k+1];
		 
		 for (int i = 0; i <=n; i++) {
			
			 for (int j = 0; j <=Math.min(i,k); j++) {
				
				 if(j==0||j==i) {
					 c[i][j]=1;
				 }
				 
				 else {
					 c[i][j]=c[i-1][j-1]+c[i-1][j];
					 
				 }
			}
		}
		 
		 return c[n][k];
	 }
	 
	 //Space Optimized approach
	 
	 int spaceOptBiCoeff(int n , int k ) {
		 
		 int c[]= new int[k+1];
		 c[0]=1;//nC0
		 
		 for (int i = 1; i <=n; i++) {
			 for (int j=Math.min(i, k);j>0; j--) {
				
				 c[j]=c[j]+c[j-1];
			}
		}
		 return c[k];
	 }
	 

}
