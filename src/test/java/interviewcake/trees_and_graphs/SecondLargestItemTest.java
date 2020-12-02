package interviewcake.trees_and_graphs;

import junit.framework.TestCase;

public class SecondLargestItemTest extends TestCase {
    final BinaryTree root = new BinaryTree(50);
    final BinaryTree a = root.insertLeft(30);
        a.insertLeft(10);
        a.insertRight(40);
    final BinaryTree b = root.insertRight(70);
        b.insertLeft(60);
        b.insertRight(80);
    final int actual = findSecondLargest(root);
    final int expected = 70;
    assertEquals(expected, actual);
}
