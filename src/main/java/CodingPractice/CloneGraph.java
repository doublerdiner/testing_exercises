package CodingPractice;

import CodingPractice.Helpers.GraphNode;

import java.util.HashMap;
import java.util.Map;

public class CloneGraph {
    public static void main(String[] args) {
        GraphNode node = buildGraph();
        GraphNode solution = cloneGraph(node);
    }

    private final static Map<GraphNode, GraphNode> map = new HashMap<>();
    private static GraphNode cloneGraph(GraphNode node) {
        if(node == null){
            return null;
        }

        if(map.containsKey(node)){
            return map.get(node);
        }

        GraphNode clone = new GraphNode(node.value);
        map.put(node, clone);

        for(GraphNode next : node.neighbours){
            clone.neighbours.add(cloneGraph(next));
        }

        return clone;
    }

    private static GraphNode buildGraph() {
        GraphNode n1 = new GraphNode(1);
        GraphNode n2 = new GraphNode(2);
        GraphNode n3 = new GraphNode(3);
        GraphNode n4 = new GraphNode(4);

        n1.neighbours.add(n2);
        n1.neighbours.add(n4);

        n2.neighbours.add(n1);
        n2.neighbours.add(n3);

        n3.neighbours.add(n2);
        n3.neighbours.add(n4);

        n4.neighbours.add(n1);
        n4.neighbours.add(n3);

        return n1;
    }
}
