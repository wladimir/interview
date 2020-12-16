package leetcode.trees;

import common.BinaryTree;
import junit.framework.TestCase;

public class MinDepthTest extends TestCase {
    public void testMinDepthRec() {
        final BinaryTree root = new BinaryTree(50);
        root.insertLeft(30);
        final BinaryTree b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertEquals(2, new MinDepth().minDepthRec(root));
    }

    public void testMinDepthIt() {
        final BinaryTree root = new BinaryTree(50);
        root.insertLeft(30);
        final BinaryTree b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertEquals(2, new MinDepth().minDepthIt(root));
    }
}
