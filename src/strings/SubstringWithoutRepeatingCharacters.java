import java.util.LinkedHashMap;
import java.util.Scanner;

public class SubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//JavaConceptOfTheDay
		String str = sc.nextLine();
			String longestSubString = "";
			int longestSubStringLen = 0;
			LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
			for (int i = 0; i < str.length(); i++) {
				if(!hm.containsKey(str.charAt(i))) {
					hm.put(str.charAt(i),i);
				} else {
					i=hm.get(str.charAt(i));
					hm.clear();
				}
				
				if(hm.size()>longestSubStringLen) {
					longestSubStringLen = hm.size();
					longestSubString = hm.keySet().toString();
				}
			}
			
			System.out.println("Longest substring is:" + longestSubString);
			System.out.println("Length of longest substring is: "+ longestSubStringLen);
		
	}
}
