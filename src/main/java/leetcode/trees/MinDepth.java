package leetcode.trees;

import common.BinaryTree;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem:
 * - Given a binary tree, find its minimum depth.
 * Approach:
 * - Similar to finding maximum depth, the minimum depth of the current node is
 * the smaller of the min height of the left subtree and the right subtree plus one.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class MinDepth {
    public int minDepthRec(BinaryTree root) {
        if (root == null) return 0;

        if (root.left == null) return minDepthRec(root.right) + 1;
        if (root.right == null) return minDepthRec(root.left) + 1;

        return Math.min(minDepthRec(root.left), minDepthRec(root.right)) + 1;
    }

    public int minDepthIt(BinaryTree root) {
        if (root == null) return 0;

        int depth = 1;
        final Deque<BinaryTree> deque = new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                final BinaryTree node = deque.poll();

                if (node.left == null && node.right == null) return depth;

                if (node.left != null) deque.offer(node.left);
                if (node.right != null) deque.offer(node.right);
            }
            depth++;
        }
        return depth;
    }
}
