
package codingTest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WhoGetsTheCatch {

	static int whoGetsTheCatch(int n, int x, int[] X, int[] V) {

		

//		int minTime = 0, index = 0,count=0;
//		int time[] = new int[n];
//
//		int dist = Math.abs(X[0] - x);
//		time[0] = dist / V[0];
//		minTime = time[0];
//		for (int i = 1; i < n; i++) {
//			
//			dist = Math.abs(X[i] - x);
//			time[i] = dist / V[i];
//
//			if (time[i] < minTime) {
//				minTime = time[i];
//				index = i;
//			} else if (time[i] == minTime) {
//				
//				count++;
//			}
//
//		}
//
//		
//		return index;
		
		
		int tim = 1000000000;
	    int cnt = 0, val=0;;
	    for (int i = 0; i < n; i++) {
	        int cand = Math.abs(x - X[i]) / V[i];
	        if (cand < tim) { tim = cand; cnt = 0; }
	        if (cand == tim) { cnt++; val = i; }
	    }
	    return cnt > 1? -1: val;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Return the index of the catcher who gets the catch, or -1 if no one
		// gets the catch.
		int n = in.nextInt();
		int x = in.nextInt();
		int[] X = new int[n];
		for (int X_i = 0; X_i < n; X_i++) {
			X[X_i] = in.nextInt();
		}
		int[] V = new int[n];
		for (int V_i = 0; V_i < n; V_i++) {
			V[V_i] = in.nextInt();
		}
		int result = whoGetsTheCatch(n, x, X, V);
		System.out.println(result);
	}
}
