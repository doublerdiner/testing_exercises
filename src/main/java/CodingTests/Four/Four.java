package CodingTests.Four;

import java.util.Objects;

public class Four {

    public static void main(String[] args) {
        boolean result = isTreeBalanced(getTestTreeNode());

        System.out.println(result);
    }

    private static boolean isTreeBalanced(TreeNode testTreeNode) {
        return getHeight(testTreeNode) != Integer.MIN_VALUE;
    }

    private static int getHeight(TreeNode root) {
        if (Objects.isNull(root)){
            return -1;
        }

        int leftHeight = getHeight(root.left);
        if(leftHeight == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        int rightHeight = getHeight(root.right);
        if(rightHeight == Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        int diff = leftHeight - rightHeight;
        if(Math.abs(diff) > 1){
            return Integer.MIN_VALUE;
        }
        else{
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    private static TreeNode getTestTreeNode() {
        // level 1
        TreeNode root = new TreeNode(1);

        // level 2
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        // level 3
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(5);

        // level 4
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(8);
        root.left.right.left = new TreeNode(10);
        root.right.left.left = new TreeNode(9);

        return root;
    }
}
