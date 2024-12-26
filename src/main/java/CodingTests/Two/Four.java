package CodingTests.Two;

public class Four {
    public static void main(String[] args) {
        LinkedList list = testListFour();

        list.display();

        Node result = partitionList(list.head, 5);

        while(result != null){
            System.out.print(result.data + " -> ");
            result = result.next;
        }
    }

    private static Node partitionList(Node node, int partition) {
        if (node.next == null) return node;
        Node smallerHead = null;
        Node smallerTail = null;
        Node largerHead = null;
        Node largerTail = null;

        while (node != null) {
            Node next = node.next;
            node.next = null;

            if (node.data < partition) {
                if (smallerHead == null) {
                    smallerHead = node;
                    smallerTail = smallerHead;
                } else {
                    smallerTail.next = node;
                    smallerTail = node;
                }
            } else {
                if (largerHead == null) {
                    largerHead = node;
                    largerTail = largerHead;
                } else {
                    largerTail.next = node;
                    largerTail = node;
                }
            }
            node = next;
        }
        if(smallerTail != null){
            smallerTail.next = largerHead;
        }
        return smallerHead != null? smallerHead : largerHead;
    }


    private static LinkedList testListFour() {
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(4);
        list.append(6);
        list.append(2);
        list.append(8);
        list.append(1);
        list.append(2);
        return list;
    }
}
