package dataStructures;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

import practice.ReverseArrayInGroups;

class Node {

	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	public static Node head;
	
	public int addNumberInLinkedList(Node first, Node second) {
		
		
		int sum = 0;
		
		while(first!=null) {
			
		}
		return sum;
	}
	
	 public void pairwise_swap()
	    {
	        // your code here
	        
		 // just call the method with count equal to 2
	         reverseListInGroupOfGivenSize(2);
	        
	      
	    }
	
//	Another method to merge the sorted linked list
//	Node sortedMerge(Node headA, Node headB) {
//	     // This is a "method-only" submission. 
//	     // You only need to complete this method
//	     
//	     Node sorted = null;
//	     Node sortingP = null;
//	     if(headA==null)
//	     return headB;
//	     if(headB==null)
//	     return headA;
//	     
//	     if(headA.data>=headB.data){
//	         sortingP = headB;
//	         headB=headB.next;
//	     } else {
//	         sortingP = headA;
//	         headA=headA.next;
//	     }
//	     
//	     sorted = sortingP;
//	     
//	     while(headA!=null && headB!=null){
//	         
//	         if(headA.data>=headB.data){
//	         sortingP.next = headB;
//	         sortingP = headB;
//	         headB = sortingP.next;
//	     } else {
//	         sortingP.next = headA;
//	         sortingP = headA;
//	         headA = sortingP.next;
//	     }
//	     
//	     }
//	     
//	     if(headA==null)
//	     sortingP.next=headB;
//	     else
//	     sortingP.next= headA;
//	     
//	     
//	     return sorted;
//	   } 
	
	// https://www.youtube.com/watch?v=j_UNYW6Ap0k
	public Node mergeSortedList(Node h1, Node h2) {
	  
	    // Merges two lists with headers as h1 and h2. 
	    // It assumes that h1's data is smaller than 
	    // or equal to h2's data. 

	        // if only one node in first list 
	        // simply point its head to second list 
	        if (h1.next == null) { 
	            h1.next = h2; 
	            return h1; 
	        } 
	  
	        // Initialize current and next pointers of 
	        // both lists 
	        Node curr1 = h1, next1 = h1.next; 
	        Node curr2 = h2, next2 = h2.next; 
	  
	        while (next1 != null && curr2 != null) { 
	            // if curr2 lies in between curr1 and next1 
	            // then do curr1->curr2->next1 
	            if ((curr2.data) >= (curr1.data) && (curr2.data) <= (next1.data)) { 
	                next2 = curr2.next; 
	                curr1.next = curr2; 
	                curr2.next = next1; 
	  
	                // now let curr1 and curr2 to point 
	                // to their immediate next pointers 
	                curr1 = curr2; 
	                curr2 = next2; 
	            } 
	            else { 
	                // if more nodes in first list 
	                if (next1.next != null) { 
	                    next1 = next1.next; 
	                    curr1 = curr1.next; 
	                } 
	  
	                // else point the last node of first list 
	                // to the remaining nodes of second list 
	                else { 
	                    next1.next = curr2; 
	                    return h1; 
	                } 
	            } 
	        } 
	        return h1; 
	    } 
	  
	    // Merges two given lists in-place. This function 
	    // mainly compares head nodes and calls mergeUtil() 
	    
	 Node merge(Node h1, Node h2) 
    { 
        if (h1 == null) 
            return h2; 
        if (h2 == null) 
            return h1; 
  
        // start with the linked list 
        // whose head data is the least 
        if (h1.data < h2.data) 
            return mergeSortedList(h1, h2); 
        else
            return mergeSortedList(h2, h1); 
    } 
	
