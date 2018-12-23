package practice;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


/*
 
 33333
 32223
 32123
 32223
 33333
 
 for (int k = 0; k < ((2 * n) - 1); k++) {
				for (int l = 0; l < ((2 * n) - 1); l++) {
					cout << 1+max(abs(n-i-1),abs(n-j-1))
				}
 
 
 */

public class Pattern {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		// sc.nextLine();
		// int t= Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = sc.nextInt();

			int a[][] = new int[2 * n - 1][2 * n - 1];
			int i = 0;

			for (i = 0; i < (((2 * n) - 1) / 2) + 1; i++) {

				int j = 0;
				// int digit =n;
				while (j < ((2 * n) - 1)) {

					if (i == 0) {
						a[i][j] = n;
						j++;
					}

					else {

						while (j < i) {
							a[i][j] = a[i - 1][j];
							j++;
						}

						while (j >= i && (2 * n) - 1 - j != i) {
							a[i][j] = a[i - 1][j] - 1;
							j++;
						}

						if ((2 * n) - 1 - j == i) {
							while (j < ((2 * n) - 1)) {
								a[i][j] = a[i - 1][j];
								j++;
							}
						}

					}
				}

			}

			for (int k = i; k < ((2 * n) - 1); k++) {
				for (int l = 0; l < ((2 * n) - 1); l++) {
					a[k][l] = a[((2 * n) - 2 - k)][l];
				}
			}

			for (int l = 0; l < ((2 * n) - 1); l++) {
				for (int m = 0; m < ((2 * n) - 1); m++) {
					System.out.print(a[l][m]);
				}

				System.out.println();
			}

		}

	}

}
