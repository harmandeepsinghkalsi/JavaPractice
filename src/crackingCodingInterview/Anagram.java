package crackingCodingInterview;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Anagram {

	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();
		for (char i = 'a'; i <= 'z'; i++) {
			map1.put(i, 0);
			map2.put(i, 0);
		}
		
		String a= br.readLine();
		String b=br.readLine();
		
		
		
		for (int i = 0; i < a.length(); i++) {
			if(map1.containsKey(a.charAt(i))){
				int freq=map1.get(a.charAt(i));
				map1.put(a.charAt(i), ++freq);
				
			}
		}
		
		
		for (int i = 0; i < b.length(); i++) {
			if(map2.containsKey(b.charAt(i))){
				int freq=map2.get(b.charAt(i));
				map2.put(b.charAt(i), ++freq);
				
			}
		}

int diff=0;

for (char i = 'a'; i <='z'; i++) {

		if(map1.get(i)!= map2.get(i)){
			 diff += Math.abs(map1.get(i)- map2.get(i));
		}
	
}


System.out.println(diff);

	

	}
}

