package BinaryTreeGeneral.Easy;

import BinaryTreeGeneral.TreeNode;

/*
Given the roots of two binary trees p and q, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.

Example 1:
Input: p = [1,2,3], q = [1,2,3]
Output: true

Example 2:
Input: p = [1,2], q = [1,null,2]
Output: false

Example 3:
Input: p = [1,2,1], q = [1,1,2]
Output: false

Constraints:
The number of nodes in both trees is in the range [0, 100].
-104 <= Node.val <= 104
 */

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return p==q;
        return isSameTreeHelper(p, q);
    }

    private boolean isSameTreeHelper(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p==q;
        if(p.val == q.val){
            return isSameTreeHelper(p.left,q.left) && isSameTreeHelper(p.right,q.right);
        }else{
            return false;
        }
    }
}
