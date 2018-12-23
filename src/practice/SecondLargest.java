package practice;

import java.io.IOException;
import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		// int t= Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n =sc.nextInt();
			
			if(n<2)
				System.out.println("-1");
			
			int arr[]= new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i]=sc.nextInt();
			}
			
			
			int max=arr[0];
			int j=0;
			int diff[]= new int[n];
			for (int i = 1; i < arr.length; i++) {
				
				if(arr[i]>=max){
					max=arr[i];
					
					for ( j = 0; j<i; j++) {
						diff[j]=max-arr[j];
					}
				}
			}
			
			for (int i =j+1; i < arr.length; i++) {
				diff[i]=max-arr[i];
			}
			
			
			int min=max,index=0;
			for (int i = 0; i < diff.length; i++) {
				if(diff[i]==0){
					
				}else
				{
					if(diff[i]<min){
						min=diff[i];
						index=i;
					}
				}
			}
			
				if(min==max)
					System.out.println("-1");
				else
			System.out.println(arr[index]);

	}
}
	
}



//Second approach with slight difference


//int t = sc.nextInt();
//// int t= Integer.parseInt(br.readLine());
//
//while (t-- > 0) {
//
//	int n =sc.nextInt();
//	
//	if(n<2)
//		System.out.println("-1");
//	
//	int arr[]= new int[n];
//	
//	for (int i = 0; i < arr.length; i++) {
//		arr[i]=sc.nextInt();
//	}
//	
//	
//	int max=arr[0];
//	int j=0;
//	int diff[]= new int[n];

//Here is the difference in the approach . Rather than using looping inside loop .
//	for (int i = 1; i < arr.length; i++) {
//		
//		if(arr[i]>=max){
//			max=arr[i];
//			
//		}
//	}
//	
//	for (int i =0; i < arr.length; i++) {
//		diff[i]=max-arr[i];
//	}
//	
//	
//	int min=max,index=0;
//	for (int i = 0; i < diff.length; i++) {
//		if(diff[i]==0){
//			
//		}else
//		{
//			if(diff[i]<min){
//				min=diff[i];
//				index=i;
//			}
//		}
//	}
//	
//		if(min==max)
//			System.out.println("-1");
//		else
//	System.out.println(arr[index]);
//
//}
