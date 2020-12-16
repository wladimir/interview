package leetcode.trees;

import common.BinaryTree;

/**
 * Problem:
 * - Given a binary tree, determine if it is height-balanced.
 * Approach:
 * - Calculate max depth for the left subtree and right subtree.
 * - If either the left subtree or right subtree is unbalanced, return right away.
 * Cost:
 * - O(n) time, O(n) stack space.
 */
public class BalancedBinaryTree {
    public boolean isBalanced(final BinaryTree root) {
        return maxDepth(root) != -1;
    }

    private int maxDepth(final BinaryTree root) {
        if (root == null) return 0;

        int maxLeft = maxDepth(root.left);
        if (maxLeft == -1) return -1;

        int maxRight = maxDepth(root.right);
        if (maxRight == -1) return -1;

        if (Math.abs(maxLeft - maxRight) > 1) return -1;
        else return Math.max(maxLeft, maxRight) + 1;
    }
}
