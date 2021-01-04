package grokking_the_coding_interview.fast_and_slow_pointers;

/*
Problem:
- Given the head of a singly linked list, write a function to determine
  if it contains a cycle.
Approach:
- Have a slow pointer move one step at a time while the fast one move
  2 steps at a time.
- If the linked list has a cycle, the fast pointer will catch the slow one.
Cost:
- O(n) time, O(1) space.
*/
public class LinkedListCycle {
}
