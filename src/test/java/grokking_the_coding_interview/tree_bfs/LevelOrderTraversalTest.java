package grokking_the_coding_interview.tree_bfs;

import common.BinaryTreeNode;
import junit.framework.TestCase;

import static java.util.Arrays.asList;

public class LevelOrderTraversalTest extends TestCase {
    public void testTraverse() {
        BinaryTreeNode root = new BinaryTreeNode(12);
        root.left = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(1);
        root.left.left = new BinaryTreeNode(9);
        root.right.left = new BinaryTreeNode(10);
        root.right.right = new BinaryTreeNode(5);

        assertEquals(
                asList(asList(12), asList(7, 1), asList(9, 10, 5)),
                new LevelOrderTraversal().traverse(root)
        );
    }
}
