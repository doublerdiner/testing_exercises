package CodingPractice;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode testNode = generateLinkedList(new int[] {1,1,1,2,3});
        ListNode duplicatesRemoved = deleteDuplicates(testNode);
        while(duplicatesRemoved != null){
            System.out.println(duplicatesRemoved.val);
            duplicatesRemoved = duplicatesRemoved.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = new ListNode();
        current.next = head;
        ListNode response = current;
        while(current != null){
            ListNode next = current.next;
            if(next != null && next.next != null && next.val == next.next.val){
                int value = next.val;
                while(next != null && next.val == value){
                    next = next.next;
                }
                current.next = next;
            }
            else{
                current = current.next;
            }
        }
        return response.next;
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
