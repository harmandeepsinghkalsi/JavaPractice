import java.io.IOException;

public class IsSubsequence {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		String s = "hg", t = "ahbgdc";

		if (s.length() > t.length())
			System.out.println(false);
		else {
			int i = 0, j = 0;
			while (i != s.length() && j != t.length()) {
				if (s.charAt(i) == t.charAt(j)) {
					i++;
					j++;
				} else {
					j++;
				}
			}

			if (i == s.length()) {
				System.out.println(true);
			}else{
				System.out.println(false);
			}
		}

	}
}	
