import java.util.HashMap;

public class OccurancesInStringInSameOrder {
	public static void main(String[] args) {
		
		System.out.println(occurances("gauravjeetsingh"));
		
	}
	
	public static String occurances(String S) {
		
		String result = "";
		
		HashMap<Character,Integer> hm = new HashMap();
		for (int j = 0; j < S.length(); j++) {
			if(hm.containsKey(S.charAt(j))) {
				int freq = hm.get(S.charAt(j));
				hm.put(S.charAt(j),++freq);
			} else {
				hm.put(S.charAt(j), 1);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < S.length(); i++) {
			if(sb.indexOf(""+S.charAt(i)) == -1) {
				sb.append(S.charAt(i));
				sb.append(hm.get(S.charAt(i)));
			}
		}		
		return sb.toString();
	}
}
