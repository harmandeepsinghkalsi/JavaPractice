package practice;

import java.util.Scanner;

//You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

public class InfinteGridMinSteps {

public static void main(String[] args) {
		
		// this is one way , other ways can be checked at geeksforgeeks

		Scanner sc = new Scanner(System.in);
		
		int a [] = {0,-1,-1,2,5,2,2}; // x axis
		int b[] = {0,2,4,3,8,3,2}; // y axis
		
		int i =0;
		int minSteps = 0;
		
		while(i<a.length-1){
			
			int x = a[i];
			int y = b[i];
			
			int x1= a[i+1];
			int y1= b[i+1];
			
			int dx = Math.abs(x-x1);
			int dy = Math.abs(y-y1);
			
			minSteps += Math.max(dx, dy);
			
			i++;
		}
		
		System.out.println(minSteps);
		
		
	}
}
