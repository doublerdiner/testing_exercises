package CodingPractice;

import CodingPractice.Helpers.TreeNode;

public class ConvertSortedArrayToBST {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        TreeNode result = convertArrayToBST(nums);
        System.out.println(result.value);
    }

    private static TreeNode convertArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }

        return BSTBuilder(nums, 0, nums.length-1);
    }

    private static TreeNode BSTBuilder(int[] nums, int left, int right) {
        if(left > right){
            return null;
        }

        int middle = left + (right - left) / 2;

        TreeNode node = new TreeNode(nums[middle]);

        node.left = BSTBuilder(nums, left, middle - 1);
        node.right = BSTBuilder(nums, middle + 1, right);

        return node;
    }
}
