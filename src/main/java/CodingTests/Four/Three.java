package CodingTests.Four;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Three {

    public static void main(String[] args) {
        TreeNode root = getTestTreeNode();

        List<LinkedList<TreeNode>> response = binaryTreeLinkedLists(root);

        for(int i=0; i<response.size(); i++){
            System.out.println("LinkedList level " + i + ":");
            LinkedList<TreeNode> current = response.get(i);
            for(TreeNode node : current){
                System.out.println(node.data);
            }
        }
    }

    private static List<LinkedList<TreeNode>> binaryTreeLinkedLists(TreeNode root) {
        List<LinkedList<TreeNode>> lists = new ArrayList<>();
        binaryTreeLinkedLists(root, lists, 0);
        return lists;
    }

    private static void binaryTreeLinkedLists(TreeNode root, List<LinkedList<TreeNode>> lists, int level) {
        if(Objects.isNull(root)) return;

        LinkedList<TreeNode> list;
        if(lists.size() == level){
            list = new LinkedList<>();
            lists.add(list);
        }
        else{
            list = lists.get(level);
        }
        list.add(root);
        binaryTreeLinkedLists(root.left, lists, level+1);
        binaryTreeLinkedLists(root.right, lists, level+1);
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
