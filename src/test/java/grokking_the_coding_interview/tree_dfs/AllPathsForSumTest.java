package grokking_the_coding_interview.tree_dfs;

import common.BinaryTreeNode;
import junit.framework.TestCase;

import static java.util.Arrays.asList;

public class AllPathsForSumTest extends TestCase {
    public void testFindPaths() {
        BinaryTreeNode root = new BinaryTreeNode(12);
        root.left = new BinaryTreeNode(7);
        root.right = new BinaryTreeNode(1);
        root.left.left = new BinaryTreeNode(4);
        root.right.left = new BinaryTreeNode(10);
        root.right.right = new BinaryTreeNode(5);

        assertEquals(
                asList(asList(12, 7, 4), asList(12, 1, 10)),
                new AllPathsForSum().findPaths(root, 23)
        );

    }
}
