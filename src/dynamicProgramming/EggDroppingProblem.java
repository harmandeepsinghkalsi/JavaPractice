package dynamicProgramming;

import java.util.Scanner;

public class EggDroppingProblem {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int eggs = sc.nextInt();
		int floor = sc.nextInt();
		
		int eggFloor[][] = new int[eggs+1][floor+1];
		int res ;
		for (int i = 1; i < eggs; i++) {
			eggFloor[i][0]=0;
			eggFloor[i][1]=1;
		}
		
		for (int j = 0; j < floor; j++) {
			eggFloor[1][j]=j;
		}
		
		for(int i=2;i<=eggs;i++) {
			for(int j =2;j<=floor;j++) {
				
				eggFloor[i][j]= Integer.MAX_VALUE;
				for(int x =1;x<=j;x++) {
					res = 1+Math.max((eggFloor[i-1][x-1]),(eggFloor[i][j-x]));
					if(res<eggFloor[i][j])
						eggFloor[i][j]=res;
				}
			}
		}
		
		System.out.println(eggFloor[eggs][floor]);
		
	}

}
