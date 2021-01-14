package interviewcake.trees_and_graphs;

import common.BinaryTreeNode;
import junit.framework.TestCase;

public class SuperBalancedBinaryTreeTest extends TestCase {
    public void testIsSuperBalanced() {
        final BinaryTreeNode root = new BinaryTreeNode(5);
        final BinaryTreeNode a = root.insertLeft(8);
        final BinaryTreeNode b = root.insertRight(6);
        a.insertLeft(1);
        a.insertRight(2);
        b.insertLeft(3);
        b.insertRight(4);
        assertTrue(new SuperBalancedBinaryTree().isSuperBalanced(root));
    }
}
