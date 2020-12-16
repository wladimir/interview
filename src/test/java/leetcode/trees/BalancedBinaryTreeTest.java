package leetcode.trees;

import common.BinaryTree;
import junit.framework.TestCase;

public class BalancedBinaryTreeTest extends TestCase {
    public void testIsBalanced() {
        final BinaryTree root = new BinaryTree(50);
        final BinaryTree a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTree b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertTrue(new BalancedBinaryTree().isBalanced(root));
    }

    public void testIsNotBalanced() {
        final BinaryTree root = new BinaryTree(50);
        root.insertLeft(30);
        final BinaryTree b = root.insertRight(70);
        b.insertLeft(60);
        BinaryTree c = b.insertRight(80);
        c.insertLeft(99);
        c.insertRight(100);
        assertFalse(new BalancedBinaryTree().isBalanced(root));
    }
}
