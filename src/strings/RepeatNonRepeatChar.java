import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;


// Find first repeating and non-repeating character in the string : Approach using linkedhashmap
public class RepeatNonRepeatChar {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		LinkedHashMap<Character, Integer> hm  = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if(hm.containsKey(str.charAt(i))) {
				int freq = hm.get(str.charAt(i));
				hm.put(str.charAt(i),++freq);
			} else {
				hm.put(str.charAt(i),1);
			}
		}
		
		System.out.println(hm);
	}
}

//class CharFreq {
//	char ch;
//	int freq;
//	
//	CharFreq(char c, int i){
//		this.ch=c;
//		this.freq=i;
//	}
//}
