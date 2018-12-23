
import java.io.*;



public class SumOfDivisors {

	static int num = 0;
	static int div = 0;

	public static void main(String[] args) throws IOException, Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num = Integer.parseInt(br.readLine());
		

		int maxD = (int)Math.sqrt(num);
	    int sum=1;
	    for(int i = 2; i <= maxD; i++)
	    {
	        if(num % i == 0)
	        {
	           sum += i;
	           int d = num/i;
	           if(d!=i)
	              sum+=d;
	        }
	    }
	    System.out.println("Sum of divisors is :"+ (sum+num));
	}
}