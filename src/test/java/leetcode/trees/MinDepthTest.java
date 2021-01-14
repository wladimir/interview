package leetcode.trees;

import common.BinaryTreeNode;
import junit.framework.TestCase;

public class MinDepthTest extends TestCase {
    public void testMinDepthRec() {
        final BinaryTreeNode root = new BinaryTreeNode(50);
        root.insertLeft(30);
        final BinaryTreeNode b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertEquals(2, new MinDepth().minDepthRec(root));
    }

    public void testMinDepthIt() {
        final BinaryTreeNode root = new BinaryTreeNode(50);
        root.insertLeft(30);
        final BinaryTreeNode b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertEquals(2, new MinDepth().minDepthIt(root));
    }
}
