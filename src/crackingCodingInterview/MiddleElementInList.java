package crackingCodingInterview;

import java.util.Scanner;



public class MiddleElementInList {

	public static void main(String args[]) {

		int n;
		Node head = null;

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			head = insert(head, num);
		}
		
		int middle = findMiddle(head);
		System.out.println(middle);
	}

	public static Node insert(Node head, int n) {

		if (head == null) {
			head = new Node(n);
		} else if (head.next == null) {
			head.next = new Node(n);
		} else {
			Node start = head;
			while (start.next != null) {
				start = start.next;
			}

			start.next = new Node(n);
		}
		return head;
	}
	
	public static int  findMiddle(Node head){
		
		Node fast = head;
		Node slow = head;
		int middle= 0 ;
		
		while(fast.next!=null){
			
			if(fast.next.next==null)
			{
				slow=slow.next;
				break;
			}else{
			slow= slow.next;
			fast=fast.next.next;
			}
		}
		
		middle = slow.data;
		
		return middle;
	}
}
