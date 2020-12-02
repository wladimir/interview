package interviewcake.trees_and_graphs;

/**
 * Problem:
 * - Given a binary search tree, find the 2nd largest item.
 * Approach:
 * - The largest item in a binary search tree is the rightmost item. Can
 * simply traverse down the tree recursively to find one.
 * - The 2nd largest item could be the parent of the largest but it's not
 * necessary since the largest could have a left subtree and there might exist
 * one there.
 * - Still, the second largest one when the largest has a left subtree is basically
 * the largest one in that left subtree.
 * Cost:
 * - O(h) time, O(1) space, where h is the height of the tree.
 * - If the tree is balanced, the time complexity is (Olgn). Otherwise, it's O(n).
 */
public class SecondLargestItem {
}
