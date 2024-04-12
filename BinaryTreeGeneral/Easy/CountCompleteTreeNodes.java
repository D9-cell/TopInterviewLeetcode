package BinaryTreeGeneral.Easy;

import BinaryTreeGeneral.TreeNode;

public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        int leftDep = leftDepth(root);
        int rightDep = rightDepth(root);

        if(leftDep == rightDep){
            return (int) Math.pow(2,leftDep)-1;
        }else{
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }

    private int leftDepth(TreeNode root){
        int depth = 0;
        while (root != null){
            root = root.right;
            depth++;
        }
        return depth;
    }

    private int rightDepth(TreeNode root){
        int depth = 0;
        while (root != null){
            root = root.left;
            depth++;
        }
        return depth;
    }
}
