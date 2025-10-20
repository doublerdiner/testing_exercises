package CodingPractice;

import java.util.Objects;

public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode list1 = generateLinkedList(new int[]{2, 4, 3});
        ListNode list2 = generateLinkedList(new int[]{5, 6, 4});

        ListNode result = addTwoNumbers(list1, list2);

        while(Objects.nonNull(result)){
            System.out.println(result.val);
            result = result.next;
        }
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int tens = 0;

        ListNode head = new ListNode();
        ListNode node = head;
        while(Objects.nonNull(l1) || Objects.nonNull(l2)){
            int l1Val = Objects.nonNull(l1)? l1.val : 0;
            int l2Val = Objects.nonNull(l2)? l2.val : 0;
            int currentTotal = l1Val + l2Val + tens;
            tens = currentTotal / 10;
            currentTotal = currentTotal % 10;
            node.next = new ListNode();
            node.next.val = currentTotal;
            node = node.next;
            l1 = Objects.nonNull(l1)? l1.next : null;
            l2 = Objects.nonNull(l2)? l2.next : null;
        }

        while(tens > 0){
            int valueToAdd = tens % 10;
            tens = tens / 10;
            node.next = new ListNode();
            node.next.val = valueToAdd;
            node = node.next;
        }

        return head.next;
    }

    private static ListNode generateLinkedList(int[] nums){
        ListNode listNode1 = new ListNode(nums[2]);
        ListNode listNode2 = new ListNode(nums[1], listNode1);
        return new ListNode(nums[0], listNode2);
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

}
