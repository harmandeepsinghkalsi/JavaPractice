package codingTest;

import java.util.Scanner;

public class PatternCount {
	
	
	static int patternCount(String s){
        // Complete this function
		
		int i =0;
		int totalCount=0;
		
		if(s.length()<=2)
			return 0;
		while(i<s.length()-1){
			
			if(s.charAt(i)=='1'){
				i++;
				while(true){
					
					if(s.charAt(i)=='0'&& i< s.length()-1){
						i++;
					}else if(s.charAt(i)=='1'){
						if(s.charAt(i-1)=='0')
						totalCount+=1;
						break;
					}else{
						break;
					}
				}
			}
			
			else
				i++;
		}
		return totalCount;
    }
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }
    }
}
