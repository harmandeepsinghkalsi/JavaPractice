
public class MaxSumSubarray {

	public static void main(String[] args) {

		int arr[] = {1, 2, 3};
		
		int curr_sum=arr[0];
		int global_sum=arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i]>curr_sum+arr[i]) {
				curr_sum=arr[i];
			}else {
				curr_sum=curr_sum+arr[i];
			}
			
			if(curr_sum>global_sum) {
				global_sum=curr_sum;
			}
		}
		
		System.out.println(global_sum);
	}
}
