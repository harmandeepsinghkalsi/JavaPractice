import java.io.IOException;
// Need to search for the position of the target in array , if it is present return that index else
// return the indeex it will fit in


public class SearchInsertPosition {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int arr[] = { 1, 3, 5, 6 };
		int target = 4;
		System.out.println(findIndex(arr, target));
	}

	public static int findIndex(int nums[], int target) {
		int index = 0;

		if (target < nums[0]) {
			index=0;
		} else if (target > nums[nums.length - 1]) {
			index=nums.length;
		} else {
			for (int i = 1; i <=nums.length; i++) {
				if (nums[i-1] == target) {
					index = i-1;
					break;
				} else if(target>nums[i-1]&&target<nums[i]) {
					index = i;
					break;
				}
			}
		}

		return index;
	}
}
