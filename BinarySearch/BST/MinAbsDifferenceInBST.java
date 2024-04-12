package BinarySearch.BST;

import BinaryTreeGeneral.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinAbsDifferenceInBST {


//    int min = Integer.MAX_VALUE;
//    Integer prev = null;
//    public int getMinimumDifference(TreeNode root) {
//        inOrder(root);
//        return min;
//    }
//    public void inOrder(TreeNode root){
//        if(root==null) return;
//
//        inOrder(root.left);
//        if (prev != null) {
//            min = Math.min(min, root.val - prev);
//        }
//        prev = root.val;
//
//        inOrder(root.right);
//
//    }
    public int getMinimumDifference(TreeNode root) {
        List<Integer> inorder = getInorder(root);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < inorder.size()-1; i++) {
            min = Math.min(min , inorder.get(i+1)-inorder.get(i));
        }
        return min;
    }

    private List<Integer> getInorder(TreeNode root){
        List<Integer> inorder = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(true){
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                cur = stack.pop();
                inorder.add(cur.val);
                cur = cur.right;
            }
        }
        return inorder;
    }
}
