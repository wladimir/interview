package interviewcake.linked_list;

import common.LinkedListNode;
import junit.framework.TestCase;

import static common.LinkedListNode.valuesToLinkedListNodes;

public class KthToLastNodeTest extends TestCase {
    public void testKthToLastNode_1() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4});
        final int k = 1;
        final LinkedListNode actual = new KthToLastNode().kthToLastNode(k, listNodes[0]);
        final LinkedListNode expected = listNodes[listNodes.length - k];
        assertSame(expected, actual);
    }

    public void testKthToLastNode_2() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4});
        final int k = 2;
        final LinkedListNode actual = new KthToLastNode().kthToLastNode(k, listNodes[0]);
        final LinkedListNode expected = listNodes[listNodes.length - k];
        assertSame(expected, actual);
    }
}
