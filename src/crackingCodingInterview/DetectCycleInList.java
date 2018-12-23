package crackingCodingInterview;

import java.util.HashMap;
import java.util.Scanner;

public class DetectCycleInList {

	static Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public static void main(String args[]) {
		// Scanner sc = new Scanner(System.in);
		// Node head = null;
		// int T = sc.nextInt();
		// while (T-- > 0) {
		// int ele = sc.nextInt();
		// head = insert(head, ele);
		// }

		DetectCycleInList list = new DetectCycleInList();

		list.head = list.new Node(10);
		list.head.next = list.new Node(20);
		list.head.next.next = list.new Node(10);
		list.head.next.next.next = list.new Node(4);
		list.head.next.next.next.next = list.new Node(10);

		// Creating a loop for testing
		//head.next.next.next.next.next = head.next.next;
		list.hasCycle(head);
		// head = removeDuplicates(head);
		// head=removeDuplicatesUn(head);
		Boolean result = list.hasCycle(head);
		System.out.println(result);
		// display(head);

	}

	// public static Node insert(Node head, int data) {
	// Node p = new Node(data);
	// if (head == null)
	// head = p;
	// else if (head.next == null)
	// head.next = p;
	// else {
	// Node start = head;
	// while (start.next != null)
	// start = start.next;
	// start.next = p;
	//
	// }
	// return head;
	//
	// }

	boolean hasCycle(Node head) {

		Node current = head;
		HashMap<Object, Integer> hm = new HashMap<>();
		int i = 0;
		hm.put(current, i);
		current = current.next;
		i++;
		boolean flag = false;
		if (current == null)
			return false;
		else {
			while (!flag) {
				if (hm.containsKey(current)) {
					flag = true;
					break;
				} else {
					hm.put(current, i);
					i++;
					if (current.next == null) {
						flag = false;
						break;

					} else {
						current = current.next;
					}
				}
			}

			if (flag == true)
				return true;
			else
				return false;
		}

	}
}
