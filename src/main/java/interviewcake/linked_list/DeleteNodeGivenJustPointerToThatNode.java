package interviewcake.linked_list;

import common.LinkedListNode;

public class DeleteNodeGivenJustPointerToThatNode {
    public void deleteNode(LinkedListNode nodeToDelete) {
        final LinkedListNode next = nodeToDelete.next;

        if (next != null) {
            nodeToDelete.value = next.value;
            nodeToDelete.next = next.next;
        }
    }
}
