package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15});
        TreeNode solution = invertBinaryTree(root);
    }

    private static TreeNode invertBinaryTree(TreeNode root) {
        if(root == null){
            return root;
        }
        TreeNode left = invertBinaryTree(root.left);
        TreeNode right = invertBinaryTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
