package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigZagLevelOrder {
    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[]{1,2,3,4,5,6,7,8,9});
        List<List<Integer>> result = zigzagLevelOrder(root);
        System.out.println(result);
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> responseArray = new ArrayList<>();
        if(root == null){
            return responseArray;
        }

        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);

        boolean leftToRight = true;

        while(!list.isEmpty()){
            int size = list.size();
            List<Integer> innerArray = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode node;
                if(leftToRight){
                    node = list.poll();
                    innerArray.add(node.value);

                    if(node.left != null){
                        list.add(node.left);
                    }
                    if(node.right != null){
                        list.add(node.right);
                    }
                }
                else{
                    node = list.pollLast();
                    innerArray.add(node.value);

                    if(node.right != null){
                        list.addFirst(node.right);
                    }
                    if(node.left != null){
                        list.addFirst(node.left);
                    }
                }
            }
            responseArray.add(innerArray);
            leftToRight = !leftToRight;
        }
        return responseArray;
    }
}
