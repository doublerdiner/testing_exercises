package CodingPractice;

import CodingPractice.Helpers.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromArrays {

    private static int preorderIndex = 0;
    private static Map<Integer, Integer> inorderMap = new HashMap<>();
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode result = buildTree(preorder, inorder);
        System.out.println(result);
    }

    private static TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) return null;

        for(int i=0; i<inorder.length; i++){
            inorderMap.put(inorder[i], i);
        }

        return buildTreeNode(preorder, 0, preorder.length-1);
    }

    private static TreeNode buildTreeNode(int[] preorder, int left, int right) {
        if(left > right) return null;

        TreeNode root = new TreeNode(preorder[preorderIndex++]);
        int rootIndex = inorderMap.get(root.value);

        root.left = buildTreeNode(preorder, left, rootIndex-1);
        root.right = buildTreeNode(preorder, rootIndex+1, right);

        return root;
    }
}
