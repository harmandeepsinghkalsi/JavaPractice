package practice;

import java.util.Scanner;

public class Print2DArrayInSpiralForm {
	
	public static void main (String[] args){ 

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter no of rows and columns in 2D array");
	 int n = sc.nextInt();
	 int m = sc.nextInt();
	 
	 int arr[][] = new int [n][m];
	 
	 for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			arr[i][j] = sc.nextInt();
		}
	}
	 
	 
	 System.out.println("\n2D array in spiral form is as below:");
	 int counter = 0 , loopCount = 0 ,j=0 , i=0 , right = m -1 , down = n-1  , left = m-1 , up =n-1;
	 
	 while (counter < n*m-1){
		 
		 if(m==1 && n==1){
			 System.out.println(arr[i][j]);
			 counter++;
		 }
			 
		 
		 else{
			 
			
		 
		 while( loopCount < right && counter < n*m-1){
			 System.out.print(arr[i][j]+ ",");
			 j++;
			 loopCount++;
			 counter++;
		 }
		 
		 loopCount =0;
		 
		 while( loopCount < down && counter < n*m-1){
			 System.out.print(arr[i][j]+ ",");
			 i++;
			 loopCount++;
			 counter++;
		 }
		 
		 loopCount=0;
		 
		while( loopCount < left  && counter < n*m-1){
			
			System.out.print(arr[i][j]+ ",");
			j--;
			loopCount++;
			counter++;
		}
		
		loopCount = 0;		
		while( loopCount < up && counter < n*m-1){
			System.out.print(arr[i][j]+ ",");
			i--;
			loopCount++;
			counter++;
		}
		
		

		i+=1;
		j+=1;
		loopCount = 0;
		right-=2;
		down-=2;
		left-=2;
		up-=2;
		 
	 }
	 }
	 
	 
	 // to print last element
	if( n == m ){
		if(n % 2==0)
			 System.out.print(arr[i-1][j-1]);
		 else
			 System.out.print(arr[i][j]);
	}else{
	
			 System.out.print(arr[i-1][j-1]); 
	}
	 
	
}
}





// second approach for the same

//Scanner sc = new Scanner(System.in);
//
//int n = sc.nextInt();
//int m = sc.nextInt();
//
//int arr[][] = new int [n][m];
//
//for (int i = 0; i < m; i++) {
//	for (int j = 0; j < n; j++) {
//		arr[i][j] = sc.nextInt();
//	}
//}
//
//// 0 - right , 1- down , 2-left , 3-up
//int t = 0 , b = m-1 , l =0 , r = n-1 , dir =0 ;
//
//while (t <=b && l<=r){
//	if(dir==0){
//		for (int i = l; i <=r ; i++) {
//			System.out.print(arr[t][i]+",");
//		}
//		t++;
//		dir=1;
//	}else if(dir==1){
//		for (int i = t; i <=b ; i++) {
//			System.out.print(arr[i][r]+",");
//		}
//		r--;
//		dir=2;
//	}else if(dir==2){
//		for (int i = r; i >=l ; i--) {
//			System.out.print(arr[b][i]+",");
//		}
//		b--;
//		dir=3;
//	}else if (dir ==3 ){
//		for (int i = b; i >=t ; i--) {
//			System.out.print(arr[i][l]+",");
//		}
//		l++;
//		dir=0;
//	}
//	
//
//	
//	//dir = (dir+1)%4;
//	}

