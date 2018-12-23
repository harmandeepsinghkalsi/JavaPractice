package practice;

import java.util.Scanner;

public class EleHavSumEqToNum {
		public static void main(String args[])
		{
//			Scanner sc=new Scanner(System.in);
//			
//			int tc= sc.nextInt();
//			int arr[]={};
//			for (int i = 1; i <= tc; i++) {
//				int n= sc.nextInt();
//				 arr=new int[n];
//				int sum=sc.nextInt();
//				
//				for (int j = 0; j <n; j++) {
//					arr[j]=sc.nextInt();
//				}
//			}
//			System.out.println(arr[1]);
			int ans=fun(3);
			  System.out.println(ans) ;
			  
			
		}
		
		
		public static int fun(int n)
		{
			if(n==4)
			{
				return n;
			}
			else {
				return n*fun(n+1);
			}
		}
}
