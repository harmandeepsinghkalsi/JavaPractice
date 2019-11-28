package dataStructures;

import java.util.ArrayList;

public class BinarySearchTree {
	
	ArrayList<Integer> al = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		TreeNode head = new TreeNode(10);
		head.left = new TreeNode(6);
		head.right = new TreeNode(20);
		head.left.left = new TreeNode(4);
		head.left.right = new TreeNode(15);
		head.right.left = new TreeNode(18);
		head.right.right = new TreeNode(35);
		BinarySearchTree bst = new BinarySearchTree();
		bst.checkIfTreeIsBST(head);
		System.out.println(bst.al);
		boolean flag = true;
		for (int i = 1; i < bst.al.size(); i++) {
			
			if(bst.al.get(i)<bst.al.get(i-1)) {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Is a binary search tree");
		} else {
			System.out.println("Not a binary search tree");
		}
	}
	
	public void checkIfTreeIsBST(TreeNode head) {
		
		
		if(head == null)
			return;
		
		checkIfTreeIsBST(head.left);
		al.add(head.data);
		checkIfTreeIsBST(head.right);
		
		
	}

}
