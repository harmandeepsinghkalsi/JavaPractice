package practice;

import java.util.Scanner;

public class TrapRainWater {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int left[] = new int[n];
		int right[] = new int[n];

		int max1 = 0 ;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max1)
				max1 = arr[i];
			left[i] = max1;
		}

		int max2 = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > max2)
				max2 = arr[i];
			right[i] = max2;
		}

		int totalWaterTrap = 0;
		for (int i = 0; i < n; i++) {
			totalWaterTrap+= Math.min(left[i], right[i])-arr[i];
		}
		
		System.out.println("Total water trapped is: "+ totalWaterTrap);
	}
}
