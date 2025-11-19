package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class SumNumbers {
    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[] {1,0});
        System.out.println(sumNumbers(root));
    }
    private static int sumNumbers(TreeNode root) {
        return addNodes(root, 0);
    }

    private static int addNodes(TreeNode root, int runningTotal) {
        if(root == null){
            return 0;
        }
        runningTotal *= 10;
        runningTotal += root.value;
        if(root.left == null && root.right == null){
            return runningTotal;
        }

        return addNodes(root.left, runningTotal) + addNodes(root.right, runningTotal);
    }
}
