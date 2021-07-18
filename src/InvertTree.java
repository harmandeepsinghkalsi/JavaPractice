
class TreeNodeCustom {
 
	int val;
	TreeNodeCustom left;
	TreeNodeCustom right;
	TreeNodeCustom() {}
      TreeNodeCustom(int val) { this.val = val; }
      TreeNodeCustom(int val, TreeNodeCustom left, TreeNodeCustom right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
  }

public class InvertTree {
	
public static void main(String[] args) {
		
	TreeNodeCustom obj = new TreeNodeCustom(4);
		obj.left = new TreeNodeCustom(2);
		obj.right = new TreeNodeCustom(7);
		obj.left.left = new TreeNodeCustom(1);
		obj.left.right = new TreeNodeCustom(3);
		obj.right.left = new TreeNodeCustom(6);
		obj.right.right = new TreeNodeCustom(9);
		
		invert(obj);	
		
	}
	
	public static TreeNodeCustom invert (TreeNodeCustom root) {
	
		if(root== null)
			return null;
		
		
		TreeNodeCustom temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		if(root.left != null)
			root.left = invert(root.left);
		if(root.right!=null)
			root.right=invert(root.right);
	
		
		return root;
	}
}
