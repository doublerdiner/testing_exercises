package CodingTests.Two;

public class Five {
    public static void main(String[] args) {
        LinkedList list1 = testListFive(1, 2, 3);
        LinkedList list2 = testListFive(3, 4, 5);
        LinkedList list3 = testListFive(9, 9, 8);

        list1.display();
        list2.display();

        LinkedList answer = sumLists(list1.head, list1.head);
        LinkedList answer2 = sumLists(list2.head, list2.head);
        LinkedList answer3 = sumLists(list1.head, list2.head);
        LinkedList answer4 = sumLists(list3.head, list3.head);

        answer.display();
        answer2.display();
        answer3.display();
        answer4.display();
    }

    private static LinkedList sumLists(Node head1, Node head2) {
        LinkedList response = new LinkedList();
        int carry = 0;
        Node current1 = head1;
        Node current2 = head2;
        while(current1 != null && current2 != null){
            if(current1 == null){
                current1.data = 0;
            }
            if(current2 == null){
                current2.data = 0;
            }
            int newNodeData = current1.data + current2.data + carry;

            if(newNodeData > 10){
                carry = 1;
                newNodeData -= 10;
            }
            else{
                carry = 0;
            }
            response.append(newNodeData);
            current1 = current1.next;
            current2 = current2.next;
        }
        if(carry != 0){
            response.append(carry);
        }
        return response;
    }

    private static LinkedList testListFive(int first, int second, int third) {
        LinkedList response = new LinkedList();
        response.append(first);
        response.append(second);
        response.append(third);
        return response;
    }
}
