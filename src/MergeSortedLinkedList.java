class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class MergeSortedLinkedList {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		ListNode res = mergeTwoLists(l1, l2);
		
		while(res.next!=null) {
			System.out.println(res.val);
			res=res.next;
		}
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if (l1 == null)
			return l2;
		else if (l2 == null)
			return l1;
		else {
			ListNode dummy = new ListNode(0);
			ListNode l3 = dummy;
			while (l1 != null && l2 != null) {
				
				if (l1.val < l2.val) {
					l3.next = l1;
					l1=l1.next;
				} else {
					l3.next=l2;
					l2=l2.next;
				}
				l3=l3.next;
			}

			if (l1 != null) {
				l3.next=l1;
			} 
			
			if (l2 != null) {
				l3.next=l2;
			}

			return dummy.next;
		}

	}
}
