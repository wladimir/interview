package interviewcake.trees_and_graphs;

import common.BinaryTreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem:
 * - Given a binary tree, determine if it is a binary search tree.
 * Approach:
 * - Use a depth-first walk through the tree and validate each node as we go.
 * - If a node appears in the left subtree, it must be less than its ancestor and
 * vice versa.
 * - Instead of keeping track of every ancestor to check the inequalities, just
 * need to check the largest number it must be greater than and the smallest one
 * it must be less than, aka lower bound and upper bound.
 * Solution:
 * - Initialize a stack that keeps track of the tree level, its lower bound and
 * upper bound.
 * - Use an arbitrary low lower bound and high higher bound to start the stack.
 * - While the stack is not empty, pop a tree and its bounds from the top.
 * - Return false immediately if the current node is invalid, meaning its value
 * is either:
 * - less or equal than the lower bound
 * - greater or equal than upper bound
 * - Keep walking down the tree and update the lower and upper bounds accordingly.
 * Cost:
 * - O(n) time, O(n) space.
 * - The worst case is that we have to iterate all nodes in the tree so the time
 * complexity is O(n). For space complexity, we have to keep track of the lower
 * bound and upper bound as we traverse the tree via a stack. Hence, the worst
 * case is O(n).
 */
public class BinarySearchTreeChecker {
    private static class NodeBounds {
        BinaryTreeNode node;
        int lowerBound;
        int upperBound;

        NodeBounds(BinaryTreeNode node, int lowerBound, int upperBound) {
            this.node = node;
            this.lowerBound = lowerBound;
            this.upperBound = upperBound;
        }
    }

    public boolean isBinarySearchTree(BinaryTreeNode root) {
        if (root == null) return true;

        final Deque<NodeBounds> stack = new ArrayDeque<>();
        stack.push(new NodeBounds(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        while (!stack.isEmpty()) {
            final NodeBounds nodeBounds = stack.pop();

            if (nodeBounds.node.value <= nodeBounds.lowerBound || nodeBounds.node.value >= nodeBounds.upperBound)
                return false;

            if (nodeBounds.node.left != null)
                stack.add(new NodeBounds(nodeBounds.node.left, nodeBounds.lowerBound, nodeBounds.node.value));
            if (nodeBounds.node.right != null)
                stack.add(new NodeBounds(nodeBounds.node.right, nodeBounds.node.value, nodeBounds.upperBound));
        }

        return true;
    }
}
