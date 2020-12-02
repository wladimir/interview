package interviewcake.trees_and_graphs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Problem:
 * - Given an undirected graph, with maximum degree d, find a graph coloring
 * using at most d + 1 colors. Assume that there is no node with a loop.
 * Example:
 * - For a graph with degree 3, we could use at most 4 colors.
 * Approach:
 * - Use a greedy approach to iterate over the graph and assign each node the
 * first non-taken color that we found.
 * Solution:
 * - Iterate through the node in the graph and get the current node's neighbors
 * colors to keep track of all colors that are already taken.
 * - Iterate through the list of colors and assign the first color in the given
 * colors list that is not already taken.
 * Cost:
 * - O(m) time and O(d) space, where m is sum of all the nodes and edges, d is
 * the number of all colors.
 * - Even though it seems like we have an outer and inner loop, we carefully walk
 * through the graph one node at a time and stop checking for colors as soon as
 * we found one that is non-taken.
 * - About the space complexity, it makes sense that we have to store all
 * available colors in the worst case. Hence it takes up O(d) space.
 */
public class ColorGraph {
    public static class GraphNode {
        private String label;
        private Set<GraphNode> neighbors;
        private Optional<String> color;

        public GraphNode(String label) {
            this.label = label;
            neighbors = new HashSet<>();
            color = Optional.empty();
        }

        public String getLabel() {
            return label;
        }

        public Set<GraphNode> getNeighbors() {
            return Collections.unmodifiableSet(neighbors);
        }

        public void addNeighbor(GraphNode neighbor) {
            neighbors.add(neighbor);
        }

        public boolean hasColor() {
            return color.isPresent();
        }

        public String getColor() {
            return color.get();
        }

        public void setColor(String color) {
            this.color = Optional.ofNullable(color);
        }
    }

    public static void colorGraph(GraphNode[] graph, String[] colors) {
        for (GraphNode node : graph) {
            final Set<String> illegalColors = new HashSet<>();

            node.getNeighbors().stream()
                    .filter(ColorGraph.GraphNode::hasColor)
                    .map(ColorGraph.GraphNode::getColor)
                    .forEach(illegalColors::add);

            for (String color : colors)
                if (!illegalColors.contains(color)) {
                    node.setColor(color);
                    break;
                }
        }
    }
}
