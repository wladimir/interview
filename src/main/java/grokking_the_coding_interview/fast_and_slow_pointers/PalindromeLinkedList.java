package grokking_the_coding_interview.fast_and_slow_pointers;

import common.LinkedListNode;

/**
 * Problem:
 * - Given the head of a singly linked list, write a function to determine
 * if it is a palindrome in constant space.
 * Approach:
 * - Find the middle of the linked list and reverse a half list
 * - After comparing the first half with the reversed half to check if it's
 * a palindrome, revert to the half to original form.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(LinkedListNode head) {
        if (head == null || head.next == null) return true;

        LinkedListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        LinkedListNode revHead = reverse(slow);
        LinkedListNode revHeadCopy = revHead;

        boolean isPalindrome = true;
        while (head != null && revHead != null) {
            if (head.value != revHead.value) {
                isPalindrome = false;
                break;
            }
            head = head.next;
            revHead = revHead.next;
        }

        reverse(revHeadCopy);
        return isPalindrome;
    }

    private LinkedListNode reverse(LinkedListNode head) {
        LinkedListNode prev = null;

        while (head != null) {
            LinkedListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
