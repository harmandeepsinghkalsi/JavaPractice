
public class RemoveDupFromSortedLL {
	
	public static void main(String[] args) {
		
		
		ListNode node1 = new ListNode(1);
		node1.next = new ListNode(2);
		node1.next.next = new ListNode(3);
		node1.next.next.next = new ListNode(3);
		node1.next.next.next.next = new ListNode(4);
		node1.next.next.next.next.next = new ListNode(5);
		node1.next.next.next.next.next.next = new ListNode(5);
		
		
		node1 = removeDuplicate(node1);
		
		while(node1!=null) {
			System.out.print(node1.val+" ");
			node1=node1.next;
		}
	}
	
	public static ListNode removeDuplicate(ListNode head) {
		
		ListNode temp = head;
		
		while(temp.next!=null) {
			if(temp.val == temp.next.val) {
				temp.next=temp.next.next;
			} else {
				temp=temp.next;
			}
		}
		
		return head;
		
	}
}

