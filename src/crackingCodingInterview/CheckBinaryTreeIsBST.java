
//This is one approach using the recursion . 

// other approach can be using the in order traversal of the tree . If the array comes out to be in ascending order , it is a BST else not .
package crackingCodingInterview;

import java.util.HashMap;

import crackingCodingInterview.DetectCycleInList.Node;

public class CheckBinaryTreeIsBST {

	static Node root;

	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
		}
	}

	HashMap<Integer, Integer> hm = new HashMap<>();

	static int i = 0;
	static int min =Integer.MIN_VALUE;
	static int max = Integer.MAX_VALUE;

	boolean checkBST(Node root) {

//		Node current = root;
//
//		if (current == null)
//			return false;
//		
//		 if (current.data < min || current.data > max)
//			            return false;
//
//		// if duplicates are present , it is not a BST
//		if (isPresent(current.data))
//			return false;
//
//		// check if left node is smaller than current node
//		if (current.left != null) {
//			if (current.left.data < current.data && current.left.data < max) {
//				max=current.data-1;
//				checkBST(current.left);
//
//			} else
//				return false;
//		} else {
//			return true;
//		}
//
//		// check if right node is greater than current node
//		if (current.right != null) {
//			if (current.right.data > current.data && current.right.data > min) {
//				min=current.data+1;
//				checkBST(current.right);
//
//			} else
//				return false;
//		} else {
//			return true;
//		}
//
//		return true;
		
		
		
		
		return isBSTUtil(root, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
}

/* Returns true if the given tree is a BST and its
values are >= min and <= max. */
boolean isBSTUtil(Node node, int min, int max)
{
/* an empty tree is BST */
if (node == null)
return true;

/* false if this node violates the min/max constraints */
if (node.data < min || node.data > max)
return false;

/* otherwise check the subtrees recursively
tightening the min/max constraints */
// Allow only distinct values
return (isBSTUtil(node.left, min, node.data-1) &&
 isBSTUtil(node.right, node.data+1, max));
	}

//	// check the duplicates
//	boolean isPresent(int data) {
//
//		if (hm.containsValue(data)) {
//			return true;
//		} else {
//			hm.put(i, data);
//			i++;
//			return false;
//		}
//
//	}

	// main method

	public static void main(String args[]) {
		// Scanner sc = new Scanner(System.in);
		// Node head = null;
		// int T = sc.nextInt();
		// while (T-- > 0) {
		// int ele = sc.nextInt();
		// head = insert(head, ele);
		// }

		CheckBinaryTreeIsBST list = new CheckBinaryTreeIsBST();

		list.root = list.new Node(4);
		
		
		list.root.right = list.new Node(6);
		list.root.left = list.new Node(2);
		list.root.right.right = list.new Node(7);
		list.root.right.left = list.new Node(5);
		list.root.left.left = list.new Node(1);
		list.root.left.right = list.new Node(3);

		// Creating a loop for testing
		// head.next.next.next.next.next = head.next.next;
		Boolean result = list.checkBST(root);
		// head = removeDuplicates(head);
		// head=removeDuplicatesUn(head);

		System.out.println(result);
		// display(head);

	}
}
