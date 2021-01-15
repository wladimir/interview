package grokking_the_coding_interview.tree_bfs;

import common.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Problem:
 * - Given a binary tree, populate the values of all nodes of each level
 * from left to right in separate sub-arrays.
 * Example:
 * - Input:
 * 1
 * 2   3
 * 4       5
 * Output: []int{}{[]int{}{1}, []int{}{2, 3}, []int{}{4, 5}}
 * Approach:
 * - Start by pushing the root node to the queue.
 * - Keep iterating until the queue is empty.
 * - At each step,
 * - send the front of the queue and dequeue it
 * - enqueue its left and right child
 * Cost:
 * - O(n) time, O(n) space.
 * <p>
 * When looking for reverse level order traversal, just add as first element to result, eg.
 * result.add(0, level);
 * <p>
 * When looking for zigzag level order traversal, keep track of order, eg. leftToRight = true,
 * and either level.add(node.value) or level.add(0, node.value)
 */
public class LevelOrderTraversal {
    public List<List<Integer>> traverse(final BinaryTreeNode root) {
        final List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        // usable, but don't need deque
        // final Deque<BinaryTreeNode> queue = new ArrayDeque<>();
        final Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            final List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                final BinaryTreeNode node = queue.poll();
                level.add(node.value);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(level);
        }

        return result;
    }
}
