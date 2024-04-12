//package BinaryTreeGeneral.Easy;
//
//import BinaryTreeGeneral.TreeNode;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class LeafSimilar {
//
//    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
//        List<Integer> tree1 = leafNodes(root1);
//        List<Integer> tree2 = leafNodes(root2);
//        if(tree1.size() != tree2.size()){
//            return false;
//        }else{
//            for (int i=0;i< tree1.size() ; i++){
//                if(tree1.get(i) != tree2.get(i)){
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
////    private List<Integer> leafNodes(TreeNode root){
////        List<Integer> tree = new ArrayList<>();
////
////    }
//
//
//}
