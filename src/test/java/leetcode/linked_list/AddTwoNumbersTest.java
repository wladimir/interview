package leetcode.linked_list;

import common.LinkedListNode;
import junit.framework.TestCase;

import static common.LinkedListNode.valuesToLinkedListNodes;

public class AddTwoNumbersTest extends TestCase {
    public void testAddTwoNumbers() {
        final LinkedListNode[] l1 = valuesToLinkedListNodes(new int[]{2, 4, 3});
        final LinkedListNode[] l2 = valuesToLinkedListNodes(new int[]{5, 6, 4});
        LinkedListNode head = new AddTwoNumbers().addTwoNumbers(l1[0], l2[0]);

        assertEquals(7, head.value);
        head = head.next;
        assertEquals(0, head.value);
        head = head.next;
        assertEquals(8, head.value);
    }
}
