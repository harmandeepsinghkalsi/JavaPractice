package practice;

public class IncreasingDecreasing {
		
	public static void main(String args[]){
		int i=0;
		String ans="";
		//int arr[] = {	2, 3 ,8 ,9 ,10 ,15};
		//int arr[] = {1 ,10 ,11, 9, 5, 1};
		//int arr[] = {12 ,11 ,9 ,7 ,5 ,1 };
		int arr[] = {	6, 7 ,8 ,9 ,1 ,2};
		
		if(arr[i+1]>arr[i]) // increasing or increasing/decreasing
		{
			for (i = 1; i<=4; i++) {
				if(arr[i+1]>arr[i])// purely increasing
				
				{
					ans="Strictly Increasing";
					
				}else   //increasing/decreasing
				{
					ans="Increasing - Decreasing";
					break;
				}
			}
			System.out.println(ans);
		}else    //decreasing or decreasing/increasing
		{
			for (i = 1; i<=4; i++) {
				if(arr[i+1]<arr[i])// purely decreasing
				
				{
					ans="Strictly Decreasing";
					
				}else   //increasing/decreasing
				{
					ans="Decreasing - Increasing ";
					break;
				}
			}
			System.out.println(ans);
		}
	}
	
}
