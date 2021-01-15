package grokking_the_coding_interview.tree_dfs;

import common.BinaryTreeNode;

/**
 * Problem:
 * - Given a binary tree and a sum, find if the tree has a path from
 * root-to-leaf such that the sum of all the node values of that path
 * equals to the sum.
 * Example:
 * - Input: sum=8
 * 1
 * 2     3
 * 4  5   6  7
 * Output: true
 * Explanation: The path with sum 8 goes through 1, 2 and 5.
 * - Input: sum=16
 * 1
 * 2     3
 * 4  5   6  7
 * Output: false
 * Explanation: There is no path with sum 16.
 * Approach:
 * - Traverse the tree in a depth first search fashion.
 * - At each step, update the new sum by subtracting it with the current
 * value of the node's we're visiting.
 * - Once we hit the leaf node, return true if the sum is equal to its
 * value.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class PathSum {
    public boolean hasPath(final BinaryTreeNode root, final int sum) {
        if (root == null) return false;

        if (root.value == sum && root.left == null && root.right == null) return true;

        return hasPath(root.left, sum - root.value) || hasPath(root.right, sum - root.value);
    }
}
