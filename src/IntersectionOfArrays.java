import java.util.HashSet;

// We just have return the single occurance of the number even if there are more. Like
// in this example [2] and not [2,2]
public class IntersectionOfArrays {
	
	public static void main(String[] args) {
		
		int nums1[]= {1,2,2,1};
		int nums2[]= {2,2};
		
		
		
        
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        
        for (int i = 0; i < nums1.length; i++) {
			hs1.add(nums1[i]);
		}
        
        for (int i = 0; i < nums2.length; i++) {
			hs2.add(nums2[i]);
		}
        
        hs1.retainAll(hs2);
        
        System.out.println(hs1);
        
        
	}
}
