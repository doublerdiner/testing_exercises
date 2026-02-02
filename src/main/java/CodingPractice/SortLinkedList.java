package CodingPractice;

import CodingPractice.Helpers.Node;

public class SortLinkedList {

    public static void main(String[] args) {
        Node head = getTestList();
        Node sortedNode = sortList(head);
        System.out.println(sortedNode.value);
    }

    private static Node getTestList() {
        Node head = new Node(5);
        Node current = head;
        current.next = new Node(2);
        current = current.next;
        current.next = new Node(6);
        current = current.next;
        current.next = new Node(1);
        current = current.next;
        current.next = new Node(2);
        return head;
    }

    public static Node sortList(Node head) {
        if(head == null || head.next == null){
            return head;
        }

        Node mid = getMiddleNode(head);
        Node right = mid.next;
        mid.next = null;

        Node leftSorted = sortList(head);
        Node rightSorted = sortList(right);

        return merge(leftSorted, rightSorted);
    }

    private static Node getMiddleNode(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private static Node merge(Node left, Node right){
        Node dummy = new Node();
        Node current = dummy;

        while(left != null && right != null){
            if(left.value <= right.value){
                current.next = left;
                left = left.next;
            }
            else{
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }

        current.next = (left != null)? left : right;

        return dummy.next;
    }
}
