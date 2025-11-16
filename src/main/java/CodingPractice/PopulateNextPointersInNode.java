package CodingPractice;

import CodingPractice.Helpers.BinaryTreeBuilder;
import CodingPractice.Helpers.TreeNode;

public class PopulateNextPointersInNode {

    public static void main(String[] args) {
        TreeNode root = BinaryTreeBuilder.buildTree(new Integer[]{1, 2, 3, 4, 5, 5, 6, 7, 8, 9});
        TreeNode connect = connect(root);
        System.out.println(connect);
    }

    public static TreeNode connect(TreeNode root) {
        if(root == null){
            return root;
        }

        TreeNode current = root;
        TreeNode head = null;
        TreeNode tail = null;

        while(current != null){
            while(current != null){

                if(current.left != null){
                    if(tail != null){
                        tail.next = current.left;
                    }
                    else{
                        head = current.left;
                    }
                    tail = current.left;
                }

                if(current.right != null){
                    if(tail != null){
                        tail.next = current.right;
                    }
                    else{
                        head = current.right;
                    }
                    tail = current.right;
                }

                current = current.next;
            }
            current = head;
            head = null;
            tail = null;
        }
        return root;
    }



}
