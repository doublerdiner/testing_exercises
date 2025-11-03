package CodingPractice;

public class PartitionList {

    public static void main(String[] args) {
        ListNode testNode = generateLinkedList(new int[] {1,4,3,2,5,2});
        ListNode response = partition(testNode, 3);
        while(response != null){
            System.out.println(response.val);
            response = response.next;
        }

    }

    public static ListNode partition(ListNode head, int x) {

        ListNode frontHead = new ListNode();
        ListNode rearHead = new ListNode();

        ListNode front = frontHead;
        ListNode rear = rearHead;

        while(head != null){
            if(head.val < x){
                front.next = head;
                front = front.next;
            }
            else{
                rear.next = head;
                rear = rear.next;
            }
            head = head.next;
        }
        rear.next = null;
        front.next = rearHead.next;
        return frontHead.next;
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
