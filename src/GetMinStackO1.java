import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class GetMinStackO1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			Stack<Integer> s = new Stack<>();
			StackClass g = new StackClass();
			while (!g.isFull(s, n)) {
				g.push(sc.nextInt(), s);
			}
			System.out.println(g.min(s));
		}

	}	
}

class StackClass {
	int currentMin;
	int element;
	int diff;

	public void push(int a, Stack<Integer> s) {
		// add code here.
		if (s.size() == 0) {
			s.push(a);
			currentMin = a;
		} else {
			if (a < currentMin) {
				s.push(2 * a - currentMin);
				currentMin = a;
			} else {

				s.push(a);
			}
		}

	}

	public int pop(Stack<Integer> s) {
		// add code here.
		int returnEle = 0;
		if (s.size() > 0) {
			element = s.pop();
			if(element<currentMin) {
				currentMin = 2*currentMin-element;
			}
		}

		return element;
	}

	public int min(Stack<Integer> s) {
		// add code here.
		return currentMin;

	}

	public boolean isFull(Stack<Integer> s, int n) {
		// add code here.
		if (s.size() == n) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty(Stack<Integer> s) {
		// add code here.
		if (s.size() == 0) {
			return true;
		} else {
			return false;
		}

	}
}
