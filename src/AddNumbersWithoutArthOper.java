package practice;

public class AddNumbersWithoutArthOper {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 190;
		while(b!=0) {
			
			int carry = a&b;
			
			a = a^b;
			
			b = carry<<1;
			
		}
		
		//System.out.println(a);
		
		
		int n = 4;
		
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
