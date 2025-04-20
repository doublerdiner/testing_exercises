package CodingTests.Four;

import java.util.ArrayList;
import java.util.List;

public class Node {

    private char data;
    private List<Node> children;
    private boolean visited;

    public Node(char data) {
        this.data = data;
        this.children = new ArrayList<>();
        this.visited = false;
    }

    public int getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public List<Node> getChildren() {
        return children;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void addChild(Node child){
        this.children.add(child);
    }
}
