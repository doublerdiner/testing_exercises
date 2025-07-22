package CodingTests.Four;

import java.util.Objects;

public class Six {

    public static void main(String[] args) {
        TreeNode node = createTestNode();

        TreeNode answer = getSuccessorNode(node);
        TreeNode answerLeftmost = getLeftmostChild(node.left.left);
        TreeNode answerRightmost = getLeftmostChild(node.right.right);
        System.out.println(answer.data);
        System.out.println(answerLeftmost.data);
        System.out.println(answerRightmost.data);
    }

    private static TreeNode getSuccessorNode(TreeNode node) {
        if(Objects.isNull(node)){
            return null;
        }

        if(Objects.nonNull(node.right)){
            return getLeftmostChild(node.right);
        }
        else{
            TreeNode current = node;
            TreeNode parentNode = current.parent;
            while(Objects.nonNull(parentNode) && parentNode.left != current){
                current = parentNode;
                parentNode = parentNode.parent;
            }
            return parentNode;
        }
    }

    private static TreeNode getLeftmostChild(TreeNode node) {
        if(Objects.isNull(node)){
            return null;
        }
        while(Objects.nonNull(node.left)){
            node = node.left;
        }
        return node;
    }

    private static TreeNode createTestNode() {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        node.right = new TreeNode(7);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);

        node.left.parent = node;
        node.left.left.parent = node.left;
        node.left.right.parent = node.right;
        node.right.parent = node;
        node.right.left.parent = node.right;
        node.right.right.parent = node.right;

        return node;
    }
}
