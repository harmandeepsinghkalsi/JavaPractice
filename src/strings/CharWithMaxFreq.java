import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class CharWithMaxFreq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int maxFreq = 0;
		char maxFreqChar = str.charAt(0);
		HashMap<Character, Integer> hm = new HashMap<>();
		List<Character> al = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {

			if (hm.containsKey(str.charAt(i))) {
				int freq = hm.get(str.charAt(i));
				freq=freq+1;
				hm.put(str.charAt(i), freq);
				if (freq > maxFreq) {
					maxFreq = freq;
					al.clear();
					al.add(str.charAt(i));
				} else if (freq == maxFreq) {
					al.add(str.charAt(i));
				}
			} else {
				hm.put(str.charAt(i), 1);
//				al.add(str.charAt(i));
			}
		}
		
		if(str!= null && al.isEmpty()) {
			for (int i = 0; i < str.length(); i++) {
				al.add(str.charAt(i));
			}
			System.out.println(al);
		}

		System.out.println(hm);
		System.out.println(al);

	}

}
