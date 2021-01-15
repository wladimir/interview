package grokking_the_coding_interview.tree_dfs;

import common.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem:
 * - Given a binary tree where each node can only have a digit (0-9) value,
 * each root-to-leaf path will represent a number. Find the total sum of
 * all the numbers represented by all paths.
 * Example:
 * - Input:
 * 1
 * 2     3
 * 4  5   6  7
 * Output: 522 (= 124 + 125 + 136 + 137)
 * Approach:
 * - Traverse the tree in a depth first search fashion.
 * - At each level, the sum is equal to the result of the last sum times 10
 * plus the current's node value.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class AllPathsForSum {
    public List<List<Integer>> findPaths(final BinaryTreeNode root, final int sum) {
        final List<List<Integer>> allPaths = new ArrayList<>();
        final List<Integer> path = new ArrayList<>();

        findPathsRec(root, allPaths, path, sum);
        return allPaths;
    }

    private void findPathsRec(final BinaryTreeNode root, final List<List<Integer>> allPaths, final List<Integer> path, final int sum) {
        if (root == null) return;

        path.add(root.value);

        if (root.value == sum && root.left == null && root.right == null) {
            // add as new object to avoid mutating it later
            allPaths.add(new ArrayList<>(path));
        } else {
            findPathsRec(root.left, allPaths, path, sum - root.value);
            findPathsRec(root.right, allPaths, path, sum - root.value);
        }

        // remove last for backtracking
        path.remove(path.size() - 1);
    }
}
