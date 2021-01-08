package grokking_the_coding_interview.fast_and_slow_pointers;

import common.LinkedListNode;
import junit.framework.TestCase;

public class CycleStartTest extends TestCase {
    public void testFindCycleStart() {
        final LinkedListNode head = new LinkedListNode(1);
        head.next = new LinkedListNode(2);
        head.next.next = new LinkedListNode(3);
        head.next.next.next = new LinkedListNode(4);
        head.next.next.next.next = new LinkedListNode(5);
        head.next.next.next.next.next = new LinkedListNode(6);

        head.next.next.next.next.next.next = head.next.next; // 6 -> 3

        assertEquals(
                3,
                new CycleStart().findCycleStart(head).value
        );
    }
}
