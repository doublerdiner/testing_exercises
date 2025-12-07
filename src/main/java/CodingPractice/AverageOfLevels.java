package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevels {
    public static void main(String[] args) {
        TreeNode node = BinaryTreeBuilder.buildTree(new Integer[]{1,2,3,4,5});
        List<Double> response = averageOfLevels(node);
        System.out.println(response);
    }

    private static List<Double> averageOfLevels(TreeNode root) {
        List<Double> responseArray = new ArrayList<>();
        if(root == null){
            return responseArray;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            double sum = 0;
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                sum += node.value;

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            double finalSum = sum / size;
            responseArray.add(finalSum);
        }
        return responseArray;
    }
}
