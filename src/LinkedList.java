
import java.io.*;
import java.util.*;

class NodeLL {
	int data;
	NodeLL next;

	NodeLL(int d) {
		data = d;
		next = null;
	}

}

public class LinkedList  {                                                       // sorted Linked List
	public static NodeLL removeDuplicates(NodeLL head) {
		// Write your code here

		NodeLL curr = head;
		NodeLL curra = head.next;
		while (curr.next != null) {
			if (curr.data != curra.data) {
				curr = curr.next;
				curra = curra.next;
			} else {
				curra = curra.next;
				curr.next = curra;
			}
		}
		return head;
	}
	
	public static NodeLL removeDuplicatesUn(NodeLL head)
	{
		NodeLL curr =head;
		NodeLL prev = head;
		NodeLL curra=head.next;
		int i=1;
		Hashtable<Integer,Integer> ll = new Hashtable<Integer,Integer>();
		while(prev.next!=null)
		{
			
			if(ll.containsValue(curr.data))
			{
				if(curr.next==null)
				{
					// remove last n connect
					prev.next=null;
					
				}else
				{
					//Simply remove
					curr=curr.next;
					curra=curra.next;
					prev.next=curr;
				}
			}else
			{
				ll.put(i, curr.data);
				if(i==1)
				{
					curr=curr.next;
					curra=curra.next;
				}else
				{
					curr=curr.next;
					curra=curra.next;
					prev=prev.next;
				}
			}
			
			i++;
			
			
		}
		System.out.println(ll);
		return head;
	}

	public static NodeLL insert(NodeLL head, int data) {
		NodeLL p = new NodeLL(data);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			NodeLL start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

	public static void display(NodeLL head) {
		NodeLL start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		NodeLL head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		//head = removeDuplicates(head);
		head=removeDuplicatesUn(head);
		display(head);

	}
}
