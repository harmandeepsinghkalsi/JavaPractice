import java.util.HashMap;


// Need to find numbers from arary such that x and x+1 also exist in the array.
public class CountingNumbers {
	
	
	
	public static void main(String[] args) {
	
	int arr[] = {1,1,2}; //[0,1,2,3,5]
	int count=0;
	HashMap<Integer, Integer> hm = new HashMap<>();
	
	
	for (int i = 0; i < arr.length; i++) {
		if(hm.containsKey(arr[i])) {
			int freq = hm.get(arr[i]);
			hm.put(arr[i], ++freq);
		} else {
			hm.put(arr[i], 1);
		}
	}
	
	System.out.println(hm);
	
	for (int i = 0; i < arr.length; i++) {
		
		if(hm.containsKey(arr[i]+1)){
			count++;
		}
	}
	System.out.println(count);
	
}
}

class testing {
	
	public void tesmeth(String name) {
		System.out.println(name);
	}
}