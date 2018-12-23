package crackingCodingInterview;

import java.util.Scanner;

class Node {

	int data;
	Node next;

	public Node(int d) {
		data = d;
		next = null;
	}
}

public class ReverseALinkedList {

	public static void main(String[] args) {

		Node head = null;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			head = insert(head, num);
		}

		System.out.println("Linked List is >>>>>>>>> ");
		display(head);
		
		head=reverse(head);
		
		System.out.println("Reverse of Linked List>>>>>>>");
		
		display(head);
	}

	public static Node insert(Node head, int n) {

		if (head == null) {
			Node first = new Node(n);
			head = first;
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

	public static void display(Node head) {

		Node start = head;
		while (start != null) {
			System.out.println(start.data + " ");
			start = start.next;
		}
	}
	
	
	public static Node reverse(Node head){
		Node curr , prev , ahead;
		
		prev=null;
		curr = head;
		ahead=curr.next;
		
		while(curr.next!=null){
			curr.next=prev;
			prev=curr;
			curr=ahead;
			ahead=ahead.next;
			
		}
		
		curr.next=prev;
		return head=curr;
	}

}
