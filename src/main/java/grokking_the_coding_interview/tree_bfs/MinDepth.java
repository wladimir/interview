package grokking_the_coding_interview.tree_bfs;

import common.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem:
 * - Given a binary tree, find the minimum depth, aka the number of nodes along
 * the shortest path from the root node to the nearest leaf node.
 * Example:
 * - Input:
 * 1
 * 2   3
 * 4       5
 * 6   7
 * 8
 * Output: 3
 * Approach:
 * - Similar to level order traversal problem, except we keep track of the minimum
 * depth at each level
 * - Return it immediately once we find the leaf node.
 * Cost:
 * - O(n) time, O(n) space.
 *
 * When looking for max depth, just keep incrementing depth.
 */
public class MinDepth {
    public int findDepth(final BinaryTreeNode root) {
        if (root == null) return 0;

        final Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int depth = 0;

        while (!queue.isEmpty()) {
            depth++;

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                final BinaryTreeNode node = queue.poll();
                if (node.left == null && node.right == null) return depth;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
        }

        return depth;
    }
}
