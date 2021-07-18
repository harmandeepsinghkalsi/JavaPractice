import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindMostRepeatedWord {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FindMostRepeatedWord t = new FindMostRepeatedWord();
		List<String> wordsToExclude = new ArrayList<>();
		wordsToExclude.add("are");
		wordsToExclude.add("a");
		wordsToExclude.add("is");
		t.retrieveMostFrequentlyUsedWords("Rose is red sky is blue. Rose are always red not doubt but are all red rose?", wordsToExclude);
	}

	List<String> retrieveMostFrequentlyUsedWords(String helpText, List<String> wordsToExclude) {
// WRITE YOUR CODE HERE

		HashMap<String, Integer> frequency = new HashMap<>();
		List<String> output = new ArrayList<>();

		helpText = helpText.toLowerCase();
		helpText = helpText.replaceAll("[^a-z]", " ");

		String words[] = helpText.split(" ");
		for (String word : words) {
			if (word.matches("^[a-z]*$") && !wordsToExclude.contains(word)) {
				addStringToMap(frequency, word);
			}
		}

		LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

		frequency.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

		int i = 0, freq = 0;
		for (String key : reverseSortedMap.keySet()) {
			
			if (i == 0) {
				freq = reverseSortedMap.get(key);
				output.add(key);
			} else {
				if (reverseSortedMap.get(key) == freq) {
					output.add(key);
				}
			}
			i++;
		}

		System.out.println(output);

		return output;
	}

	public void addStringToMap(HashMap<String, Integer> frequency, String str) {

		if (frequency.containsKey(str)) {
			int oldFreq = frequency.get(str);
			frequency.put(str, ++oldFreq);
		} else {
			frequency.put(str, 1);
		}

	}
}
