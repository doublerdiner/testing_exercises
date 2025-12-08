package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode node = BinaryTreeBuilder.buildTree(new Integer[]{1,2,3,4,5,6,7,8,9});
        List<List<Integer>> response = levelOrder(node);
        System.out.println(response);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> responseArray = new ArrayList<>();
        if(root == null){
            return responseArray;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> innerArray = new ArrayList<>();
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();

                innerArray.add(node.value);

                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            responseArray.add(innerArray);
        }
        return responseArray;
    }
}
