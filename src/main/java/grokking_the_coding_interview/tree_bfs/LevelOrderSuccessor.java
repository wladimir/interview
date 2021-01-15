package grokking_the_coding_interview.tree_bfs;

import common.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem:
 * - Given a binary tree and a node, find the level order successor of
 * the given node. The level order successor is the node that appears
 * right after the given node in the level order traversal.
 * Example:
 * - Input: target=6, tree=
 * 1
 * 2   3
 * 4       5
 * 6   7
 * 8
 * Output: 6
 * Approach:
 * - Similar to level order traversal problem, except we will not keep
 * track of all the levels.
 * - Instead, we keep inserting the child node to the queue and return
 * the next node as soon as we find the target.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class LevelOrderSuccessor {
    public BinaryTreeNode findSuccessor(final BinaryTreeNode root, final int key) {
        if (root == null) return null;

        final Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();

            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);

            // found key, return next element from the queue
            if (node.value == key) break;
        }

        return queue.peek();
    }
}
