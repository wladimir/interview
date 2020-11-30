package interviewcake.trees_and_graphs;

import common.BinaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Problem:
 * - Given a binary tree, determine if it is "superbalanced" - the difference
 * between the depths of any two leaf nodes is no greater than 1.
 * Approach:
 * - Use a depth-first walk through the tree and keep track of the depth as we
 * go.
 * - Every time we found a leaf with a new depth, there are two ways that the
 * tree could be unbalanced:
 * - There are more than 2 different leaf depths.
 * - There are exactly 2 depths but they are more than 1 apart.
 * Solution:
 * - Initialize a stack to keep track of the tree level and its depth.
 * - While the stack is not empty, pop a tree and its depth from the top
 * of our stack and check if we found a leaf.
 * - If so, add the new depth to the list if we haven't seen it.
 * - Could short-circuit to determine if the tree is unbalanced if:
 * - more than 2 different leaf depths
 * - 2 leaf depths that are more than 1 apart
 * - Keep walking down the tree and keep track of the depth.
 * Cost:
 * - O(n) time, O(n) space.
 * - The worst case is that we have to iterate all nodes in the tree so the time
 * complexity is O(n). For space complexity, we have to keep track of the all
 * the nodes at every depth. Hence, it is O(n).
 */
public class BalancedBinaryTree {
    private static class NodeDepthPair {
        final BinaryTree node;
        final int depth;

        NodeDepthPair(BinaryTree node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }

    public boolean isSuperBalanced(final BinaryTree root) {
        if (root == null) return true;

        List<Integer> depths = new ArrayList<>();

        final Deque<NodeDepthPair> queue = new LinkedList<>();
        queue.add(new NodeDepthPair(root, 0));
        while (!queue.isEmpty()) {
            final NodeDepthPair current = queue.pop();

            // leaf
            if (current.node.left == null && current.node.right == null) {
                if (!depths.contains(current.depth)) {
                    depths.add(current.depth);

                    if (depths.size() > 2 || (depths.size() == 2 && Math.abs(depths.get(0) - depths.get(1)) > 1))
                        return false;
                }
                // not leaf
            } else {
                if (current.node.left != null) queue.add(new NodeDepthPair(current.node.left, current.depth + 1));
                if (current.node.right != null) queue.add(new NodeDepthPair(current.node.right, current.depth + 1));
            }
        }

        return true;
    }
}
