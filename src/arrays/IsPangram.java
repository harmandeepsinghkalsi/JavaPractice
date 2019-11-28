package arrays;

public class IsPangram {
	
	public static void main(String[] args) {
		
		String s= "pack my box with five dozen liquor jugs";
		
		int[] ch = new int[26];
		
		for (int i = 0; i < s.length(); i++) {
			
			switch(s.charAt(i))
			{
			case 'a':
				ch[0]+=1;
				break;
			case 'b':
				ch[1]+=1;
				break;
			case 'c':
				ch[2]+=1;
				break;
			case 'd':
				ch[3]+=1;
				break;
			case 'e':
				ch[4]+=1;
				break;
			case 'f':
				ch[5]+=1;
				break;
			case 'g':
				ch[6]+=1;
				break;
			case 'h':
				ch[7]+=1;
				break;
			case 'i':
				ch[8]+=1;
				break;
			case 'j':
				ch[9]+=1;
				break;
			case 'k':
				ch[10]+=1;
				break;
			case 'l':
				ch[11]+=1;
				break;
			case 'm':
				ch[12]+=1;
				break;
			case 'n':
				ch[13]+=1;
				break;
			case 'o':
				ch[14]+=1;
				break;
			case 'p':
				ch[15]+=1;
				break;
			case 'q':
				ch[16]+=1;
				break;
			case 'r':
				ch[17]+=1;
				break;
			case 's':
				ch[18]+=1;
				break;
			case 't':
				ch[19]+=1;
				break;
			case 'u':
				ch[20]+=1;
				break;
			case 'v':
				ch[21]+=1;
				break;
			case 'w':
				ch[22]+=1;
				break;
			case 'x':
				ch[23]+=1;
				break;
			case 'y':
				ch[24]+=1;
				break;
			case 'z':
				ch[25]+=1;
				break;
			default:
				break;
				
			}
		}
		
		boolean isPangram = true;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]==0) {
				isPangram = false;
				break;
			}
		}
		
		if(isPangram)
			System.out.println("It is pangram. It has all the alphabets from a to z atmost once");
		else 
			System.out.println("it is not a pangram means atleast one of the alphabets is not present in this string");
	}

}
