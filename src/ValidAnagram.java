import java.io.IOException;
import java.util.Arrays;

public class ValidAnagram {
public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		String s= "harman";
		String t = "armanh";
		
		 if(s.length()!=t.length()){
	            System.out.println(false);
	        }
	        
	        char ch1[] = s.toCharArray();
	        char ch2[] = t.toCharArray();
	        Arrays.sort(ch1);
	        Arrays.sort(ch2);
	        
	        s= String.valueOf(ch1);
	        t=String.valueOf(ch2);
	        
	        if(s.equals(t)){
	        	System.out.println(true);
	        } else{
	        	System.out.println(false);
	        }
	}
}
