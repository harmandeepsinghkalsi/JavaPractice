import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BST {
	
	static int T =0;
	static int arr[];
	static int i;

	// Insertion in a Binary Search Tree
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node curr;
			if (data <= root.data) {
				curr = insert(root.left, data);
				root.left = curr;
			} else {
				curr = insert(root.right, data);
				root.right = curr;
			}
			return root;
		}

	}

	 public static int getHeight(Node root)
	 {
		 
		 if(root==null)
		 {
			 return -1;
		 }
	
		 else{
			 //height of each subtree	
			 int lheight= getHeight(root.left);
			 int rheight=getHeight(root.right);
			 
			 //got for larger one
			 if(lheight>rheight)
				 return(lheight+1);
			 else return(rheight+1);
		 }
	 	
	 }

	// Post Order Traversal in BST
	public static void printPostOrder(Node root) {
		if (root == null) {
			return;
		}
		printPostOrder(root.left);

		printPostOrder(root.right);

		System.out.println(root.data);
	}

	// Pre Order Traversal in BST
	public static void printPreOrder(Node root) {
		if (root == null) {
			return;
		}

		System.out.println(root.data);

		printPreOrder(root.left);

		printPreOrder(root.right);

	}

	// In Order Traversal in BST
	
	
	public static void printInOrder(Node root) {
		if (root == null) {
			return;
		}
		
//
//		printInOrder(root.left);
//		
//		System.out.println(root.data);
//
//		printInOrder(root.right);
		
		printInOrder(root.left);
		
		arr[i]=root.data;
		i++;
		
		printInOrder(root.right);
		
	}
	
	
	//Level Order Traversal in BST(method1)
	
	public static void levelOrder(Node root)
	{
		int h= getHeight(root);
		int i ;
		for ( i = 0; i <= h; i++) {
			givenLevel(root,i);
		}
		
	}
	
	// print given level 
	
	public static void givenLevel(Node root,int level)
	{
		if(root==null)
		{
			return;
		}
		if(level==0)
		{
			System.out.println(root.data + " ");
		}
		else if (level>0)
		{
			givenLevel(root.left, level-1);
            givenLevel(root.right, level-1);
		}
	}
	
	
	// Level Order Traversal in BST (method2 using Queue)
	public static void printLevelOrder(Node root)
	{
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node tempNode= queue.poll();
			System.out.println(tempNode.data + " ");
			
			if(tempNode.left!=null)
			{
				queue.add(tempNode.left);
			}
			
			if(tempNode.right!=null)
			{
				queue.add(tempNode.right);
			}
		}
	}
	
	
	//Spiral Traversal in BST (Recursive approach)
	public static void spiralTraversal(Node root)
	{
		boolean levelVar=false;
		int h= getHeight(root);
		for (int i = 0; i <=h; i++) {
			printGivenLevel(root,i,levelVar);
			levelVar=!levelVar;
		}
	}
	
	
	//print present level elements
	public static void printGivenLevel(Node root,int level,boolean levelVar)
	{
		if(root==null)
			return ;
		if (level==0)
			System.out.println(root.data + " ");
		else if(level>0)
		{
			if(levelVar)
			{
				printGivenLevel(root.left,level-1,levelVar);
				printGivenLevel(root.right,level-1,levelVar);
			}else
			{
				printGivenLevel(root.right,level-1,levelVar);
				printGivenLevel(root.left,level-1,levelVar);
			}
		}
	}
	
	
	//Spiral Traversal of BST (using stacks ---Iterative approach)
	
	public static void printSpiral(Node root)
	{
		if(root==null)
			return;
		
		Stack<Node> s1= new Stack<Node>();//from right to left
		Stack<Node> s2= new Stack<Node>();//from left to right
		
		 s1.push(root);
		 
	        // Keep printing while any of the stacks has some nodes
	        while (!s1.empty() || !s2.empty()) 
	        {
	            // Print nodes of current level from s1 and push nodes of
	            // next level to s2
	            while (!s1.empty()) 
	            {
	                Node temp = s1.peek();
	                s1.pop();
	                System.out.print(temp.data + " ");
	 
	                // Note that is right is pushed before left
	                if (temp.right != null) 
	                    s2.push(temp.right);
	                 
	                if (temp.left != null) 
	                    s2.push(temp.left);
	                 
	            }
	 
	            // Print nodes of current level from s2 and push nodes of
	            // next level to s1
	            while (!s2.empty()) 
	            {
	                Node temp = s2.peek();
	                s2.pop();
	                System.out.print(temp.data + " ");
	 
	                // Note that is left is pushed before right
	                if (temp.left != null)
	                    s1.push(temp.left);
	                if (temp.right != null)
	                    s1.push(temp.right);
	            }
	        }
	}
	
	
	//Searching in BST
	public static boolean search(Node root, int data)
	{
		Node current = root;
		while(current!=null){
			if(current.data==data){
				return true;
			}else if(current.data>data){
				current = current.left;
			}else{
				current = current.right;
			}
		}
		return false;
	}
	
	

	//Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T= sc.nextInt();
		int data=0;
		arr = new int[T];
		i=0;
		Node root = null;
		while (T-- > 0) {
			 data = sc.nextInt();
			root = insert(root, data);
		}
		
		System.out.println("Height of the tree is:");// Height of a BST
		int height = getHeight(root);
		System.out.println(height);
		
		
		System.out.println("Post Order Traversal is:");//Post Order Traversal of BST
		printPostOrder(root);
		
		
		System.out.println("Pre Order Traversal is:");//Pre Order Traversal of BST
		printPreOrder(root);
		
		
		System.out.println("In Order Traversal is:");
		//In Order Traversal of a BST
		
		printInOrder(root);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("printing array from Inorder traversal"+arr[i]);
		}
		
		
		
		System.out.println("(Method 1---->)Level Order traversal of BST is:");//Level Order Traversal of a BST(recursive approach)
		levelOrder(root);
		
		
		System.out.println("(Method 2---->)Level Order traversal of BST is:");//Level Order Traversal of a BST(using queues)
		printLevelOrder(root);
		
		
		System.out.println("(Recursive approach----->)Spiral Traversal of BST is:");//Spiral Traversal of a BST(Recursive)
		spiralTraversal(root);
		
		System.out.println("(Iterative approach----->)Spiral Traversal of BST is:");//Spiral Traversal of a BST(Iterative)
		printSpiral(root);
		
		
		System.out.println("Searching in a BST:");//Searching a BST
		System.out.println("Enter the data you want to search in BST:");
		data=sc.nextInt();
		boolean searchResult=search(root,data);

		 if(searchResult==true)
			 System.out.println(data + " is found");
		 else
			 System.out.println(data + " is not found");

	}
}
