package CodingTests.Two;

public class Two {

    public static void main(String[] args) {
        LinkedList linkedList = testList();

        Node secondFromEnd = returnFromEndOfList(linkedList.head, 2);
        Node thirdFromEnd = returnFromEndOfList(linkedList.head, 3);

        System.out.println(secondFromEnd.data);
        System.out.println(thirdFromEnd.data);
    }

    private static Node returnFromEndOfList(Node head, int k) {
        Node point1 = head;
        Node point2 = head;

        for(int i=0; i<k; i++){
            if(point1 == null) return null;
            point1 = point1.next;
        }

        while(point1 != null){
            point1 = point1.next;
            point2 = point2.next;
        }
        return point2;
    }

    private static LinkedList testList() {
        LinkedList response = new LinkedList();
        response.append(1);
        response.append(5);
        response.append(2);
        response.append(8);
        response.append(3);
        return response;
    }
}
