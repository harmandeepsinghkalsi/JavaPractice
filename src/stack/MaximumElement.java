package stack;

import java.util.Scanner;
import java.util.Stack;

import arrays.MaximumSumSubArraySizeK;

/*You have an empty sequence, and you will be given  queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.*/
public class MaximumElement {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int tempN = n;
		Stack<Integer> mainStack = new Stack<>();
		Stack<Integer> maxElestack = new Stack<>();

		while(n-->0) {
			
			int qNo = sc.nextInt();
			
			
			switch(qNo) {
			
			case 1:
				int numToAdd = sc.nextInt();
				mainStack.push(numToAdd);
				if(n==tempN-1 || maxElestack.isEmpty()) {
					maxElestack.push(numToAdd);
					continue;
				}
				if(numToAdd >= maxElestack.peek())
					maxElestack.push(numToAdd);
				else
					maxElestack.push(maxElestack.peek());
				break;
			case 2:
				mainStack.pop();
				maxElestack.pop();
				break;
			case 3:
				System.out.println(maxElestack.peek());
				break;
			default:
				break;
			
				
			}
			
		}
	}

}
