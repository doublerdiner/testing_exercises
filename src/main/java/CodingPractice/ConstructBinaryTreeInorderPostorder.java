package CodingPractice;

import CodingPractice.Helpers.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeInorderPostorder {

    private static Map<Integer, Integer> inorderMap = new HashMap<>();
    private static int postOrderIndex;
    public static void main(String[] args) {
        int[] postorder = {9,15,7,20,3};
        int[] inorder = {9,3,15,20,7};

        TreeNode result = buildTree(postorder, inorder);
        System.out.println(result);
    }

    private static TreeNode buildTree(int[] postorder, int[] inorder) {
        if(postorder == null || inorder == null) return null;

        for(int i=0; i<inorder.length; i++){
            inorderMap.put(inorder[i], i);
        }

        postOrderIndex = postorder.length-1;

        return buildTreeNode(postorder, 0, postorder.length-1);
    }

    private static TreeNode buildTreeNode(int[] postorder, int left, int right) {
        if(left > right) return null;

        TreeNode root = new TreeNode(postorder[postOrderIndex--]);
        int rootIndex = inorderMap.get(root.value);

        root.right = buildTreeNode(postorder, rootIndex+1, right);
        root.left = buildTreeNode(postorder, left, rootIndex-1);

        return root;
    }
}
