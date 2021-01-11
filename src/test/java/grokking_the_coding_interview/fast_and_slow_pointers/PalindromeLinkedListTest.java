package grokking_the_coding_interview.fast_and_slow_pointers;

import common.LinkedListNode;
import junit.framework.TestCase;

import static common.LinkedListNode.valuesToLinkedListNodes;

public class PalindromeLinkedListTest extends TestCase {
    public void testIsPalindrome() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3, 2, 1});

        assertTrue(new PalindromeLinkedList().isPalindrome(nodes[0]));
    }

    public void testIsNotPalindrome() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[]{1, 2, 3});

        assertFalse(new PalindromeLinkedList().isPalindrome(nodes[0]));
    }
}
