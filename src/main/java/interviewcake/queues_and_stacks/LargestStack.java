package interviewcake.queues_and_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem:
 * - Implement a stack with a method getMax() that returns the largest element in
 * the stack in O(1) time.
 * Approach:
 * - We use two stack implementation themselves: one holds all the items and the
 * other holds all the maximum values after each push() and pop().
 * - That way, we could keep track of your maximum value up to date in constant
 * time.
 * Cost:
 * - O(1) time, O(m) space where m is the number of operations performed on the
 * stack.
 */
public class LargestStack {
    private final Deque<Integer> stack = new ArrayDeque<>();
    private final Deque<Integer> max = new ArrayDeque<>();

    public void push(final int item) {
        stack.push(item);
        if (max.isEmpty() || max.peek() <= item) max.push(item);
    }

    public int pop() {
        final int item = stack.pop();
        if (item == max.peek()) max.pop();
        return item;
    }

    public int getMax() {
        return max.peek();
    }
}
