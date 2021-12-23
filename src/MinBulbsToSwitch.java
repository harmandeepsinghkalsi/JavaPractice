package practice;

import javafx.scene.effect.Light;

// given a switch on all the nodes and bulbs on edges, find min no of switches to be turned on to lighten the tree
class LightTree{

    int data;
    LightTree left;
    LightTree right;
    boolean isOn;

    LightTree(int data, LightTree l , LightTree r , boolean isOn){
        this.data = data;
        this.left = l;
        this.right = r;
        this.isOn = isOn;
    }
    LightTree(){}
}

enum SwitchState { HAS_SWITCH_ON, COVERED, PLEASE_COVER };

public class MinBulbsToSwitch {

    static int minCount = 0;
    public static void main(String[] args) {

        LightTree root = new LightTree();

        root.data = 1;
        root.isOn = false;
        root.left = new LightTree(2,null,null,false);
        root.right = new LightTree(3,null,null,false);
        root.left.left = new LightTree(4,null,null,false);
        root.left.left.left = new LightTree(5,null,null,false);

        if(findMinSwitch(root) == SwitchState.PLEASE_COVER){
            minCount++;
        }
        System.out.println(minCount);

    }

    public static SwitchState findMinSwitch(LightTree root){

        if(root == null)
            return SwitchState.COVERED;

        // go to left

        SwitchState left = findMinSwitch(root.left);

        //go to right

        SwitchState right = findMinSwitch(root.right);

        // any of the child switch is not on , this node should have switch on
        if(left == SwitchState.PLEASE_COVER || right == SwitchState.PLEASE_COVER){
            minCount+=1;
            return SwitchState.HAS_SWITCH_ON;
        }
        // any of child has switch on , no need of switching this on
        if(left == SwitchState.HAS_SWITCH_ON || right == SwitchState.HAS_SWITCH_ON )
            return SwitchState.COVERED;

        return SwitchState.PLEASE_COVER; // ask parent to help
    }
}
