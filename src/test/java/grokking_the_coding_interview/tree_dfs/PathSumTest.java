package grokking_the_coding_interview.tree_dfs;

import common.BinaryTreeNode;
import junit.framework.TestCase;

public class PathSumTest extends TestCase {
    public void testHasPath() {
        BinaryTreeNode root = new BinaryTreeNode(12);
        root.left = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(1);
        root.left.left = new BinaryTreeNode(9);
        root.right.left = new BinaryTreeNode(10);
        root.right.right = new BinaryTreeNode(5);

        assertTrue(new PathSum().hasPath(root, 23));
        assertFalse(new PathSum().hasPath(root, 16));
    }
}
