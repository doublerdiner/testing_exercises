package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class IsSameTree {
    public static void main(String[] args) {
        TreeNode tree1 = BinaryTreeBuilder.buildTree(new Integer[]{1,2,3});
        TreeNode tree2 = BinaryTreeBuilder.buildTree(new Integer[]{1,2,3});

        System.out.println(isSameTree(tree1, tree2));
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p != null && q != null){
            if(p.value != q.value){
                return false;
            }
            boolean left = isSameTree(p.left, q.left);
            boolean right = isSameTree(p.right, q.right);
            return left == true && right == true;
        }
        else return p == null && q == null;
    }
}
