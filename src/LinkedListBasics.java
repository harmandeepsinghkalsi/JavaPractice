package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

// Linked List
public class Dummy {

	static Node head;

	public static void main(String[] args) {

		Dummy d = new Dummy();

		Scanner sc = new Scanner(System.in);

		d.insertNodeInFrontOfList(6);
		d.insertNodeInFrontOfList(7);
		d.insertNodeInLastOfList(8);
		d.insertNodeInFrontOfList(10);
		d.insertNodeInLastOfList(5);
		d.insertNodeInLastOfList(5);
		d.insertNodeAfterAGivenNode(d.head, 20);
		d.head.next.next.next.next = d.head;
//		d.printList();
		System.out.print("Length of list is:");
//		d.lengthOfList();
//		d.deleteANodeAtGivenPosition(2);
//		d.printList();
//		d.searchAnElementInList(10);
//		d.getNthNode(4);
//		d.getNthNodeFromEnd(4);
//		d.printMiddleElementOfList();
//		d.freqOfData(5);
//		d.detectLoopInList();
		d.findLengthOfLoopInLinkedList();
		

	}
	
	public void findLengthOfLoopInLinkedList() {
		HashMap<Integer,Node> nodes = new HashMap<>();
		Node temp = head;
		int serialNo = 1;
		boolean flag = false;
		while(temp!=null) {
			if(nodes.containsValue(temp)) {
				System.out.println("Loop Exists in Linked List");
				flag=true;
				break;
			}else {
				nodes.put(serialNo, temp);
				serialNo++;
			}
			temp=temp.next;
		}
		if(flag) {
			System.out.print("Length of loop is: ");
			for (int i = 1; i <= nodes.size(); i++) {
				if(nodes.get(i)==temp) {
					System.out.println(serialNo-i);
					break;
				}
			}
		}
		
	}
	
	public void detectLoopInList() {
		
//		Floyd’s Cycle-Finding Algorithm: Thid algorithm is based on two pointer technique
		// Below is naive implentation
		HashSet<Node> nodes = new HashSet<>(); 
		
		Node temp = head;
		
		while(temp!=null) {
			if(nodes.contains(temp)) {
				System.out.println("There exists loop in the linked list");
				break;
			}else {
			nodes.add(temp);
			}
			temp=temp.next;
		}
		System.out.println("No loop in the list");
	}
	
	public void freqOfData(int data) {
		
		int count =0;
		Node temp =head;
		while(temp!=null) {
			if(temp.data==data)
				count++;
			temp=temp.next;
		}
		
		System.out.println("Frequency of "+ data+" is: "+ count );
	}
	
	public void printMiddleElementOfList() {
		
		// Three approaches: 1. Find len and return len/2+1 2. Two pointer tech 3. when counter is odd , increment pointer
		if(head==null)
			return;
// Approach2 :
//		Node fast = head;
//		Node slow =head;
//		while(fast!=null && fast.next!=null) {
//			
//			fast=fast.next.next;
//			slow=slow.next;
//		}
//		
// Approach3:
		Node curr=head,mid=head;
		int counter=0;
		while(curr!=null) {
			if(counter%2!=0) {
				mid=mid.next;
			}
			curr=curr.next;
			counter++;
		}
		System.out.println("Middle element of the list is: " + mid.data);
	}
	
	public void getNthNodeFromEnd(int posFromEnd) {
		
		//There are 2 approaches for this . 1. Get the length of list and get the node 2. Use two pointer tech
		
//		Node curr = head;
//		int len =0;
//		int counter = 1;
//		while(curr!=null)
//		{
//			curr=curr.next;
//			len++;
//		}
//		
//		if(posFromEnd>len || posFromEnd<=0) {
//			System.out.println("Not a valid position for nth element from last");
//			return;
//		}
//			
//		
//		curr=head;
//		
//		for(int i=1;i<len-posFromEnd+1;i++) {
//			curr=curr.next;
//		}
//		System.out.println("Element at "+ posFromEnd+" from end is: "+curr.data);
		
		if(posFromEnd<=0) {
			System.out.println("Not a valid position for nth node from last");
			return;
		}
		Node slow = head, fast = head;
		int counter =1;
		while(fast!=null && counter<posFromEnd) {
			fast=fast.next;
			counter++;
		}
		if(fast==null) {
			System.out.println("Position specified is greater than the length of the list");
		}else {
			while(fast.next!=null) {
				fast=fast.next;
				slow=slow.next;
			}
			System.out.println(slow.data);
		}
		
		
	}

	public void getNthNode(int pos) {

		if (pos < 0)
			System.out.println("Not a valid position");
		else {
			Node curr = head;
			int counter = 0;
			while (curr != null && counter != pos) {
				curr = curr.next;
				counter++;
			}

			if (curr == null)
				System.out.println("Position entered is not a valid position");
			else
				System.out.println("Node at position "+ pos+" is: "+ curr.data);
		}
		
		//recursive
//		int count = 0;  
//	      
//	    //if count equal too n return node.data  
//	    if(count == pos)  
//	    	return head.data;  
//	      
//	    //recursively decrease n and increase  
//	    // head to next pointer  
//	    return getNthNode(head.next, pos - 1);  
	}

	public void searchAnElementInList(int element) {

		Node curr = head;

		while (curr != null && curr.data != element) {

			curr = curr.next;
		}

		System.out.println("Searching an element:" + element);
		if (curr == null)
			System.out.println("Element does not exist");
		else
			System.out.println("Element exists in the list");
	}

	public void lengthOfList() {
		if (head == null)
			System.out.println("0");
		else {
			Node curr = head;
			int count = 0;
			while (curr.next != null) {
				count++;
				curr = curr.next;
			}
			System.out.println(count + 1);
		}
	}

	public void deleteANodeAtGivenPosition(int pos) {

		int counter = 1;
		if (pos < 0) {
			System.out.println("Position starts from 0 and cannot be negative");
		} else if (pos == 0) {
			head = head.next;
			return;
		} else {

			Node curr = head.next;
			Node prev = head;
			while (curr != null && counter != pos) {

				prev = curr;
				curr = curr.next;
				counter++;
			}

			if (curr == null)
				return;
			prev.next = curr.next;
		}
	}

	public void deleteANode(int key) {

		if (head.data == key) {
			head = head.next;
		} else {

			Node curr = head;
			Node prev = null;

			while (curr.next != null) {

				if (curr.data == key) {
					break;
				}
				prev = curr;
				curr = curr.next;

			}

			if (curr.next != null || (curr.next == null && curr.data == key)) {
				prev.next = curr.next;
			} else {

				System.out.println("There is no such element to be deleted");

			}
		}

		// while (temp != null && temp.data != key)
		// {
		// prev = temp;
		// temp = temp.next;
		// }
		//
		// // If key was not present in linked list
		// if (temp == null) return;
		//
		// // Unlink the node from linked list
		// prev.next = temp.next;
		// }

	}

	public void insertNodeAfterAGivenNode(Node prevNode, int data) {

		Node newNode = new Node(data);

		if (prevNode == null) {
			System.out.println("Given previous node cannot be null");
		} else {

			Node temp = head;
			while (temp != prevNode) {
				temp = temp.next;
			}
			newNode.next = prevNode.next;
			prevNode.next = newNode;

		}

	}

	public void insertNodeInFrontOfList(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void insertNodeInLastOfList(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;

			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = newNode;
		}
	}

	public void printList() {

		Node temp = head;

		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(temp.data);

	}

}
