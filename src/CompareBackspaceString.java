
public class CompareBackspaceString {
	
	public static void main(String[] args) {

		String S = "bxj##tw", T = "bxo#j##tw";

		int i = S.length() - 1;
		int j = T.length() - 1;
		String SR = "", TR = "";
		int countS = 0, countT = 0;
		while (i >= 0) {

			if (S.charAt(i) == '#') {
				countS += 1;

			} else {

				if (countS == 0 && i >= 0 && S.charAt(i) != '#') {
					SR += S.charAt(i);
				}

				if (countS > 0)
					countS--;
			}

			i--;

		}
		System.out.println(SR);

		while (j >= 0) {

			if (T.charAt(j) == '#') {
				countT += 1;
			} else {
				
				if (countT==0 && j >= 0 && T.charAt(j) != '#') {
					TR += T.charAt(j);
				}
				
				if(countT > 0)
					countT--;

			}
			
			j--;

		}

		System.out.println(TR);
		System.out.println(SR.equals(TR));

	}

}
