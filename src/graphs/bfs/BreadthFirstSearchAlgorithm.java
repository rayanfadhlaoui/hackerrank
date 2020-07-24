package graphs.bfs;

import graphs.Tree;
import graphs.bfs.Node;

import java.util.*;

public class BreadthFirstSearchAlgorithm {


    public static <T> Optional<Tree<T>> search(T value, Tree<T> root) {
        Queue<Tree<T>> queue = new ArrayDeque<>();
        queue.add(root);

        Tree<T> currentNode;
        while (!queue.isEmpty()) {
            currentNode = queue.remove();

            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                queue.addAll(currentNode.getChildren());
            }
        }

        return Optional.empty();
    }

    public static Optional<Node> search(Integer value, Node start) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(start);

        Node currentNode;
        Set<Node> alreadyVisited = new HashSet<>();

        while (!queue.isEmpty()) {
            currentNode = queue.remove();

            if (currentNode.getValue().equals(value)) {
                return Optional.of(currentNode);
            } else {
                alreadyVisited.add(currentNode);
                queue.addAll(currentNode.getNeighbors());
                queue.removeAll(alreadyVisited);
            }
        }

        return Optional.empty();
    }

}