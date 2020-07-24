package graphs.bfs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Node {

    public int depth = 0;
    private Integer value;
    private Set<Node> neighbors;
    public Node parent;
    public Set<Integer> clientVisited = new HashSet<>();

    public Node(Integer value) {
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public Integer getValue() {
        return value;
    }

    public Set<Node> getNeighbors() {
        return Collections.unmodifiableSet(neighbors);
    }

    public boolean connect(Node node) {
        if (this == node) throw new IllegalArgumentException("Can't connect node to itself");
        node.depth = depth + 1;

        node.clientVisited = new HashSet<>(clientVisited);
        if (depth % 2 == 0 && !node.clientVisited.add(node.getValue())) {
           return false;
        }
        neighbors.add(node);
        //Pas sur sur
        node.parent = this;
        return true;
    }
}