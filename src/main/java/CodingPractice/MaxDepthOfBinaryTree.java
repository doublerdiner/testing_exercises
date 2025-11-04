package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class MaxDepthOfBinaryTree {

    public static void main(String[] args) {
        Integer[] intArray = {3,9,20,null,null,15,7};
        TreeNode root = BinaryTreeBuilder.buildTree(intArray);

        int result = maxDepth(root);
        System.out.println(result);
    }

    private static int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
