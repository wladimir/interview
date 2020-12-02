package interviewcake.trees_and_graphs;

import common.BinaryTree;
import junit.framework.TestCase;

public class SecondLargestItemTest extends TestCase {
    public void testFindSecondLargest() {
        final BinaryTree root = new BinaryTree(50);
        final BinaryTree a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
        final BinaryTree b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);

        assertEquals(80, new SecondLargestItem().findLargest(root));
        assertEquals(70, new SecondLargestItem().findSecondLargest(root));
    }
}
