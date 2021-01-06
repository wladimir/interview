package grokking_the_coding_interview.fast_and_slow_pointers;

/**
 * Problem:
 * - Given the head of a singly linked list, write a function to find the
 * starting node of the cycle.
 * Approach:
 * - Similar to finding a cycle in a linked list problem, can also determine
 * the start of its cycle and calculate length k of the cycle.
 * - Have one pointer at the beginning and one at kth node of the linked list.
 * - Move both of them until they meet at the start.of the cycle.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class CycleStartTest {
}
