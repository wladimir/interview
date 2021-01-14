package leetcode.trees;

import common.BinaryTreeNode;

/**
 * Problem:
 * - Given a binary tree, determine if it is a valid binary search tree.
 * Approach:
 * - Traverse the tree and apply recursion to check at each step if:
 * - the current node's value is greater than the lower bound
 * - the current node's value is smaller than the upper bound
 * - the current node's left child follows
 * - the current node's left child follows
 * Cost:
 * - O(n) time and O(n) stack space.
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(BinaryTreeNode root) {
        return isValidBSTRec(root, null, null);
    }

    private boolean isValidBSTRec(BinaryTreeNode root, Integer min, Integer max) {
        if (root == null) return true;

        if ((min != null && min > root.value) || (max != null && max < root.value)) return false;

        return isValidBSTRec(root.left, min, root.value) && isValidBSTRec(root.right, root.value, max);
    }
}
