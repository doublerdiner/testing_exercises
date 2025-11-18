package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class HasPathSum {
    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1});
        boolean response = hasPathSum(root, 22);
        System.out.println(response);
    }

    private static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        int newTarget = targetSum - root.value;
        if(root.left == null && root.right == null){
            return newTarget == 0;
        }

        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
    }
}
