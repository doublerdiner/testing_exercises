package CodingTests.Four;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
public class One {

    public static void main(String[] args) {
        Node nodeA = new Node('A');
        Node nodeB = new Node('B');
        Node nodeC = new Node('C');
        Node nodeD = new Node('D');
        Node nodeE = new Node('E');
        Node nodeF = new Node('F');

        nodeA.addChild(nodeB);
        nodeA.addChild(nodeC);
        nodeB.addChild(nodeD);
        nodeC.addChild(nodeE);
        nodeE.addChild(nodeF);

        // A -> B -> D
        // |
        // V
        // C -> E -> F

        Graph graph = new Graph(Arrays.asList(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF));

        //true
        System.out.println(BFSearch(graph, nodeA, nodeB));
        //false
        System.out.println(BFSearch(graph, nodeB, nodeC));
        //false
        System.out.println(BFSearch(graph, nodeC, nodeD));
        //true
        System.out.println(BFSearch(graph, nodeC, nodeE));
        //true
        System.out.println(BFSearch(graph, nodeA, nodeF));
    }

    private static boolean BFSearch(Graph graph, Node node1, Node node2){
        if(Objects.equals(node1, node2)) return true;

        for(Node node : graph.getNodes()){
            node.setVisited(false);
        }

        Queue<Node> queue = new LinkedList<>();
        node1.setVisited(true);
        queue.add(node1);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (Node child : current.getChildren()) {
                if (!child.isVisited()) {
                    if (Objects.equals(child, node2)) {
                        return true;
                    } else {
                        child.setVisited(true);
                        queue.add(child);
                    }
                }
            }
        }
        return false;
    }


}
