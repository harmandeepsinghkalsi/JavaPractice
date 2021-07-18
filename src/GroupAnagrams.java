import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String strs[] = {"cat", "dog", "tac", "god", "act"};
		
		HashMap<String, List<String> > map = new HashMap<>();
		
		 //loop over all words 
	        for (int i = 0; i < strs.length; i++) { 
	  
	            // convert to char array, sort and 
	            // then re-convert to string 
	            String word = strs[i]; 
	            char[] letters = word.toCharArray(); 
	            Arrays.sort(letters); 
	            String newWord = new String(letters); 
	  
	            // calculate hashcode of string 
	            // after sorting 
	            if (map.containsKey(newWord)) { 
	  
	                map.get(newWord).add(word); 
	            } 
	            else { 
	  
	                List<String> words = new ArrayList<>(); 
	                words.add(word); 
	                map.put(newWord, words); 
	            } 
	        } 
	  
	        
	        List<List<String>> result = new ArrayList<>();
			
			for (String s : map.keySet()) {
				
				List<String> innerList = map.get(s);
				result.add(innerList);
			}

			System.out.println(result);
	    } 
	}
