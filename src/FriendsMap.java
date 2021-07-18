import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * 1 <-> 2
4 <-> 2
5 <-> 17
8 <-> 2
11 <-> 12
12 <-> 8
2 <-> 5
22 <-> 7
16 <-> 22
31 <-> 71
21 <-> 8
 */


public class FriendsMap {
	
	
	public static void main(String[] args) {
		
		int arr[][] = new int[][]{{1,2},{4,2},{5,17},{8,2},{11,12},{12,8},{2,5},{22,7},{16,22},{31,71},{21,8}};
		HashMap<Integer, Set<Integer>> hm = new HashMap<>();
		
		for (int i=0;i<11;i++) {
			
			for (int j = 0; j <1; j++) {
				
				// one way
				if(hm.containsKey(arr[i][j])) {
					Set<Integer> tempSet = hm.get(arr[i][j]);
					tempSet.add(arr[i][j+1]);
					hm.put(arr[i][j], tempSet);
				}else { // if the map does not contain key
					
					HashSet<Integer> hs = new HashSet<>();
					hs.add(arr[i][j+1]);
					hm.put(arr[i][j],hs);
				}
				
				//other way
				if(hm.containsKey(arr[i][j+1])) {
					Set<Integer> tempSet = hm.get(arr[i][j+1]);
					tempSet.add(arr[i][j]);
					hm.put(arr[i][j+1], tempSet);
				}else { // if the map does not contain key
					
					HashSet<Integer> hs = new HashSet<>();
					hs.add(arr[i][j]);
					hm.put(arr[i][j+1],hs);
				}
			}
		}
		
		System.out.println(hm);
		
	}
}
