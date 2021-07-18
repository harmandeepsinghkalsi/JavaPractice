import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class A {
	
    public int a = 10;
    public void show() {

    }
}


public class NumberOfDigits extends A{

	
	public static void main(String[] args) throws ParseException, IOException {
//		int number = 343243252;
//
//		System.out.println((int) Math.floor(Math.log10(number)) + 1);
//		String string = "orčpžsíáýd";
//		String str = Normalizer.normalize(string, Normalizer.Form.NFKD);
//		
//		System.out.println(string);
//		
//		str = str.replaceAll("[^\\p{ASCII}]", "");
//		System.out.println(str);	
		
		

		
	}

	
//		String s = "HE*<LL>O";
//		boolean numLockState = true;
//		StringBuilder sb = new StringBuilder();
//
//		for (int i = 0; i < s.length(); i++) {
//
//			if (s.charAt(i) == '*' && i != 0) {
//				sb.deleteCharAt(i - 1);
//			} else if (s.charAt(i) == '<') {
//				i = insertStart(s, sb, i);
//			} else if (s.charAt(i) == '>') {
//				i = insertEnd(s, sb, i);
//			} else if (s.charAt(i) == '#') {
//				i = handleNumLock(s, sb, i, numLockState);
//				numLockState = !numLockState;
//			} else {
//				sb.append(s.charAt(i));
//			}
//		}
//		
//		System.out.println(sb.toString());

	public static int insertStart(String s, StringBuilder sb, int i) {

		int j = i + 1, k = 0;
		while (!(j == s.length() || s.charAt(j) == '>' || s.charAt(j) == '*' || s.charAt(j) == '#')) {
			sb.insert(k, s.charAt(j));
			k++;
			j++;
		}

		return j - 1;
	}

	public static int insertEnd(String s, StringBuilder sb, int i) {

		int j = i + 1, k = sb.length();
		while (!(j == s.length() || s.charAt(j) == '<' || s.charAt(j) == '*' || s.charAt(j) == '#')) {
			sb.insert(k, s.charAt(j));
			k++;
			j++;
		}

		return j - 1;
	}

	public static int handleNumLock(String s, StringBuilder sb, int i, boolean state) {

		int j = i + 1;

		while (!(j == s.length() || s.charAt(j) == '>' || s.charAt(j) == '*' || s.charAt(j) == '<')) {
			if (state) {
				sb.append(s.charAt(j));
				j++;
			}
		}

		return j - 1;
	}

}
