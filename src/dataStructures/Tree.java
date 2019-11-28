package dataStructures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

class TreeNode {

	int data;
	TreeNode left;
	TreeNode right;

	TreeNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class TopViewObj{
	
	int hPos;
	TreeNode node;
	
	TopViewObj(int hPos, TreeNode node){
		this.hPos=hPos;
		this.node = node;
	}
}

public class Tree {
	
	int maxLevel = 0;
	Map<Integer, TreeNode> topViewMap = new TreeMap<>();
	Queue<TopViewObj> topViewQueue = new LinkedList<>();

	public static void main(String[] args) {

		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(3);
		head.left.left = new TreeNode(4);
		head.left.right = new TreeNode(5);
		head.right.left = new TreeNode(6);
		head.right.right = new TreeNode(7);
		head.left.left.right = new TreeNode(8);
		
		TreeNode head1 = new TreeNode(1);
		head1.left = new TreeNode(2);
		head1.right = new TreeNode(3);
		head1.left.left = new TreeNode(4);
		head1.left.right = new TreeNode(5);
		head1.right.left = new TreeNode(6);
		head1.right.right = new TreeNode(7);
		head1.left.left.right = new TreeNode(8);
		

		Tree t = new Tree();
		System.out.println("Are the two trees identical?");
		boolean status = t.checkIfTreesAreIdentical(head,head1);
		if(status) {
			System.out.print("Trees are identical");
		} else {
			System.out.print("Trees are not identical");
		}
		System.out.println();
		System.out.print("Inorder Traversal is: ");
		t.inOrderTraversal(head);
		System.out.println("Inorder Traversal Iterative is: ");
		t.inOrderIterativeTraversal(head);
		System.out.println();
		System.out.print("Preorder Traversal is: ");
		t.preOrderTraversal(head);
		System.out.println();
		System.out.print("Postorder Traversal is: ");
		t.postOrderTraversal(head);
		System.out.println();
		System.out.print("Level Order Traversal is: ");
		t.levelOrderTraversal(head);
		System.out.println();
		System.out.print("Left view of the tree is: ");
		t.leftViewOfTree(head,0);
		System.out.println();
		System.out.print("Right view of tree is: ");
		t.rightViewOfTree(head);
		System.out.println();
		System.out.print("Height of the tree is: ");
		System.out.println(t.heightOfTree(head));
		System.out.print("Top View of tree is: ");
		t.topViewOfTree(head, 0);
		System.out.println();
		System.out.print("Bottom View of tree is: ");
		t.bottomViewOfTree(head, 0);
		

	}
	
	
	public boolean checkIfTreesAreIdentical(TreeNode head , TreeNode head1) {
		
		if(head == null && head1 == null)
			return true;
		
		return (head!=null&&head1!=null&&head.data==head1.data&&checkIfTreesAreIdentical(head.left, head1.left)
				&& checkIfTreesAreIdentical(head.right, head1.right));
	}

	public int heightOfTree(TreeNode head) {
		
		if(head==null)
			return 0;
		
		int leftHeight = heightOfTree(head.left);
		int rightHeight = heightOfTree(head.right);
		
		return 1+Math.max(leftHeight, rightHeight);
		
	}
	public void inOrderTraversal(TreeNode head) {

		if (head == null)
			return;

		inOrderTraversal(head.left);
		System.out.print(head.data + " ");
		inOrderTraversal(head.right);

	}
	
	public void inOrderIterativeTraversal(TreeNode head) {
		
		
	}

	public void preOrderTraversal(TreeNode head) {
		if (head == null)
			return;

		System.out.print(head.data + " ");
		preOrderTraversal(head.left);
		preOrderTraversal(head.right);

	}

	public void postOrderTraversal(TreeNode head) {
		if (head == null)
			return;

		postOrderTraversal(head.left);
		postOrderTraversal(head.right);
		System.out.print(head.data + " ");

	}

	public void levelOrderTraversal(TreeNode head) {

		Queue<TreeNode> queue = new java.util.LinkedList<>();

		queue.add(head);

		while (!queue.isEmpty()) {

			TreeNode element = queue.peek();
			System.out.print(element.data + " ");
			queue.poll();

			if (element.left != null)
				queue.add(element.left);
			if (element.right != null)
				queue.add(element.right);
		}

	}

	public void leftViewOfTree(TreeNode head, int level) {

//		Queue<TreeNode> queue = new java.util.LinkedList<>();
//
//		queue.add(head);
//
//		while (!queue.isEmpty()) {
//			int size = queue.size();
//			for (int i = 0; i < size; i++) {
//				TreeNode element = queue.poll();
//				if(i==0)
//					System.out.print(element.data + " ");
//
//				if (element.left != null)
//					queue.add(element.left);
//				if (element.right != null)
//					queue.add(element.right);
//			}
//			
//		}
		if(head == null)
			return;
		
		
		if(level>=maxLevel) {
			System.out.print(head.data+" ");
			maxLevel++;
		}
		
		leftViewOfTree(head.left, level+1);
		leftViewOfTree(head.right, level+1);
		

	}
	
	public void rightViewOfTree(TreeNode head) {
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		
		queue.add(head);
		
		while(!queue.isEmpty()) {
			
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode element = queue.poll();
				
				if(i==0) {
					System.out.print(element.data+" ");
				}
				
				if(element.right!=null)
					queue.add(element.right);
				if(element.left!=null)
					queue.add(element.left);
			}
		}
	}
	
	public void topViewOfTree(TreeNode head , int pos) {
		
			if(head==null)
				return;
			
			topViewQueue.add(new TopViewObj(pos, head));
			
			while(!topViewQueue.isEmpty()) {
				
				
				TopViewObj topNode = topViewQueue.poll();
				
				if(!topViewMap.containsKey(topNode.hPos)) {
					topViewMap.put(topNode.hPos, topNode.node);
				}
				
				if(topNode.node.left!=null)
					topViewQueue.add(new TopViewObj(topNode.hPos-1, topNode.node.left));
				
				if(topNode.node.right!=null)
					topViewQueue.add(new TopViewObj(topNode.hPos+1, topNode.node.right));
			}
			
			for (Entry<Integer, TreeNode> entry: topViewMap.entrySet()) {
				System.out.print(entry.getValue().data+" ");
			}
		
	}
	
	public void bottomViewOfTree(TreeNode head, int pos) {
		
		if(head==null)
			return;
		
		topViewQueue.add(new TopViewObj(pos, head));
		
		while(!topViewQueue.isEmpty()) {
			
			
			TopViewObj topNode = topViewQueue.poll();
			
			if(!topViewMap.containsKey(topNode.hPos)) {
				topViewMap.put(topNode.hPos, topNode.node);
			} else {
				topViewMap.replace(topNode.hPos, topNode.node);
			}
			
			if(topNode.node.left!=null)
				topViewQueue.add(new TopViewObj(topNode.hPos-1, topNode.node.left));
			
			if(topNode.node.right!=null)
				topViewQueue.add(new TopViewObj(topNode.hPos+1, topNode.node.right));
		}
		
		for (Entry<Integer, TreeNode> entry: topViewMap.entrySet()) {
			System.out.print(entry.getValue().data+" ");
		}
	}
	
	
}
