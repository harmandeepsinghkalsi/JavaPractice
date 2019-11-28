package arrays;

import java.util.HashMap;
import java.util.Scanner;

public class MajorElement {
	
	
	//>n/2
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			 int n = sc.nextInt();
			 int arr[] = new int[n];
			 HashMap<Integer,Integer> hm = new HashMap<>();
			 
			 for (int i = 0; i <n-1; i++) {
				arr[i]=sc.nextInt();
				if(hm.containsKey(arr[i])) {
					int freq = hm.get(arr[i]);	
					hm.put(arr[i], ++freq);
				} else {
					hm.put(arr[i], 1);
				}
			}
			 
			 boolean flag = false;
			 for (int i : hm.keySet()) {
				if(hm.get(i) > (n/2)) {
					flag= true;
					System.out.println(i);
				}
			}
			 
			 if(flag== false) {
				 System.out.println("-1");
			 }
					 
		}
	}

}
