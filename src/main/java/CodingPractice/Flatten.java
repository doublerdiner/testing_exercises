package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class Flatten {
    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[]{1,2,null,null,3,4,null,5,6});
        flatten(root);
        while(root != null){
            System.out.println(root.value);
            root = root.right;
        }
    }

    private static void flatten(TreeNode root) {
        if(root == null) return;

        flatten(root.left);
        flatten(root.right);

        TreeNode current = root;
        TreeNode temp = current.right;

        current.right = current.left;
        current.left = null;

        while(current.right != null){
            current = current.right;
        }
        current.right = temp;
    }
}
