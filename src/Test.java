
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ObjectInputStream.GetField;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		double number =  129.0;
//		System.out.println(sqrt(number));
		
		
			Scanner sc = new Scanner(System.in);
			
			//JavaConceptOfTheDay
			String str = sc.nextLine();
				String longestSubString = "";
				int longestSubStringLen = 0;
				LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
				for (int i = 0; i < str.length(); i++) {
					if(!hm.containsKey(str.charAt(i))) {
						hm.put(str.charAt(i),i);
					} else {
						i=hm.get(str.charAt(i));
						hm.clear();
					}
					
					if(hm.size()>longestSubStringLen) {
						longestSubStringLen = hm.size();
						longestSubString = hm.keySet().toString();
					}
				}
				
				System.out.println("Longest substring is:" + longestSubString);
				System.out.println("Length of longest substring is: "+ longestSubStringLen);
			
		
	}
	
	public static double sqrt(double num) {
		
		if(num ==0 || num ==1) {
			return num;
		}
		
		int i=1;
		while(true) {
			
			if(i*i== num) return i ;
			else if(i*i>num) {
				return binarySearch(num, i-1, i);
			} 
			i++;
		}
		
	}
	
	public static double binarySearch(double number, double start , double end) {
		
		
		double mid = (start+end)/2;
		if(mid*mid==number) {
			return mid*mid;
		} else if(mid*mid<number) {
			return binarySearch(number, start, mid);
		} else {
			return binarySearch(number, mid, end);
		}
		
	}

}