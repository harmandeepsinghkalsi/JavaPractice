package practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	
	public static void main(String[] args) throws ParseException {
		Test1 t = new Test1();
//		t.TransformDate("2019-09-21T18:30:00.000Z", "dd mm yyyy");
		
		System.out.println(t.solution(new int[] {2,1,5,6,0,9,5,0,3,8},4,3));
	} 
	
	
	public  int solution(int[] A, int K, int L) {

        
        int[] psum = new int[A.length];
        psum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
        	psum[i] = psum[i - 1] + A[i];
        }

        if (K + L == A.length) return psum[A.length - 1];
        return Math.max(findMaxNonOverlappingSum(A, psum, K, L), findMaxNonOverlappingSum(A, psum, L, K));
    }

    private  int findMaxNonOverlappingSum(int[] arr, int[] ps, int left, int right) {

        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];

        for (int i = left - 1; i < arr.length; i++) {
            int temp = ps[i] - ps[i - left + 1] + arr[i - left + 1];
            if (i == left - 1) {
                leftMax[i] = temp;
            } else {
                leftMax[i] = Math.max(leftMax[i - 1], temp);
            }
        }

        for (int i = arr.length - right; i >= 0; i--) {
            int temp = ps[i + right - 1] - ps[i] + arr[i];
            if (i == arr.length - right) {
                rightMax[i] = temp;
            } else {
                rightMax[i] = Math.max(rightMax[i + 1], temp);
            }
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = left - 1; i < arr.length - right; i++) {
        	maxSum = Math.max(maxSum, leftMax[i] + rightMax[i + 1]);
        }

        return maxSum;

    }
		
	
	public static void TransformDate(String date,String dateFormat) throws ParseException
	{
          
          SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
          SimpleDateFormat format2 = new SimpleDateFormat("dd MMM yy");
//          Date dateNew = format1.parse("2019-09-21T18:30:00.000Z");
          Date dateNew = new Date();
          System.out.println(format2.format(dateNew));
    }
	

	


}
