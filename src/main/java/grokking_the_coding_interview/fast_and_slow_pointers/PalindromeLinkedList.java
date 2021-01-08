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
    public boolean isPalindrome(final LinkedListNode head) {

    }
}
