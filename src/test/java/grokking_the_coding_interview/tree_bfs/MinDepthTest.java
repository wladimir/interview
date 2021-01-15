package grokking_the_coding_interview.tree_bfs;

import common.BinaryTreeNode;
import junit.framework.TestCase;

public class MinDepthTest extends TestCase {
    public void testFindDepth() {
        BinaryTreeNode root = new BinaryTreeNode(12);
        root.left = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(1);
        root.right.left = new BinaryTreeNode(10);
        root.right.right = new BinaryTreeNode(5);

        assertEquals(
                2,
                new MinDepth().findDepth(root)
        );
    }
}
