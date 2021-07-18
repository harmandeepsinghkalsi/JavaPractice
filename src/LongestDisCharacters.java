import java.util.Scanner;

public class LongestDisCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();

		while (t-- > 0) {

			String s = sc.nextLine();
			int count=0,maxCount=0;
			for (int i = 0; i < s.length(); i++) {

				if (i != s.indexOf(s.charAt(i))) {
					String prev = s.substring(0, i);
					String next = s.substring(i + 1, s.length());
					s = prev.concat(next);
					i--; // Because we removed one character
					if(count>maxCount) {
						maxCount=count;
					}
					count=0;
				} else {
					count++;
					
				}

			}

			System.out.println(maxCount);
		}
	}
}
