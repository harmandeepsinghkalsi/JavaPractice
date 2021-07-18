
public class RemoveDupInSortedArray {

	public static void main(String[] args) {

		int nums[] = { 1, 1, 2, 3 };

		int count = 1;
		boolean same = false;
		int i = 0, j = i + 1;

		while (j < nums.length) {

			if (nums[j] != nums[i] && same == false) {
				i++;
				j++;
				count++;
			} else if (nums[j] != nums[i] && same == true) {
				nums[i + 1] = nums[j];
				i++;
				count++;
				same = false;
			} else if (nums[j] == nums[i]) {
				j++;
				same = true;
			}
		}

		System.out.println(count);

		for (int j2 = 0; j2 < count; j2++) {
			System.out.print(nums[j2] + " ");
		}
	}
}
