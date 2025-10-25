package CodingPractice;

public class RemoveNthNodeFromEndOfList {

    public static void main(String[] args) {
        ListNode testNode = generateLinkedList(new int[]{1});
        removeNthFromEnd(testNode, 1);
        while(testNode != null){
            System.out.println(testNode.val);
            testNode = testNode.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode copy = head;
        while(copy != null){
            length++;
            copy = copy.next;
        }

        int nodeToStartSkip = length - n;

        if(nodeToStartSkip == 0){
            return head.next;
        }

        copy = head;

        int node = 0;
        while(copy != null){
            node += 1;
            if(node == nodeToStartSkip){
                if(node == length){
                    copy.next = null;
                }
                else {
                    copy.next = copy.next.next;
                }
                break;
            }
            copy = copy.next;
        }
        return head;
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
