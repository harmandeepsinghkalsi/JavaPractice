import java.util.Stack;

public class ReverseStack {

	static Stack<Integer> st = new Stack();

	public static void main(String[] args) {

		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println("Before modifying stack: " + st);
		ReverseStack t = new ReverseStack();
		t.reverse();
		System.out.println("After modifying stack: " + st);
	}

	public void reverse() {

		if (!st.isEmpty()) {

			int ele = st.peek();
			st.pop();
			reverse();
			insertAtBottom(ele);
		}

	}

	public void insertAtBottom(int x) {

		if (st.isEmpty()) {
			st.push(x);
		} else {

			int ele = st.peek();
			st.pop();
			insertAtBottom(x);

			st.push(ele);

		}
	}

}
