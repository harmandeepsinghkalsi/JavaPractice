
public class SumOfLinkedList {

	public static void main(String[] args) {

		ListNode list = new ListNode(2);
		list.next = new ListNode(4);
		list.next.next = new ListNode(6);

		ListNode list1 = new ListNode(5);
		list1.next = new ListNode(6);
		list1.next.next = new ListNode(4);
		list1.next.next.next = new ListNode(9);

		ListNode result = new ListNode(0);
		ListNode temp = result;
		int carry = 0;
		while (list != null || list1 != null) {

			int currVal = 0;
			int l1 = list != null ? list.val : 0;
			int l2 = list1 != null ? list1.val : 0;
			if (carry != 0) {
				currVal = l1 + l2 + carry;
				carry = 0;
			} else {
				currVal = l1 + l2;
			}

			if (currVal > 9) {
				carry = currVal / 10;
				currVal = currVal % 10;
			}

			temp.next = new ListNode(currVal);
			temp = temp.next;

			if (list != null)
				list = list.next;
			if (list1 != null)
				list1 = list1.next;

		}

		if (carry != 0) {
			temp.next = new ListNode(carry);
		}

		result=result.next;
		while (result != null) {
			System.out.print(result.val+" --> ");
			result = result.next;
		}
	}

}
