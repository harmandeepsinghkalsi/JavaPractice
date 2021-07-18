import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class ReverseString {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// System.out.println(twoCitySchedCost(costs));
		reverse(new char[] { 'H', 'a', 'n', 'n', 'a', 'h' });

	}

	public static void reverse(char[] s) {
		int i = 0, j = s.length - 1;
		while (i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}

		for (Character ch : s)
			System.out.print(ch + ", ");
	}
}
