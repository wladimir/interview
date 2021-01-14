package leetcode.trees;

import common.BinaryTreeNode;
import junit.framework.TestCase;

public class BalancedBinaryTreeTest extends TestCase {
    public void testIsBalanced() {
        final BinaryTreeNode root = new BinaryTreeNode(50);
        final BinaryTreeNode a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTreeNode b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertTrue(new BalancedBinaryTree().isBalanced(root));
    }

    public void testIsNotBalanced() {
        final BinaryTreeNode root = new BinaryTreeNode(50);
        root.insertLeft(30);
        final BinaryTreeNode b = root.insertRight(70);
        b.insertLeft(60);
        BinaryTreeNode c = b.insertRight(80);
        c.insertLeft(99);
        c.insertRight(100);
        assertFalse(new BalancedBinaryTree().isBalanced(root));
    }
}
