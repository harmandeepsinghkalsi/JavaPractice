package practice;


class TreeNode {
      public int val;
      public TreeNode left;
      public TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class isSymTree {

    TreeNode root;
    public static void main(String[] args) {


        isSymTree tree_level = new isSymTree();
        tree_level.root = new TreeNode(2);
        tree_level.root.left = new TreeNode(3);
        tree_level.root.right = new TreeNode(3);
        tree_level.root.left.left = new TreeNode(4);
        tree_level.root.left.right = new TreeNode(5);
        tree_level.root.right.left = new TreeNode(5);
        tree_level.root.right.right = new TreeNode(4);
        tree_level.root.left.right.left = new TreeNode(8);
        tree_level.root.left.right.right = new TreeNode(9);
        tree_level.root.right.left.left = new TreeNode(9);
        tree_level.root.right.left.right = new TreeNode(10);

        System.out.println(isMirror(tree_level.root,tree_level.root));

    }

    public static boolean isMirror(TreeNode node1, TreeNode node2){

        if(node1 == null && node2 == null)
            return true;

        if(node1 !=null && node2 != null && node1.val == node2.val)
            return (isMirror(node1.left, node2.right) && isMirror(node1.right,node2.left));

        return false;
    }

}
