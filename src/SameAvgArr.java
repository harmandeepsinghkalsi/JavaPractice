import java.io.*;

public class SameAvgArr // task is to divide the array into two sub arrays such that there average is same. This one is the best approach .. 
//There can be naive approach also which can be solved using two loops
{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of elements in array");
		int n = Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		int sum=0;
		boolean found=false;
		
		for (int i = 0; i < n; i++)                     // reading array elements and calculating sum
		{
			arr[i]=Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		
		

		int lsum=0;
		for (int i = 0; i < n-1; i++) {
			
			 lsum  += arr[i];
			int rsum=sum-lsum;
			
			if(lsum*(n-i-1)==rsum*(i+1)){
				found=true;
				System.out.println("One is from ----"+ 0 +" to " + i );
				System.out.println("Second one is from ---- " + (i+1) +" to " + (n-1));
			}
			
		}
		
		if(found==false){
			System.out.println("Such sub array cannot be found");
		}
	}
	
	
	
	 public static void MulSameAvgSubArr(int arr[])
	 {
		 
	 }
}
