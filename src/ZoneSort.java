import java.util.ArrayList;

public class ZoneSort {

	public static void main(String[] args) {
		ArrayList[] arrayOfZones;
		ArrayList<String> words = new ArrayList<>();

		words.add("angela");
		words.add("APPLE");
		words.add("Apple");
		words.add("apple");
		words.add("Baboon");
		words.add("Ball");
		words.add("Cat");
		words.add("cat");

		words.add("PINK");

		words.add("Pink");
		words.add("Steve");
		
		//ZoneSort(words);
		
		arrayOfZones = new ArrayList[26];

		for (int index = 0; index < 26; index++)
			arrayOfZones[index] = new ArrayList<String>();


		putWordsIntoZones(words,arrayOfZones);
		printArrayOfZones(arrayOfZones);
	}

	
		


	private static void putWordsIntoZones(ArrayList<String> words, ArrayList[] arrayOfZones) {
		for (String word : words) {
			int index = Character.toLowerCase(word.charAt(0)) - 97;
			ArrayList<String> zoneAtIndex = arrayOfZones[index];
			zoneAtIndex.add(word);
		}
		sortTheArrayOfZones(arrayOfZones);
	}

	public static void sortTheArrayOfZones(ArrayList[] arrayOfZones) {
		for (ArrayList<String> zone : arrayOfZones) {
			sortZone(zone);
		}
	}

	private static void sortZone(ArrayList<String> zone) {
		for (int i = 1; i < zone.size(); i++) {
			String key = zone.get(i);
			int j = i - 1;
			while (j >= 0 && key.compareTo(zone.get(j)) > 0) {
				String x = zone.get(j+1);
	            zone.set(j+1,zone.get(j)); // line added
	            zone.set(j, x);
	            j--;
			}

			String x = zone.get(j + 1);
			x = key;
		}
		
		
	}

	public static void printArrayOfZones(ArrayList[] arrayOfZones) {
		System.out.println("The sorted words are");
		for (ArrayList<String> zone : arrayOfZones) {
			for (String word : zone) {

				System.out.println(word);
			}
		}
	}
}
