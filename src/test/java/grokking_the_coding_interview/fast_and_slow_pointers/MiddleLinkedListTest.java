package grokking_the_coding_interview.fast_and_slow_pointers;

import common.LinkedListNode;
import junit.framework.TestCase;

import static common.LinkedListNode.valuesToLinkedListNodes;

public class MiddleLinkedListTest extends TestCase {
    public void testFindMiddle() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4});

        assertEquals(3,
                new MiddleLinkedList().findMiddle(nodes[0]).value
        );
    }
}
