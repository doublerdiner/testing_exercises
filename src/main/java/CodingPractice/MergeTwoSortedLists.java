package CodingPractice;

import java.util.Objects;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        ListNode node1 = generateLinkedList(new int[] {1,2,4});
        ListNode node2 = generateLinkedList(new int[] {1,3,4});
        ListNode head = mergeTwoSortedLists(node1, node2);
        while(Objects.nonNull(head)){
            System.out.print(head.val + ", ");
            head = head.next;
        }
    }

    private static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while(Objects.nonNull(list1) && Objects.nonNull(list2)){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if(Objects.nonNull(list1)){
            current.next = list1;
        }
        else if(Objects.nonNull(list2)){
            current.next = list2;
        }
        return head.next;
    }

    private static ListNode generateLinkedList(int[] nums){
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for(int i=1; i<nums.length; i++){
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }
    private static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
    }
}
