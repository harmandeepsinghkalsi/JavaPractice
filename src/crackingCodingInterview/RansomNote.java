package crackingCodingInterview;

import java.util.Hashtable;
import java.util.Scanner;

public class RansomNote {
	
	public static void main(String[] args) {
		
		Hashtable<String,Integer> ht = new Hashtable<>();
		Hashtable<String,Integer> ht1 = new Hashtable<>();
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        
        
       // System.out.println(magazine[0]);
        
        
        for (int i = 0; i < magazine.length; i++) {
        	if(ht.containsKey(magazine[i])){
        		int freq=ht.get(magazine[i]);
        		ht.put(magazine[i], ++freq);
        	}else{
        		ht.put(magazine[i],1);
        	}
			
		}
        
        for (int i = 0; i < ransom.length; i++) {
        	if(ht1.containsKey(ransom[i])){
        		int freq=ht1.get(ransom[i]);
        		ht1.put(ransom[i], ++freq);
        	}else{
        		ht1.put(ransom[i],1);
        	}
			
		}
        
        
        boolean flag = true;
        
        for (int i = 0; i < ransom.length; i++) {
			if(ht.containsKey(ransom[i])){
				if(ht1.get(ransom[i])<=ht.get(ransom[i])){
				continue;
				}else{
					flag=false;
					break;
				}
			}else{
				flag=false;
				break;
			}
		}
        
        if(flag==true){
        	System.out.println("Yes");
        }
        else{
        	System.out.println("No");
        }
    }
}
