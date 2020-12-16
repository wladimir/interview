package leetcode.trees;

import common.BinaryTree;

/**
 * Problem:
 * - Given a binary tree, find its maximum depth.
 * Approach:
 * - The maximum depth of the current node is the greater of the max height of the left
 * subtree and the right subtree plus one.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class MaxDepth {
    public int maxDepth(BinaryTree root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
