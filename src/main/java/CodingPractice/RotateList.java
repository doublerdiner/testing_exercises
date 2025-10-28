package CodingPractice;

public class RotateList {

    public static void main(String[] args) {
        ListNode testNode = generateLinkedList(new int[] {1,2,3,4,5});
        ListNode rotateList = rotateRight(testNode, 2);
        while(rotateList != null){
            System.out.println(rotateList.val);
            rotateList = rotateList.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode copy = head;
        int numOfNodes = 1;

        while (copy.next != null) {
            numOfNodes++;
            copy = copy.next;
        }
        copy.next = head;
        copy = copy.next;

        if (k > numOfNodes) {
            k = k % numOfNodes;
        }
        int nodeIndex = numOfNodes - k + 1;

        int i = 1;
        int j = 1;
        ListNode response = new ListNode();
        while (true) {
            if (i == nodeIndex) {
                response.next = copy;
                j = 1;
            }
            if (j == numOfNodes) {
                copy.next = null;
                break;
            }

            copy = copy.next;
            i++;
            j++;
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