	// delete the node whose ref is given and no head reference is given.
	public void deleteNode(Node node)
    {
         // Your code here
         Node curr = node;
         if(curr.next==null){
             curr = null;
         } else {
             curr.data = curr.next.data;
             curr.next = curr.next.next;
         }
    }
	
	
	public int findIntersection(Node headA , Node headB) {
		
	         // code here
	         Node firstList = headA;
	         while(firstList!=null){
	             firstList.data = -firstList.data;
	             firstList = firstList.next;
	         }
	         
	        Node secondList = headB;

	         while(secondList!=null){
	             if(secondList.data<0){
	                 return -secondList.data;
	             } else{
	                 secondList=secondList.next;
	             }
	         }
	         
	         return -1;
		}
	

	public void removeLoop() {
		
		 //Your code here
        Node prev = null;
        Node curr = head;
        
        Set<Node> hm = new HashSet<>();
        while(curr!=null){
            if(hm.contains(curr)){
                prev.next = null;
                break;
            } else {
                hm.add(curr);
            }
            prev=curr;
            curr=curr.next;
            
        }
	}
	
	//Method1: Once we find loop is present , set one pointer to head, and other where slowP=fastP, Now move slowP one
	// by one and check , we ptr from head is reachable.
//	 void removeLoop(Node loop, Node curr) 
//	    { 
//	        Node ptr1 = null, ptr2 = null; 
//	  
//	        /* Set a pointer to the beging of the Linked List and 
//	         move it one by one to find the first node which is 
//	         part of the Linked List */
//	        ptr1 = curr; 
//	        while (1 == 1) { 
//	  
//	            /* Now start a pointer from loop_node and check if it ever 
//	             reaches ptr2 */
//	            ptr2 = loop; 
//	            while (ptr2.next != loop && ptr2.next != ptr1) { 
//	                ptr2 = ptr2.next; 
//	            } 
//	  
//	            /* If ptr2 reahced ptr1 then there is a loop. So break the 
//	             loop */
//	            if (ptr2.next == ptr1) { 
//	                break; 
//	            } 
//	  
//	            /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
//	            ptr1 = ptr1.next; 
//	        } 
//	  
//	        /* After the end of loop ptr2 is the last node of the loop. So 
//	         make next of ptr2 as NULL */
//	        ptr2.next = null; 
//	    }
	
	//Method2: Here we have to check the count of node in a loop . Then move one ptr from head k times . Now increment
	// the head ptr and slowP . they will meet at start of the loop.
//	void removeLoop(Node loop, Node head) 
//    { 
//        Node ptr1 = loop; 
//        Node ptr2 = loop; 
//  
//        // Count the number of nodes in loop 
//        int k = 1, i; 
//        while (ptr1.next != ptr2) { 
//            ptr1 = ptr1.next; 
//            k++; 
//        } 
//  
//        // Fix one pointer to head 
//        ptr1 = head; 
//  
//        // And the other pointer to k nodes after head 
//        ptr2 = head; 
//        for (i = 0; i < k; i++) { 
//            ptr2 = ptr2.next; 
//        } 
//  
//        /*  Move both pointers at the same pace, 
//         they will meet at loop starting node */
//        while (ptr2 != ptr1) { 
//            ptr1 = ptr1.next; 
//            ptr2 = ptr2.next; 
//        } 
//  
//        // Get pointer to the last node 
//        while (ptr2.next != ptr1) { 
//            ptr2 = ptr2.next; 
//        } 
//  
//        /* Set the next node of the loop ending node 
//         to fix the loop */
//        ptr2.next = null; 
//    } 
	
	//Method 3: need not count the node in loop . just start slowP from head and fastP from meeting point at same pace 
	// they will meet at start of the loop
	
//	void detectAndRemoveLoop(Node node) 
//    { 
//  
//        // If list is empty or has only one node 
//        // without loop 
//        if (node == null || node.next == null) 
//            return; 
//  
//        Node slow = node, fast = node; 
//  
//        // Move slow and fast 1 and 2 steps 
//        // ahead respectively. 
//        slow = slow.next; 
//        fast = fast.next.next; 
//  
//        // Search for loop using slow and fast pointers 
//        while (fast != null && fast.next != null) { 
//            if (slow == fast) 
//                break; 
//  
//            slow = slow.next; 
//            fast = fast.next.next; 
//        } 
//  
//        /* If loop exists */
//        if (slow == fast) { 
//            slow = node; 
//            while (slow.next != fast.next) { 
//                slow = slow.next; 
//                fast = fast.next; 
//            } 
//  
//            /* since fast->next is the looping point */
//            fast.next = null; /* remove loop */
//        } 
//    } 
  
