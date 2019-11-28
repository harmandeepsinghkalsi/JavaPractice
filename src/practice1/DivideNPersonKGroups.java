package practice;

public class DivideNPersonKGroups {
	
	public static void main(String[] args) {
		
		int n = 7 , k =3;
		int arr[] = new int[k];
		
		arr[k-1]= n-k+1;
		
	}
	
	
	public static int sum(int arr[]) {
		
		int sum =0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
		
		return sum;
	}

}
