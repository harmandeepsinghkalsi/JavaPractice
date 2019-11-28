package stack;

import java.util.Scanner;

/*Given three stack of the positive numbers, the task is to find the possible equal maximum sum of the stacks with removal of top elements allowed.
Stacks are represented as array, and the first index of the array represent the top element of the stack*/
public class EqualStacks {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int h1[] = new int[n1];
		int h2[] = new int[n2];
		int h3[] = new int[n3];

		int sum1 = 0, sum2 = 0, sum3 = 0;

		for (int i = 0; i < n1; i++) {
			h1[i] = sc.nextInt();
			sum1 += h1[i];
		}

		for (int i = 0; i < n2; i++) {
			h2[i] = sc.nextInt();
			sum2 += h2[i];
		}

		for (int i = 0; i < n3; i++) {
			h3[i] = sc.nextInt();
			sum3 += h3[i];
		}

		System.out.println(equalSum(h1, h2, h3, sum1, sum2, sum3));

	}

	public static int equalSum(int []h1, int []h2, int[] h3, int sum1, int sum2, int sum3) {
		
		int top1=0,top2=0,top3=0;
		
		while(true) {
			
		if(h1.length==0 || h2.length==0 ||h3.length==0)
			return 0;
		if(sum1 == sum2 && sum2 == sum3) 
			return sum1;
		
			if(sum1 >= sum2 && sum1 >= sum3) {
				sum1-=h1[top1++];
			} else if (sum2 >= sum1 && sum2 >= sum3) {
				sum2-=h2[top2++];
			} else if (sum3 >= sum1 && sum3 >= sum2) {
				sum3-=h3[top3++];
			}
		}
	}
}

// Other approach could we using prefix sum . instead of storing elements in array , store the consolidated sum .