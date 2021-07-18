
public class ReverseList {
	
public static void main(String[] args) {
		
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		ListNode prev = null;
		ListNode curr = head;
		ListNode currN = curr.next;
		
		while(curr.next!=null) {
			
			curr.next = prev;
			prev=curr;
			curr=currN;
			currN=currN.next;
			
		}
		
		curr.next = prev;
		head = curr;
		
		while(head!=null) {
			System.out.println(head.val);
			head = head.next;
		}	
	}
}

