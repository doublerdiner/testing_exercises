package CodingPractice.Helpers;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {

    public int value;
    public List<GraphNode> neighbours = new ArrayList<>();

    public GraphNode(int value) {
        this.value = value;
    }

    public GraphNode(int value, List<GraphNode> neighbours) {
        this.value = value;
        this.neighbours = neighbours;
    }
}
