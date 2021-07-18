import java.util.HashSet;

/*
 * A happy number is a number defined by the following process: Starting with any positive integer,
 * replace the number by the sum of the squares of its digits,
 * and repeat the process until the number equals 1 (where it will stay),
 * or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy numbers.
 */

public class HappyNumber {
	
	public static void main(String[] args) {

			int num = 19;
			int sum =0;
			HashSet<Integer> hs = new HashSet<>();
			
			while(true) {
				sum = sumOfDigSq(num);
				
				if(hs.contains(sum)) {
					System.out.println("false");
					break;
				} else {
				
					hs.add(sum);
				if(sum==1) {
					System.out.println("true");
					break;
				} else if( sum==num) {
					System.out.println("false");
					break;
				}
				
				num = sum;
				}
			}
		
		
	}
	
	public static int sumOfDigSq(int n) {
		
		int sum=0;
		
		int temp = n;
		
		while(temp>0) {
			
			int rem = temp%10;
			sum=sum+(rem*rem);
			temp/=10;
		}
		
		return sum;
	}

}
