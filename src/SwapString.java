// swap substrings based on the sizes array to make a new string

public class SwapString {

	public static void main(String[] args) {
			
		String s = "deepharmanamritsarsingh";
		int[] sizes = {4,6,8,5};
		
		StringBuilder sb = new StringBuilder();
		
		int i =0,j=0;
		int length=0;
		
		if(sizes.length %2 == 0) {
			length=s.length();
		} else {
			length=s.length()-sizes[sizes.length-1];
		}
		
		String subStr1="";
		String subStr2="";
		
		while( i < length ) {
			
			subStr1 = s.substring(i,i+sizes[j]);
			subStr2 = s.substring(i+sizes[j],i+sizes[j]+sizes[j+1]);
			sb.append(subStr2);
			sb.append(subStr1);
			i+=sizes[j]+sizes[j+1];
			j+=2;
		}
		
		if(sizes.length %2 != 0) {
			sb.append(s.substring(s.length()-sizes[sizes.length-1]));
		}
		
		System.out.println(sb.toString());
	}

}
