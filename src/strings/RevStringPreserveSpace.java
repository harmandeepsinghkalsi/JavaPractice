import java.util.Scanner;

public class RevStringPreserveSpace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		while(t-->0) {
		String str = sc.nextLine();

		StringBuilder newString = new StringBuilder();
		int j = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				newString.append(' ');
			} else {
				if (str.charAt(j) != ' ') {
					newString.append(str.charAt(j));
				} else {
					i--;
				}
				j--;
			}
		}

		System.out.println(newString.toString());
		}
	}
}
