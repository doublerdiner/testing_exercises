package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class validBST {
    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[]{4,2,6,1,3,5,7});

        System.out.println(isValidBST(root));
    }

    private static boolean isValidBST(TreeNode root) {
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validateBST(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }

        if(root.value <= min || root.value >= max){
            return false;
        }

        return validateBST(root.left, min, root.value) && validateBST(root.right, root.value, max);
    }
}
