package interviewcake.trees_and_graphs;

import common.BinaryTree;
import junit.framework.TestCase;

public class BalancedBinaryTreeTest extends TestCase {
    public void testIsSuperBalanced() {
        final BinaryTree root = new BinaryTree(5);
        final BinaryTree a = root.insertLeft(8);
        final BinaryTree b = root.insertRight(6);
        a.insertLeft(1);
        a.insertRight(2);
        b.insertLeft(3);
        b.insertRight(4);
        assertTrue(new BalancedBinaryTree().isSuperBalanced(root));
    }
}
