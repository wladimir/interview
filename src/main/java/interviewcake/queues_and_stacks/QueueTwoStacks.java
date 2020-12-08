package interviewcake.queues_and_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem:
 * - Implement a queue with 2 stacks.
 * Approach:
 * - Use one stack for enqueuing item and the other to reverse the order them for
 * dequeuing/popping item.
 * Cost:
 * - O(1) time, O(m) space m is the number of operations.
 */
public class QueueTwoStacks {
    private final Deque<Integer> in = new ArrayDeque<>();
    private final Deque<Integer> out = new ArrayDeque<>();

    public void enqueue(final int item) {
        in.push(item);
    }

    public int dequeue() {
        if (out.isEmpty())
            while (!in.isEmpty()) out.push(in.pop());

        return out.pop();
    }
}
