import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// JavaConceptOfTheDay
//		String str = sc.nextLine();
		System.out.println(Integer.MAX_VALUE);
		int i = sc.nextInt();
		Test t = new Test();
		System.out.println(t.reverse(i));

	}

	public int reverse(int x) {

		return reverseInt(x);

	}

	public int reverseInt(int num) {

		long ans = 0;
		boolean isNegative = num < 0 ? true : false;
		long tempNum = (long)Math.abs(num);

		while (tempNum > 0) {
			long rem = tempNum % 10;
			ans = ans * 10 + rem;
			tempNum /= 10;
		}

		if (isNegative)
			ans = -ans;

		if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
			return 0;

		return (int)ans;
	}

}
