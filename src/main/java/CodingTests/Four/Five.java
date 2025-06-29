package CodingTests.Four;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Five {
    public static void main(String[] args) {
        TreeNode testNode = createTestNode();

        System.out.println(checkBST(new AtomicInteger(Integer.MIN_VALUE), testNode));

    }

    private static boolean checkBST(AtomicInteger lastPrinted, TreeNode node) {
        if(Objects.isNull(node)){
            return true;
        }
        if(!checkBST(lastPrinted, node.left)){
            return false;
        }
        if(node.data <= lastPrinted.get()){
            return false;
        }
        lastPrinted.set(node.data);

        return checkBST(lastPrinted, node.right);
    }

    private static TreeNode createTestNode() {
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        node.right = new TreeNode(7);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(8);
        return node;
    }
}
