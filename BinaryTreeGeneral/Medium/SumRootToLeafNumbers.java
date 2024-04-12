package BinaryTreeGeneral.Medium;

import BinaryTreeGeneral.TreeNode;

public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        return sumNumbersHelper(root,0);
    }

    private int sumNumbersHelper(TreeNode root, int curSum) {
        if(root == null){
            return 0;
        }
        curSum = curSum *10 + root.val;
        if(root.left == null && root.right == null){
            return curSum;
        }
        return sumNumbersHelper(root.left, curSum) + sumNumbersHelper(root.right, curSum);
    }

}
