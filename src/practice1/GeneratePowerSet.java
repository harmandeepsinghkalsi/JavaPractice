package practice;

public class GeneratePowerSet {

	public static void main(String[] args) {

		//Iterative Approach
		// char[] ch = {'a','b','c'};
		//
		// long powerSet =(long)Math.pow(2, ch.length);
		//
		//
		// for (int i = 0; i < powerSet; i++) {
		//
		// for (int j = 0; j < ch.length; j++) {
		//
		// if((i&(1<<j))>0) {
		// System.out.print(ch[j]);
		// }
		// }
		// System.out.println();
		//
		// }

		String str = "abcd";
		int index = 0	;
		String curr = "";
		powerSet(str, index, curr);
	}

	// Recursive approach
	static void powerSet(String str, int index, String curr) {
		int n = str.length();  
		  
	    // base case  
	    if (index == n) 
	    {  
	        System.out.print(curr + "|"); 
	        return;  
	    }  
	  
	    // Two cases for every character  
	    // (i) We consider the character  
	    // as part of current subset  
	    // (ii) We do not consider current  
	    // character as part of current  
	    // subset  
	    powerSet(str, index + 1, curr + str.charAt(index));  
	    powerSet(str, index + 1, curr); 
	}

}
