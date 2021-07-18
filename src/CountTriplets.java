import java.util.HashSet;

//Given an array of distinct integers. 
//The task is to count all the triplets such that sum of two elements equals the third element.
public class CountTriplets {
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,10,1};
		int n =6;
		HashSet<Integer> hm = new HashSet<>();

		for (int i = 0; i < n; i++) {
			hm.add(arr[i]);
		}

		int start = 0, end = 1;
		int count = 0;
		while (start < n - 2) {

			if (end == n) {
				start++;
				end = start + 1;
			}
			if (hm.contains(arr[start] + arr[end])) {
				count++;
			}
			end++;
		}
		System.out.println(count);
	}
}
