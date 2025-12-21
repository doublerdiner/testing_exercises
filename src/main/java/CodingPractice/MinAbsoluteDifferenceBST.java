package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class MinAbsoluteDifferenceBST {

    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[]{1,2,3,4,5,6});
        int solution = getMinimumDifference(root);
        System.out.println(solution);
    }

    private static Integer previous;
    private static Integer minDiff = Integer.MAX_VALUE;

    private static int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    private static void inOrder(TreeNode root) {
        if(root == null){
            return;
        }

        inOrder(root.left);

        if(previous != null){
            minDiff = Math.min(minDiff, Math.abs(root.value - previous));
        }
        previous = root.value;

        inOrder(root.right);
    }
}