	public void checkIfListIsPallindrome() {
		
		Node temp = head;
		ArrayList<Integer> al = new ArrayList<>();
		while(temp!=null) {
			al.add(temp.data);
			temp=temp.next;
		}
		
		
		Integer arr[] = al.toArray(new Integer[al.size()]);
		boolean isPallindrome = true;
		for (int i = 0,j=arr.length-1; i < j; i++,j--) {
			if(arr[i]==arr[j])
				continue;
			else {
				isPallindrome = false;
				break;
			}
		}
		
		if(isPallindrome)
		{
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public void reverseListInGroupOfGivenSize(int size) {

		Node temp = head;
		ArrayList<Integer> al = new ArrayList<>();
		while (temp != null) {
			al.add(temp.data);
			temp = temp.next;
		}

		Integer arr[] = al.toArray(new Integer[al.size()]);
		arr = rotateArrayInGroup(arr, size);
		
		temp = head;
		int i = 0;
		while(temp!=null) {
			temp.data=arr[i];
			temp=temp.next;
			i++;
		}
		printList();
	}

	public  Integer[] rotateArrayInGroup(Integer arr[], int groupSize) {
		
		for (int i = 0; i < arr.length; i += groupSize) {

			int left = i;
			int right = Math.min(left + groupSize - 1, arr.length - 1);

			while (left < right) {

				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
		
		return arr;
	}
	
	// Method 2
//	Node reverse(Node head, int k) 
//    { 
//       Node current = head; 
//       Node next = null; 
//       Node prev = null; 
//         
//       int count = 0; 
//  
//       /* Reverse first k nodes of linked list */
//       while (count < k && current != null)  
//       { 
//           next = current.next; 
//           current.next = prev; 
//           prev = current; 
//           current = next; 
//           count++; 
//       } 
//  
//       /* next is now a pointer to (k+1)th node  
//          Recursively call for the list starting from current. 
//          And make rest of the list as next of first node */
//       if (next != null)  
//          head.next = reverse(next, k); 
//  
//       // prev is now head of input list 
//       return prev; 
//    } 
	
	//Method3
//	Node reverse(Node head, int k) {
//		
//		Node current = head;
//		Node prev = null;
//		Stack<Node> myStack = new Stack<>();
//		
//		while(current!=null) {
//		int count=0;
//		while(current!=null && count <k) {
//			myStack.push(current);
//			count++;
//			current=current.next;
//		}
//		
//		while(!myStack.isEmpty()) {
//			
//			if(prev==null) {
//				prev = myStack.peek();
//				head=prev;
//				myStack.pop();
//			} else {
//				prev.next=myStack.peek();
//				prev = prev.next;
//				myStack.pop();
//			}
//		}	
//		
//	}
//		prev.next=null;
//		return head;
//	}

	public void reverseList() {

		Node prev = null;
		Node curr = head;
		Node currNext = curr.next;
		// add code here
		if (head != null) {
			while (currNext != null) {

				curr.next = prev;
				prev = curr;
				curr = currNext;
				currNext = currNext.next;
			}
			curr.next = prev;
			prev = curr;
			head = prev;
			System.out.println("List in reverse order is:");
			printList();
		}
	}

	public void segO12InList() {

		int counter0 = 0;
		int counter1 = 0;
		int counter2 = 0;

		Node temp = head;
		while (temp != null) {
			if (temp.data == 0)
				counter0++;
			else if (temp.data == 1)
				counter1++;
			else
				counter2++;

			temp = temp.next;
		}

		temp = head;
		while (temp != null) {

			for (int i = 0; i < counter0; i++) {
				temp.data = 0;
				temp = temp.next;
			}
			for (int i = 0; i < counter1; i++) {
				temp.data = 1;
				temp = temp.next;
			}
			for (int i = 0; i < counter2; i++) {
				temp.data = 2;
				temp = temp.next;
			}
		}
		System.out.println("List after segregating 0s, 1s and 2s is :");
		printList();
	}

	public void rotateList(int k) {

		ArrayList<Integer> al = new ArrayList<>();
		Node temp = head;
		while (temp != null) {
			al.add(temp.data);
			temp = temp.next;
		}
		// positive for clockwise and negative for anticlockwise

		Collections.rotate(al, -k);

		temp = head;
		int count = 0;
		while (temp != null) {
			temp.data = al.get(count);
			temp = temp.next;
			count++;
		}
		System.out.println("List after " + k + " rotations is:");
		printList();
		// there is one more way to rotate the list . Traverse till the kth node .
		// assign to some variable.
		// traverse till the last of the list . point the next of last node to the
		// existing head.
		// new head should be k+1th node that is kth.next and kth node .next should be
		// null.

	}

	public void NthElementFromLast(int n) {

		int nCopy = n;
		Node p1 = head;
		Node item = head;

		if (lengthOfList() < n)
			System.out.println("N specified is greater than the length of the list");
		else {
			while (n > 0) {
				p1 = p1.next;
				n--;
			}

			while (p1 != null) {
				p1 = p1.next;
				item = item.next;
			}

			System.out.println("" + nCopy + "th element from last is: " + item.data);
		}
	}

	// trick to find the intersection of the two linked lists. Traverse LL1 and make
	// all the numbers as negative
	// Now traverse the LL2 and you find any number which is negative return that
	// number since that is the intersection

	// public void intersectionOfTwoLL()

	public void middleElement() {

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		System.out.println("middle element of the list is: " + slow.data);
	}

	public int lengthOfList() {
		Node temp = head;
		int length = 0;
		while (temp != null) {
			length++;
			temp = temp.next;
		}
		return length;
	}

	public void insertEnd(int data) {

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
	
	Node newNode(int key) 
    { 
        Node temp = new Node(key); 
        temp.data = key; 
        temp.next = null; 
        return temp; 
    }

	public static void main(String args[]) {

		LinkedList l = new LinkedList();
		l.insertEnd(1);
		l.insertEnd(2);
		l.insertEnd(0);
		l.insertEnd(2);
		l.insertEnd(1);
		l.insertEnd(2);
		l.insertEnd(1);
		l.insertEnd(0);
		l.printList();
		l.middleElement();
		l.NthElementFromLast(3);
		l.rotateList(4);
		l.segO12InList();
		l.reverseList();
		l.reverseListInGroupOfGivenSize(4);
//		head = l.reverse(head, 4);
//		l.printList();
		l.checkIfListIsPallindrome();
		Node head1 = l.newNode(1); 
        head1.next = l.newNode(3); 
        head1.next.next = l.newNode(5); 
  
        // 1->3->5 LinkedList created 
  
        Node head2 = l.newNode(0); 
        head2.next = l.newNode(2); 
        head2.next.next = l.newNode(4); 
  
        // 0->2->4 LinkedList created 
  
        Node mergedhead = l.merge(head1, head2);
        
        char array_variable [] = new char[10];
	    for (int i = 0; i < 10; ++i) {
                array_variable[i] = 'i';
                System.out.print(array_variable[i] + "" );
                i++;
            }
		
	    Stack<Integer> st = new Stack<>();
	    st.push(1);
	    st.push(2);
	    st.peek();
	}

}
