package practice;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.*;

import gvjava.org.json.Test;

public class Dummy {

	public static void main(String[] args) {

		// this is one way , other ways can be checked at geeksforgeeks

		Scanner sc = new Scanner(System.in);
		// |A[i] - A[j]| + |i - j|

		int n = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Logic
		boolean resultNum = false;
		boolean resultNumMinus1 = false;
		boolean resultNumPlus1 = false;
		int operation = 0;

		for (int i = 0; i < arr.length; i++) {
			resultNum = checkNumber(arr[i]);
			if (!resultNum) {
				resultNumMinus1 = checkNumber(arr[i] - 1);
				if (!resultNumMinus1) {
					resultNumPlus1 = checkNumber(arr[i] + 1);
					if (!resultNumPlus1) {
						operation++;
					} else {
						operation++;
					}
				} else {
					operation++;
				}
			}

		}
		
		System.out.println(operation);

	}

	static boolean checkNumber(int number) {
		
		boolean hasDivisor = hasThreeDivisors(number);
			
		return hasDivisor;
	}
	
	
	static boolean hasThreeDivisors(int number){
		
		boolean flag = false;
		
		int squareRoot = (int)Math.sqrt(number);
		
		if(1*squareRoot*squareRoot != number){
			return false;
		}

		
		if(number <=1){
			return false;
		}
		
		for(int i =2; i<number/2;i++){
			if(number%i==0){
				flag = true;
				break;
			}
		}
		
		if(!flag){
			return true;
		}else{
			return false;
		}
	}

}

// public static void matrixChainOrder(int arr[], int n){
//
// int m[][] = new int [n][n];
//
// int bracket[][] = new int[n][n];
//
// for (int i = 0; i <n; i++) {
// m[i][i]=0;
// }
//
//
// for (int L = 2; L<n; L++) {
//
// for (int i = 1; i < n-L+1; i++) {
//
// int j = i+L-1;
// m[i][j]= Integer.MAX_VALUE;
//
// for (int k = i; k< j-1;k++) {
//
// int q = m[i][k]+m[k+1][j]+arr[i-1]*arr[k]*arr[j];
// if(q<m[i][j])
// {
// m[i][j]=q;
// bracket[i][j]=k;
// }
//
// }
// }
// }
//
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// System.out.print(bracket[i][j]);
// }
// System.out.println();
// }
//
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// System.out.print(m[i][j]);
// }
// System.out.println();
// }
//
//
// }
