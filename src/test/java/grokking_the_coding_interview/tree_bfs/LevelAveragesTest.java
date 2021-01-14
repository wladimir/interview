package grokking_the_coding_interview.tree_bfs;

import common.BinaryTreeNode;
import junit.framework.TestCase;

import static java.util.Arrays.asList;

public class LevelAveragesTest extends TestCase {
    public void testFindLevelAverages() {
        BinaryTreeNode root = new BinaryTreeNode(12);
        root.left = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(1);
        root.left.left = new BinaryTreeNode(9);
        root.left.right = new BinaryTreeNode(2);
        root.right.left = new BinaryTreeNode(10);
        root.right.right = new BinaryTreeNode(5);

        assertEquals(
                asList(12D, 4D, 6.5D),
                new LevelAverages().findLevelAverages(root)
        );
    }
}
