package grokking_the_coding_interview.tree_bfs;

import common.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Problem:
- Given a binary tree, populate an array to represent the averages of all of
  its levels.
Example:
- Input:
      1
	2   3
  4       5
  Output: []double{1, 2.5, 4.5}
Approach:
- Similar to level order traversal problem, except we keep track of the sum
  at each level and return the average in the end.
Cost:
- O(n) time, O(n) space.
*/
public class LevelAverages {
    public List<Double> findLevelAverages(BinaryTreeNode root) {
        final List<Double> averages = new ArrayList<>();
        if (root == null) return averages;

        final Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            double sum = 0;

            for (int i = 0; i < size; i++) {
                final BinaryTreeNode node = queue.poll();
                sum += node.value;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            averages.add(sum / size);
        }

        return averages;
    }
}
