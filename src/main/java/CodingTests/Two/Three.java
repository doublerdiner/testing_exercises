package CodingTests.Two;

public class Three {
    public static void main(String[] args) {
        LinkedList testList = testLinkedList();
        System.out.println("List before node removal: ");
        testList.display();

        // node3 is '3'
        Node node3 = testList.head.next.next;
        removeNodeFromLinkedList(node3);
        System.out.println("List after node removal: ");
        testList.display();

        // node5 is '5'
        Node node5 = node3.next;
        removeNodeFromLinkedList(node5);
        System.out.println("List after last node removal attempt: ");
        testList.display();

        // node4 is '4'
        Node node4 = node3;
        removeNodeFromLinkedList(node4);
        System.out.println("List after another node removal: ");
        testList.display();
    }

    private static boolean removeNodeFromLinkedList(Node node) {
        if(node == null || node.next == null){
            return false;
        }
        Node next = node.next;
        node.data = next.data;
        node.next = next.next;
        return true;
    }

    private static LinkedList testLinkedList() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        return list;
    }
}
