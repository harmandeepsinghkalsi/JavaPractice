package practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AddNumbersWithoutArthOper {

	
	
	public static void main(String[] args) {
		
//		int a = 12;
//		int b = 190;
//		while(b!=0) {
//			
//			int carry = a&b;
//			
//			a = a^b;
//			
//			b = carry<<1;
		
//		String a = "jell";
//		String b = new String("jell");
//		String c = a;
		
		Calendar cal = Calendar.getInstance();
		long milliDiff = cal.get(Calendar.ZONE_OFFSET);
		// Got local offset, now loop through available timezone id(s).
		String [] ids = TimeZone.getAvailableIDs();
		String name = null;
		for (String id : ids) {
		  TimeZone tz = TimeZone.getTimeZone(id);
		  if (tz.getRawOffset() == milliDiff) {
		    // Found a match.
		    name = id;
		    break;
		  }
		}
		System.out.println(name);
		
		TimeZone tz = TimeZone.getTimeZone(name);
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
		df.setTimeZone(tz);
		String nowAsISO = df.format(new Date());
		System.out.println("{\"currentTime\":\"" + nowAsISO +"\", \"application\": \"OK\"}");
		
		System.out.println(maxSumTwoNoOverlap(new int[] {6,1,4,6,3,2,7,4},3,2));
		
		}
	
	public static int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int i, len = A.length;

        int[] revA = A.clone();
        int[] dpl = new int[len];
        int[] dpm = new int[len];

        //compute prefix sum in forward direction
        for(i=1;i<len;i++)
            A[i] += A[i-1];

        //compute prefix sum in reverse direction
        for(i=len-2;i>=0;i--)
            revA[i] += revA[i+1];

        //case when sequence {L,M}
        //perform dp traversing for L frame in forward direction
        //perform dp traversing for M frame in reverse direction
        dp_forward(A, L, dpl);
        dp_reverse(revA, M, dpm);

        //find best combination
        int max = -1;
        for(i=0;i<len-1;i++)
            max = Math.max(max, dpl[i]+dpm[i+1]);

        Arrays.fill(dpl, len-L, len, 0);
        Arrays.fill(dpm, 0, M, 0);

        //case when sequence {M,L}
        //perform dp traversing for L frame in reverse direction
        //perform dp traversing for M frame in forward direction
        dp_forward(A, M, dpm);
        dp_reverse(revA, L, dpl);

        //find best combination
        for(i=0;i<len-1;i++)
            max = Math.max(max, dpm[i]+dpl[i+1]);

        return max;
    }
    private static void dp_forward(int[] A, int N, int[] res){
        int i, len = A.length;
        res[N-1] = A[N-1];
        for(i=N;i<len;i++){
            int sum = A[i] - A[i-N];
            res[i] = Math.max(res[i-1], sum);
        }
    }
    private static void dp_reverse(int[] A, int N, int[] res){
        int len = A.length;
        res[len-N] = A[len-N];
        for(int i=len-N-1;i>=0;i--){
            int sum = A[i] - A[i+N];
            res[i] = Math.max(res[i+1], sum);
        }
    }
	
		
		
}
