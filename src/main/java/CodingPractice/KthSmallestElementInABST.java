package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class KthSmallestElementInABST {

    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[]{3,1,4,null,2});
        int kthSmallest = kthSmallest(root, 1);
        System.out.println(kthSmallest);
    }

    private static int searchedNodes = 0;
    private static Integer valToReturn = null;
    public static int kthSmallest(TreeNode root, int k) {
        if(root == null || k < 1){
            return 0;
        }

        searchNode(root, k);
        return valToReturn;
    }

    public static void searchNode(TreeNode root, int k){
        if(root == null){
            return;
        }
        searchNode(root.left, k);
        searchedNodes++;
        if(searchedNodes == k){
            valToReturn = root.value;
            return;
        }
        searchNode(root.right, k);
    }
}
