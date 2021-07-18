
public class BuyAndSellProblem {
	
	public static void main(String[] args) {

        int nums[] = {100, 180, 260, 310, 40, 535, 695};
        
        int maxProfit = 0;
        
        int i=0;
        while (i<nums.length) {
			
        	// Find local minima
        	while(i<nums.length-1 && nums[i+1]<=nums[i]) {
        		i++;
        	}
        	
        	if(i==nums.length-1) {
        		break;
        	}
        	int minima = i++;
        	
        	while(i<nums.length && nums[i]>=nums[i-1]) {
        		i++;
        	}
        	
        	int maxima = i-1;
        	
        	maxProfit+=(nums[maxima]-nums[minima]);
		}
        System.out.println(maxProfit);

	}
}
