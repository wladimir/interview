package leetcode.trees;

import common.BinaryTreeNode;
import junit.framework.TestCase;

public class ValidateBinarySearchTreeTest extends TestCase {
    public void testIsValidBST() {
        final BinaryTreeNode root = new BinaryTreeNode(50);
        final BinaryTreeNode a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTreeNode b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
        assertTrue(new ValidateBinarySearchTree().isValidBST(root));
    }
}
