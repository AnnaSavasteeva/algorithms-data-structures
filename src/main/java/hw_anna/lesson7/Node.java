package hw_anna.lesson7;

import java.util.LinkedList;
import java.util.List;

public class Node {

    private final String nodeName;
    private boolean isVisited;
    private final List<Neighbour> neighbours = new LinkedList<>();

    public Node(String nodeName) {
        this.nodeName = nodeName;
    }

    public void setNeighbour(Node neighbour, int distance) {
        neighbours.add(new Neighbour(neighbour, distance));
    }

    public List<Neighbour> getNeighbours() {
        return neighbours;
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

    public static class Neighbour {
        private final Node neighbour;
        private final int distance;

        public Neighbour(Node neighbour, int distance) {
            this.neighbour = neighbour;
            this.distance = distance;
        }

        public Node getNeighbour() {
            return neighbour;
        }

        public int getDistance() {
            return distance;
        }
    }
}
