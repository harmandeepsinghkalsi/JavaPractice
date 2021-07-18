import java.util.ArrayList;

public class ReplaceSubstringWithTags {
		
	public static void main(String[] args) {
		
		String str = "abab";
		

		String strs []= {"ab"};
		//System.out.println(str.contains("aab"));
		
		System.out.println(addBoldTag(str,strs));
		
	}
	
public static String addBoldTag(String s, String[] dict) {
        
        if (s.length() == 0 || dict.length == 0) 
        {
          return s;
        } 
        
        boolean[] boldTable = new boolean[s.length()];
        int end = 0;
        
        for(int i = 0; i < s.length(); i++)
        {
            for(String word : dict)
            {
                int wordLength = word.length();
                
                if(i + wordLength <= s.length() && s.substring(i, i + wordLength).equals(word))
                {
                    end = Math.max(end , i + wordLength);
                }
            }
            boldTable[i] = end > i;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            if(!boldTable[i])
            {
                sb.append(s.charAt(i));
                continue;
            }
            else
            {
                int j = i;
                while( j < s.length() && boldTable[j])
                {
                    j++;
                }
                sb.append("<s>").append(s.substring(i, j)).append("</s>");
                i = j - 1;
            }
        }
        return sb.toString();
    }

}
