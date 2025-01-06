package CodingTests.Two;

public class Six {

    public static void main(String[] args) {
        int[] test1 = new int[]{1,2,3,2,1};
        int[] test2 = new int[]{5,4,3,2,1};
        LinkedList palindrome = testListSix(test1);
        LinkedList notPalindrome = testListSix(test2);

        System.out.println(isLinkedListAPalindrome(palindrome.head));
        System.out.println(isLinkedListAPalindrome(notPalindrome.head));
    }

    private static boolean isLinkedListAPalindrome(Node head) {
        Node reversedHead = reverseLinkedList(head);
        while(head != null && reversedHead != null){
            if(head.data != reversedHead.data) return false;
            head = head.next;
            reversedHead = reversedHead.next;
        }
        return head == null && reversedHead == null;
    }

    private static Node reverseLinkedList(Node node) {
        Node head = null;
        while(node != null){
            Node n = new Node(node.data);
            n.next = head;
            head = n;
            node = node.next;
        }
        return head;
    }

    private static LinkedList testListSix(int[] convertToLinkedList) {
        LinkedList response = new LinkedList();
        for(int number: convertToLinkedList){
            response.append(number);
        }
        return response;
    }

}
