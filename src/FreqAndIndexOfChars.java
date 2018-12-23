import java.io.*;
import java.util.*;

class CharacterFreq {
	char ch;
	int freq;
	ArrayList<Integer> al;

	CharacterFreq(char ch, int freq, ArrayList al) {
		this.ch = ch;
		this.freq = freq;
		this.al = al;
	}
 
}

public class FreqAndIndexOfChars {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int freq;
		int n = sc.nextInt();
		char chArr[] = new char[n];
		HashMap<Character, Integer> hm = new HashMap<>();
		ArrayList<Integer> al;
		ArrayList<CharacterFreq> cf = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			chArr[i] = sc.next().charAt(0);
			hm.put(chArr[i], 0);
		}

		for (int i = 0; i < chArr.length; i++) {
			al = new ArrayList<>();
			al.add(i);
			freq = 1;
			boolean flag=true;
			char curr = chArr[i];
			if (i == chArr.length - 1) //last element
			{
				if (hm.containsKey(curr) && hm.get(curr) > 0) //if it last and it is already counted
				{

				} else //if it not counted and appeared for the first time
				{
					cf.add(new CharacterFreq(curr, freq, al));
				}
			} else //for rest of the elements in array
			{
				
				for (int j = i + 1; j < chArr.length; j++) {

					if (hm.containsKey(curr) && hm.get(curr) > 0 ) {
						flag=false;

					}else if(hm.containsKey(curr) && hm.get(curr)== 0 && chArr[j] == curr )
					{
						freq+=1;
						al.add(j);
						
					}
				}
				if(flag){
					hm.put(curr, freq);
					cf.add(new CharacterFreq(curr, freq, al));
				}
				

			}

			
		}

		for (int i = 0; i < cf.size(); i++) {
			System.out.println(cf.get(i).ch + " is repeated  " + cf.get(i).freq + "times");
			System.out.println("Indices at which "+cf.get(i).ch+ " is present are :" +cf.get(i).al);
		}

	}
}
