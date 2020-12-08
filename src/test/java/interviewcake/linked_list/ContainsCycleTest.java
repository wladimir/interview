package interviewcake.linked_list;

import common.LinkedListNode;
import junit.framework.TestCase;

public class ContainsCycleTest extends TestCase {
    private LinkedListNode[] valuesToLinkedListNodes(int[] values) {
        final LinkedListNode[] nodes = new LinkedListNode[values.length];
        for (int i = 0; i < values.length; ++i) {
            nodes[i] = new LinkedListNode(values[i]);
            if (i > 0) {
                nodes[i - 1].next = nodes[i];
            }
        }
        return nodes;
    }

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
