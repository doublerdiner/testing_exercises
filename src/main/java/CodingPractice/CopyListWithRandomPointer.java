package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {

    public static void main(String[] args) {
        Node testNode = generateLinkedList();
        Node result = copyListWithRandomPointer(testNode);

        while(result != null){
            System.out.print("val: " + result.val);
            if(result.random != null){
                System.out.println(", random: " + result.random.val);
            }
            result = result.next;
        }
    }

    private static Node copyListWithRandomPointer(Node head) {
        Map<Node, Node> nodeMap = new HashMap<>();

        Node current = head;

        while(current != null){
            nodeMap.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;

        while(current != null){
            Node copy = nodeMap.get(current);
            copy.next = nodeMap.get(current.next);
            copy.random = nodeMap.get(current.random);
            current = current.next;
        }

        return nodeMap.get(head);
    }

    private static Node generateLinkedList(){
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node2.random = node1;
        node3.random = node5;
        node4.random = node3;
        node5.random = node1;
        return node1;
    }
    private static class Node {
        int val;
        Node next;
        Node random;
        Node(int val) { this.val = val; }
    }
}
