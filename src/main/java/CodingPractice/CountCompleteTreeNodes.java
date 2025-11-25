package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class CountCompleteTreeNodes {

    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[]{1,2,3,4});
        int solution = countNodes(root);
        System.out.println(solution);
    }

    public static int countNodes(TreeNode root){
        if (root == null) return 0;

        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if (leftHeight == rightHeight) {
            return (int) Math.pow(2, leftHeight) + countNodes(root.right);
        } else {
            return (int) Math.pow(2, rightHeight) + countNodes(root.left);
        }
    }

    private static int getHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }
}
