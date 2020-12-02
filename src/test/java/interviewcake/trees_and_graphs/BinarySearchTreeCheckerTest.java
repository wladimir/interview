package interviewcake.trees_and_graphs;

import common.BinaryTree;
import junit.framework.TestCase;

public class BinarySearchTreeCheckerTest extends TestCase {
    public void testIsBinarySearchTree() {
        final BinaryTree root = new BinaryTree(50);
        final BinaryTree a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTree b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertTrue(new BinarySearchTreeChecker().isBinarySearchTree(root));
    }
}
