package practice;

import java.util.Scanner;

public class CheckIfNumberHas3Divisors {
	
	// Pattern shows 4,9,25,49 all have 3 divisors only . Prime numbers have only 3 divisors
	
	
	public static void main(String[] args) {

		// this is one way , other ways can be checked at geeksforgeeks

		Scanner sc = new Scanner(System.in);
		// |A[i] - A[j]| + |i - j|

		int n = sc.nextInt();
		int k = sc.nextInt();

		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// Logic
		boolean resultNum = false;
		boolean resultNumMinus1 = false;
		boolean resultNumPlus1 = false;
		int operation = 0;

		for (int i = 0; i < arr.length; i++) {
			resultNum = checkNumber(arr[i]);
			if (!resultNum) {
				resultNumMinus1 = checkNumber(arr[i] - 1);
				if (!resultNumMinus1) {
					resultNumPlus1 = checkNumber(arr[i] + 1);
					if (!resultNumPlus1) {
						operation++;
					} else {
						operation++;
					}
				} else {
					operation++;
				}
			}

		}
		
		System.out.println(operation);

	}

	static boolean checkNumber(int number) {
		
		boolean hasDivisor = hasThreeDivisors(number);
			
		return hasDivisor;
	}
	
	
	static boolean hasThreeDivisors(int number){
		
		boolean flag = false;
		
		int squareRoot = (int)Math.sqrt(number);
		
		if(1*squareRoot*squareRoot != number){
			return false;
		}

		
		if(number <=1){
			return false;
		}
		
		for(int i =2; i<number/2;i++){
			if(number%i==0){
				flag = true;
				break;
			}
		}
		
		if(!flag){
			return true;
		}else{
			return false;
		}
	}

}
