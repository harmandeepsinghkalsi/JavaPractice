package binaryTree;


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

public class AreTreesMirror {
	
	public static void main(String[] args) {
		
		
		TreeNode a = new TreeNode(1); 
		TreeNode b = new TreeNode(1); 
        a.left = new TreeNode(2); 
        a.right = new TreeNode(3); 
        a.left.left = new TreeNode(4); 
        a.left.right = new TreeNode(5); 
  
        b.left = new TreeNode(2); 
        b.right = new TreeNode(3); 
        b.right.left = new TreeNode(5); 
        b.right.right = new TreeNode(4);
        
        System.out.println(areTreeMirror(a, b));
	}
	
	public static boolean areTreeMirror(TreeNode a , TreeNode b) {
		
		if(a== null && b ==null)
			return true;
		
		if(a==null || b==null)
			return false;
		
		return a.data==b.data && areTreeMirror(a.left, b.right) && areTreeMirror(a.right, b.left);
			

	}

}
