package grokking_the_coding_interview.tree_bfs;

import common.BinaryTreeNode;
import junit.framework.TestCase;

public class LevelOrderSuccessorTest extends TestCase {
    public void testFindSuccessor() {
        BinaryTreeNode root = new BinaryTreeNode(12);
        root.left = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(1);
        root.left.left = new BinaryTreeNode(9);
        root.right.left = new BinaryTreeNode(10);
        root.right.right = new BinaryTreeNode(5);

        assertEquals(7,
                new LevelOrderSuccessor().findSuccessor(root, 12).value
        );
    }
}
