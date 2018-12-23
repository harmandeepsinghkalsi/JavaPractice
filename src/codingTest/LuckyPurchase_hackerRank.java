package codingTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LuckyPurchase_hackerRank {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// code

		Scanner sc = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		int t = sc.nextInt();
		// sc.nextLine();
		// int t= Integer.parseInt(br.readLine());

		HashMap <String ,Integer> hm1= new HashMap<>();
		String name="";
		 int  price =0;
		while (t-- > 0) {

			name = sc.next();
			price= sc.nextInt();
			
			//String priceStr = String.valueOf(price);
			
			hm1.put(name, price);
		}
		
			//HashMap <Integer,Integer> hm = new HashMap<>();
		String result =null;
			boolean flag= true;
			long minValue=0;
			for (Map.Entry<String, Integer> entry :hm1.entrySet()) {
				int amount = entry.getValue();
				int sevenCount=0;
				int fourCount=0;
				
				while(amount >0){
					
					int digit  = amount%10;
					if(digit==7)
						sevenCount++;
					else if(digit==4)
						fourCount++;
					
					amount/=10;
				}
				
				if(sevenCount==fourCount && sevenCount!=0 && fourCount!=0&& flag){
					 result = entry.getKey();
					 minValue=entry.getValue();
					 flag=false;
					
				}else if(sevenCount==fourCount && sevenCount!=0 && fourCount!=0 && flag != true && entry.getValue()<minValue){
					
					result = entry.getKey();
					minValue=entry.getValue();
					
				}
				
			}
			
			if(result!=null)
			System.out.println(result);
			else
				System.out.println("-1");
			
				
			}
			
			
			
			
			
		
}
