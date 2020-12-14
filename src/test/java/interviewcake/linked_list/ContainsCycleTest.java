package interviewcake.linked_list;

import common.LinkedListNode;
import junit.framework.TestCase;

import static common.LinkedListNode.valuesToLinkedListNodes;

public class ContainsCycleTest extends TestCase {
    public void testDoesNotContainCycle() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4});
        final boolean result = new ContainsCycle().containsCycle(nodes[0]);
        assertFalse(result);
    }

    public void testContainsCycle() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4, 5});
        nodes[4].next = nodes[2];
        final boolean result = new ContainsCycle().containsCycle(nodes[0]);
        assertTrue(result);
    }
}
