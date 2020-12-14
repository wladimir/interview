package leetcode.linked_list;

import common.LinkedListNode;
import junit.framework.TestCase;

import static common.LinkedListNode.valuesToLinkedListNodes;

public class MergeSortedListTest extends TestCase {
    public void testMergeTwoLists() {
        final LinkedListNode[] l1 = valuesToLinkedListNodes(new int[]{1, 3, 5});
        final LinkedListNode[] l2 = valuesToLinkedListNodes(new int[]{2, 4, 6});
        LinkedListNode head = new MergeSortedList().mergeTwoLists(l1[0], l2[0]);

        assertEquals(1, head.value);
        head = head.next;
        assertEquals(2, head.value);
        head = head.next;
        assertEquals(3, head.value);
        head = head.next;
        assertEquals(4, head.value);
        head = head.next;
        assertEquals(5, head.value);
        head = head.next;
        assertEquals(6, head.value);
    }
}
