package interviewcake.trees_and_graphs;

import common.BinaryTreeNode;
import junit.framework.TestCase;

public class BinarySearchTreeCheckerTest extends TestCase {
    public void testIsBinarySearchTree() {
        final BinaryTreeNode root = new BinaryTreeNode(50);
        final BinaryTreeNode a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTreeNode b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertTrue(new BinarySearchTreeChecker().isBinarySearchTree(root));
    }
}
