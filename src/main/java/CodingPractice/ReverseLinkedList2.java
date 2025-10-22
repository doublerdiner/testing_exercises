package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class ReverseLinkedList2 {

    public static void main(String[] args) {
        ListNode testNode = generateLinkedList();
        ListNode result = reverseLinkedList(testNode, 1, 2);
        while(result != null){
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode reverseLinkedList(ListNode head, int left, int right) {
        Map<Integer, ListNode> nodeMap = new HashMap<>();

        ListNode copy = head;

        Integer i = 1;
        Integer j = right;

        while(i < left){
            nodeMap.put(i, copy);
            i++;
            copy = copy.next;
        }
        while(i <= right){
            nodeMap.put(j, copy);
            j--;
            i++;
            copy = copy.next;
        }
        while(copy != null){
            nodeMap.put(i, copy);
            copy = copy.next;
            i++;
        }

        head = nodeMap.get(1);
        copy = head;

        for(int k=1; k<i; k++){
        copy.next = nodeMap.get(k+1);
        copy = copy.next;
        }
        return head;
    }

    private static ListNode generateLinkedList(){
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(5);
        node1.next = node2;
        return node1;
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }
}
