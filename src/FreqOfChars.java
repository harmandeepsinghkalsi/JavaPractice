import java.io.*;


import java.util.Map;

import java.util.TreeMap;

public class FreqOfChars {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Map<Integer, Integer> m = new TreeMap<>();

		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());

		}
		for (int i = 0; i < arr.length; i++) {
			int current = arr[i];
			int freq = 1;
			if (m.containsKey(current))
				continue;
			else {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] == current) {
						freq++;
					}
				}
				m.put(current,freq);
			}
		}
		System.out.println(m);
		
		
		for(Map.Entry<Integer,Integer> entry: m.entrySet())
		    //System.out.println(entry.getKey()+ ": " + entry.getValue());
		{
			if(entry.getValue()==2)
				System.out.println(entry.getKey());
		}

	}
}
