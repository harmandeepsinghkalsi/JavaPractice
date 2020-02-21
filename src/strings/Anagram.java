import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String strA = sc.nextLine();
		
		String temp = str.toLowerCase()+strA.toLowerCase();
		
		HashMap<Character,Integer> hm = new HashMap<>();
		for (Character ch : temp.toCharArray()) {
			if(hm.containsKey(ch)) {
				int freq = hm.get(ch);
				hm.put(ch,++freq);
			} else {
				hm.put(ch,1);
			}
		}
		
		System.out.println(hm);
		boolean isAnagram = true;
		
		for(Character ch : hm.keySet()) {
			if(ch!=' ') {
				if(hm.get(ch)%2!=0) {
					isAnagram = false;
					break;
				}
			}
		}
		
		if(isAnagram)
			System.out.println("Anagram");
		else
			System.out.println("Not an anagram");
	
	}
}
