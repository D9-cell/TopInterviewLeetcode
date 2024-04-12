package BinaryTreeGeneral.Easy;

import BinaryTreeGeneral.TreeNode;

/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).



Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false


Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100


Follow up: Could you solve it both recursively and iteratively?
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelper(root.left,root.right);
    }

    private boolean isSymmetricHelper(TreeNode left, TreeNode right) {
        if(left == null|| right == null) return left == right;

        if(left.val != right.val) return false;

        return isSymmetricHelper(left.left,right.right) && isSymmetricHelper(left.right,right.left);
    }
}
