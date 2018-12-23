// No. of Divisors are odd in case of perfect squares only and for rest all it is even.

package practice;

import java.io.*;

public class CheckIfDoorOpenOrClose {
		
	public static void main(String [] args) throws NumberFormatException, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//To check if the no. of divisors are odd or even 
		//		int t=Integer.parseInt(br.readLine());
//		int count=0;
//		
//		while(t-->0){
//			int n= Integer.parseInt(br.readLine());
//			count=0;
//		for (int i = 1; i <=(int)Math.sqrt(n) ; i++) {
//			if(n%i==0){
//				 
//				count+= (n/i == i)? 1:2;
//			}
//			
//			
//		}
//		
//		if(count%2==0)
//			System.out.println("Even");
//		
//		else
//			
//			System.out.println("Odd");
//		
//		}
		
		
		
		
		// To check if a number is perfect square or not 
		
//		int n= Integer.parseInt(br.readLine());
//		
//		for (int i = 1; i <= n; i++) {
//			int sqrt= (int)Math.sqrt(i);
//			
//			if(sqrt*sqrt==i){
//				System.out.print("Open" + " ");
//			}
//				else
//					System.out.print("Closed"+ " ");
//		}
		
		
		
		 int t = Integer.parseInt(br.readLine());
	        boolean flag=true;
	        while(t-- >0)
	            {
	            int num= Integer.parseInt(br.readLine());
	            for(int i =2;i<=(int)Math.sqrt(num);i++){
	                if(num%i==0)
	                    flag=false;
	                break;
	                
	            }
	            
	            if(flag==false)
	                System.out.println("Not prime");
	            else
	               System.out.println("Prime"); 
	            
	        }
	    }
		
		
		
	}

