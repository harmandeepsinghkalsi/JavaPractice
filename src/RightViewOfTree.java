package practice;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNodePair{
    TreeNode node;
    int level;

    TreeNodePair(TreeNode node, int level){
        this.node = node;
        this.level = level;
    }
}


public class RightViewOfTree {

    public static void main(String[] args) {

        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(5);
        t.left.right = new TreeNode(3);
        //t.right.left = new TreeNode(6);
        t.right.right = new TreeNode(9);
        //t.left.left.left = new TreeNode(8);
        //rightView(t);

        test(t);
    }

    public static void test(TreeNode t){



        ArrayList<Integer> al = new ArrayList<>();

        Queue<TreeNodePair> queue = new LinkedList<>();
        int level = 0;
        queue.add(new TreeNodePair(t,level));
        al.add(0,t.val);

        while(!queue.isEmpty()){

            TreeNodePair p = queue.poll();

            int currLevel = p.level;

            if(al.size() == currLevel){
                al.add(p.node.val);
            }
            if (al.get(currLevel)< p.node.val){
                al.set(currLevel,p.node.val);
            }

            level = currLevel+1;
            if(p.node.left!=null){
                queue.add(new TreeNodePair(p.node.left,level));
            }

            if(p.node.right != null){
                queue.add(new TreeNodePair(p.node.right,level));
            }
        }
    }

    public static void rightView(TreeNode t){

        Queue<TreeNodePair> q = new LinkedList<>();
        int level = 0;
        List<Integer> list = new ArrayList<>();

        q.add(new TreeNodePair(t,level));

        while(!q.isEmpty()){

            TreeNodePair pair = q.poll();
            if(pair.level == level){
                list.add(pair.node.val);
                level=level+1;
            }

            if(pair.node.right != null){
                q.add(new TreeNodePair(pair.node.right,level));
            }
            if(pair.node.left != null){
                q.add(new TreeNodePair(pair.node.left,level));
            }

        }

    }
}
