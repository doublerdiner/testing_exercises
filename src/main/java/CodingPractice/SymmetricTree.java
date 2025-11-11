package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class SymmetricTree {

    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[] {1,2,2,3,4,4,3,5,6,7,8,8,7,6,5});
        boolean solution = isSymmetric(root);
        System.out.println(solution);
    }

    private static boolean isSymmetric(TreeNode root) {
        if(root == null) return false;
        return nodesAreIdentical(root.left, root.right);
    }

    private static boolean nodesAreIdentical(TreeNode p, TreeNode q) {
        if(p != null && q != null){
            if(p.value != q.value){
                return false;
            }
            boolean first = nodesAreIdentical(p.left, q.right);
            boolean second = nodesAreIdentical(p.right, q.left);
            return first && second;
        }
        else return p == null && q == null;
    }
}
