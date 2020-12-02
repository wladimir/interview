package interviewcake.trees_and_graphs;

import junit.framework.TestCase;

import java.util.HashSet;
import java.util.Set;

public class ColorGraphTest extends TestCase {
    public void testLineGraph() {
        final ColorGraph.GraphNode nodeA = new ColorGraph.GraphNode("A");
        final ColorGraph.GraphNode nodeB = new ColorGraph.GraphNode("B");
        final ColorGraph.GraphNode nodeC = new ColorGraph.GraphNode("C");
        final ColorGraph.GraphNode nodeD = new ColorGraph.GraphNode("D");
        nodeA.addNeighbor(nodeB);
        nodeB.addNeighbor(nodeA);
        nodeB.addNeighbor(nodeC);
        nodeC.addNeighbor(nodeB);
        nodeC.addNeighbor(nodeD);
        nodeD.addNeighbor(nodeC);

        final ColorGraph.GraphNode[] graph = new ColorGraph.GraphNode[]{nodeA, nodeB, nodeC, nodeD};
        new ColorGraph().colorGraph(graph, getColors());

        validateGraphColoring(graph);
    }

    public void testSeparateGraph() {
        final ColorGraph.GraphNode nodeA = new ColorGraph.GraphNode("A");
        final ColorGraph.GraphNode nodeB = new ColorGraph.GraphNode("B");
        final ColorGraph.GraphNode nodeC = new ColorGraph.GraphNode("C");
        final ColorGraph.GraphNode nodeD = new ColorGraph.GraphNode("D");
        nodeA.addNeighbor(nodeB);
        nodeB.addNeighbor(nodeA);
        nodeC.addNeighbor(nodeD);
        nodeD.addNeighbor(nodeC);

        final ColorGraph.GraphNode[] graph = new ColorGraph.GraphNode[]{nodeA, nodeB, nodeC, nodeD};
        new ColorGraph().colorGraph(graph, getColors());

        validateGraphColoring(graph);
    }

    private static String[] getColors() {
        return new String[]{"red", "green", "blue", "orange", "yellow", "white"};
    }

    private static void validateGraphColoring(ColorGraph.GraphNode[] graph) {
        for (final ColorGraph.GraphNode node : graph) {
            if (!node.hasColor()) {
                fail(String.format("Found non-colored node %s", node.getLabel()));
            }
        }

        int maxDegree = 0;
        final Set<String> usedColors = new HashSet<>();

        for (final ColorGraph.GraphNode node : graph) {
            final Set<ColorGraph.GraphNode> neighbors = node.getNeighbors();
            maxDegree = Math.max(maxDegree, neighbors.size());
            usedColors.add(node.getColor());
        }

        final int allowedColorCount = maxDegree + 1;

        if (usedColors.size() > allowedColorCount) {
            fail(String.format("Too many colors: %d allowed, but %d actually used", allowedColorCount, usedColors.size()));
        }

        for (final ColorGraph.GraphNode node : graph) {
            final Set<ColorGraph.GraphNode> neighbors = node.getNeighbors();
            for (final ColorGraph.GraphNode neighbor : neighbors) {
                if (neighbor.getColor().equals(node.getColor())) {
                    fail(String.format("Neighbor nodes %s and %s have the same color %s", node.getLabel(), neighbor.getLabel(), node.getColor()));
                }
            }
        }
    }
}
