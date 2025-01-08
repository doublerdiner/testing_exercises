package CodingTests.Two;

public class Seven {
    public static void main(String[] args) {
        int[] test1 = new int[]{1,2,3,4,5};
        int[] test2 = new int[]{6,7,8,9,10};
        LinkedList firstList = testListSeven(test1);
        LinkedList secondList = testListSeven(test2);
        Node expectedFailure = findIntersectingNode(firstList.head, secondList.head);
        addIntersection(firstList, secondList);

        Node answer = findIntersectingNode(firstList.head, secondList.head);

        System.out.println("This should pass. Answer data is 2: " + answer.data);
        System.out.println("This should return null: " + expectedFailure);

    }

    private static Node findIntersectingNode(Node firstNode, Node secondNode) {
        int firstListLength = 0;
        int secondListLength = 0;
        Node firstCounter = firstNode;
        Node secondCounter = secondNode;
        while(firstCounter != null){
            firstListLength += 1;
            firstCounter = firstCounter.next;
        }
        while(secondCounter != null){
            secondListLength += 1;
            secondCounter = secondCounter.next;
        }

        while(firstListLength > secondListLength){
            secondListLength++;
            firstNode = firstNode.next;
        }
        while(secondListLength > firstListLength){
            firstListLength++;
            secondNode = secondNode.next;
        }

        while(firstNode != null){
            if(firstNode == secondNode) {
                return firstNode;
            }
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        }
        return null;
    }

    private static LinkedList addIntersection(LinkedList firstList, LinkedList secondList) {
        Node secondHead = secondList.head;
        for(int i=0; i<3; i++){
            secondHead = secondHead.next;
        }
        secondHead.next = firstList.head.next;
        return secondList;
    }

    private static LinkedList testListSeven(int[] array) {
        LinkedList response = new LinkedList();
        for(int num: array){
            response.append(num);
        }
        return response;
    }
}
