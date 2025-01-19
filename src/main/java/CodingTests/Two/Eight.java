package CodingTests.Two;

import java.util.ArrayList;
import java.util.List;

public class Eight {

    public static void main(String[] args) {
        LinkedList listWithLoop = testLinkedListEight();
        LinkedList listWithoutLoop = getListWithoutLoop();

        Node loopingNode = detectLoop(listWithLoop.head);
        Node nullNode = detectLoop(listWithoutLoop.head);

        System.out.println(loopingNode.data);
        System.out.println(nullNode);
    }

    private static LinkedList getListWithoutLoop() {
        LinkedList listWithoutLoop = new LinkedList();
        listWithoutLoop.append(3);
        listWithoutLoop.append(2);
        listWithoutLoop.append(1);
        return listWithoutLoop;
    }

    private static Node detectLoop(Node head) {
        List<Node> nodeList = new ArrayList<>();
        while(head != null){
            if(!nodeList.contains(head)){
                nodeList.add(head);
                head = head.next;
                continue;
            }
            return head;
        }
        return null;
    }

    private static LinkedList testLinkedListEight() {
        LinkedList response = new LinkedList();
        response.append(1);
        response.append(2);
        response.append(3);
        response.append(4);
        response.append(5);
        Node thirdNode = response.head;
        for(int i=0; i<2; i++){
            thirdNode = thirdNode.next;
        }
        Node endNode = response.head;
        while(endNode.next != null){
            endNode = endNode.next;
        }
        endNode.next = thirdNode;
        return response;
    }
}
