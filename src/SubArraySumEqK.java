import java.util.HashMap;

public class SubArraySumEqK {

	public static void main(String[] args) {

		int arr[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int sum = 0;
		int k = 0;

		int i = 0, start = 0, count = 0;
//		while(i<arr.length) {
//			sum+=arr[i];
//			if(sum>k) {
//				start++;
//				i=start;
//				sum=0;
//			} else if(sum==k) {
//				end=i;
//				break;
//			} else {
//				i++;
//			}
//		}

//		while(i<arr.length) {
//			sum+=arr[i];
//			if(sum==k) {
//				count++;
//				start++;
//				i=start;
//				sum=0;
//			} else {
//				i++;
//			}
//			
//			if(i==arr.length && start <arr.length) {
//				start++;
//				i=start;
//				sum=0;
//			}
//		}

		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		for (i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (map.containsKey(sum - k))
				count += map.get(sum - k);

			int val = 1;
			if (map.containsKey(sum))
				val += map.get(sum);

			map.put(sum, val);
//        

			System.out.println("Start is: " + start + "and end is: " + count);
		}
	}
}
