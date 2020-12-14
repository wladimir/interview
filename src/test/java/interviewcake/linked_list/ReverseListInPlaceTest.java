package interviewcake.linked_list;

import common.LinkedListNode;
import junit.framework.TestCase;

import static common.LinkedListNode.valuesToLinkedListNodes;

public class ReverseListInPlaceTest extends TestCase {
    private boolean isListReversed(LinkedListNode list, LinkedListNode[] originalNodes) {
        int i = originalNodes.length - 1;
        while (list != null && i >= 0) {
            if (originalNodes[i] != list) {
                return false;
            }
            list = list.next;
            i--;
        }
        return list == null && i == -1;
    }

    public void testReverse() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 4, 5, 6});
        final LinkedListNode result = new ReverseListInPlace().reverse(nodes[0]);
        assertTrue(isListReversed(result, nodes));
    }
}
