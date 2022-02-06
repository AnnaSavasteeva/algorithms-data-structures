package hw_anna.lesson7;

public class Node {

    private String nodeName;
    private boolean isVisited;

    public Node(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
