package leetcode.trees;

import common.BinaryTreeNode;
import junit.framework.TestCase;

public class MaxDepthTest extends TestCase {
    public void testMaxDepth() {
        final BinaryTreeNode root = new BinaryTreeNode(50);
        final BinaryTreeNode a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTreeNode b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertEquals(3, new MaxDepth().maxDepth(root));
    }
}
