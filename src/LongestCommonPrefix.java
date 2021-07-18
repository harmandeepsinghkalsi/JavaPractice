import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String arr[] = { "c", "c" };

		Arrays.sort(arr);
		String res = "";

		String first = arr[0];
		String last = arr[arr.length - 1];

		int i = 0;
		while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
			res += first.charAt(i);
			i++;
		}

		System.out.println(res);
	}
}
