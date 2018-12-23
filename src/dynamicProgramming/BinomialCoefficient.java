package dynamicProgramming;

import java.math.BigInteger;
import java.util.Scanner;

//Following are common definition of Binomial Coefficients.
//1) A binomial coefficient C(n, k) can be defined as the coefficient of X^k in the expansion of (1 + X)^n.
//
//2) A binomial coefficient C(n, k) also gives the number of ways, disregarding order, that k objects can be chosen from among n objects; more formally, the number of k-element subsets (or k-combinations) of an n-element set

public class BinomialCoefficient {

	public static void main(String[] args) {
		// code

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int r = sc.nextInt();

			int result = binomialCoefficient(n, r);

			System.out.println(result);
		}
	}

	// Space and time optimized result
	// public static int binomialCoefficient(int n , int r){
	//
	// int C[]= new int [r+1];
	// C[0]=1;
	//
	// for (int i = 1; i <=n; i++) {
	//
	// for (int j = min(i,r); j>0; j--) {
	// C[j]=C[j]+C[j-1];
	// }
	// }
	//
	//
	// return C[r];
	// }

	// not space optimized solution

	//
	// // Returns value of Binomial Coefficient C(n, k)
	//
	//
	//
	static int binomialCoefficient(int n, int k) {
		int C[][] = new int[n + 1][k + 1];
		int i, j;
		// Calculate value of Binomial Coefficient in bottom up manner
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= min(i, k); j++) {
				// Base Cases
				if (j == 0 || j == i)
					C[i][j] = 1;

				// Calculate value using previosly stored values
				else
					C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
			}
		}
		return C[n][k];
	}

	public static int min(int i, int r) {
		// TODO Auto-generated method stub

		if (i > r)
			return r;
		else
			return i;
	}

}

// For calculating the factorial of big integers.

// public static BigInteger fact(int n){
//
// BigInteger result = new BigInteger("1");
// int x;
// for (x=1; x<=n; x++) {
// result = result.multiply(new BigInteger(""+x));
// }
// return result;
// }

// public static void fact(int num){
//
//
// int max=Short.MAX_VALUE;
// int res[] = new int [max];
// int res_size=1;
// res[0]=1;
// for (int x = 2; x <=num; x++) {
//
// res_size=multiply(res,x,res_size);
//
//
// }
//
//
// StringBuilder strNum = new StringBuilder();
// System.out.print("Factorial of "+ num+ "is: ");
// for (int i=res_size-1; i>=0; i--)
// {
// strNum.append(res[i]);
// }
//
// long finalInt = Long.parseLong(strNum.toString());
// BigInteger.valueOf(finalInt);
// //System.out.println(finalInt);
//
//
// }
//
//
// public static int multiply(int[] res, int x, int res_size) {
// // TODO Auto-generated method stub
//
//
// int carry =0;
// for (int j = 0; j < res_size; j++) {
//
// int prod = res[j]*x+carry;
// res[j]= prod%10;
// carry=prod/10;
//
// }
//
// while(carry>0){
//
// res[res_size]=carry%10;
// carry=carry/10;
// res_size++;
// }
//
//
// return res_size;
// }
