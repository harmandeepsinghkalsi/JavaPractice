package practice;

/*Given number of pages in n different books and m students. 
 * The books are arranged in ascending order of number of pages. 
 * Every student is assigned to read some consecutive books. 
 * The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.
 * Input : pages[] = {12, 34, 67, 90}
        m = 2
	Output : 113
 */
public class BookAllocationProblem {

	public static void main(String[] args) {

		int arr[] = { 12, 34, 67, 200 };
		int nStudents = 2;
		System.out.println(findPages(arr, arr.length, nStudents));
	}

	public static int findPages(int arr[], int n, int s) {

		if (s > n) {
			return -1;
		}

		int totalPages = 0;
		for (int i = 0; i < arr.length; i++) {
			totalPages += arr[i];
		}

		int start = 0;
		int end = totalPages;
		int result = Integer.MAX_VALUE;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (isPossible(arr, start, end, mid, s)) {
				result = Math.min(mid, result);
				end = mid - 1;

			} else {
				start = mid + 1;
			}
		}

		return result;
	}

	public static boolean isPossible(int arr[], int start, int end, int curr_min, int s) {

		int curr_sum = 0;
		int numOfStudentsRequired = 1;
		for (int i = 0; i < arr.length; i++) {

			// other half we have to do search
			if (arr[i] > curr_min) {
				return false;
			} else if (curr_sum + arr[i] > curr_min) {
				numOfStudentsRequired++;
				curr_sum = arr[i];

				if (numOfStudentsRequired > s) {
					return false;
				}
			} else {
				curr_sum += arr[i];
			}

		}

		return true;
	}
}
