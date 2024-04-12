package BinaryTreeGeneral.BFS;


/*
    Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

    Example 1:
    Input: root = [3,9,20,null,null,15,7]   Output: [[3],[9,20],[15,7]]

    Example 2:
    Input: root = [1]   Output: [[1]]

    Example 3:
    Input: root = []    Output: []

    Constraints:
    The number of nodes in the tree is in the range [0, 2000].
    -1000 <= Node.val <= 1000

 */

import BinaryTreeGeneral.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return finalList;
        }
        queue.offer(root);
        while (!queue.isEmpty()){

            int localSize = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for (int i = 0; i < localSize; i++) {
                TreeNode node = queue.peek();
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                tempList.add(node.val);
                queue.poll();
            }
            finalList.add(tempList);
        }
        return finalList;
    }

}
