package grokking_the_coding_interview.two_heaps;

import java.util.PriorityQueue;

/**
 * Problem:
 * - Find the median of a number stream. The median is the middle value in an ordered integer list.
 * Example:
 * 1. insert(1)
 * 2. findMedian() -> 1
 * 3. insert(6)
 * 2. findMedian() -> 3.5
 * 3. insert(2)
 * 5. findMedian() -> 2
 * 6. insert(5)
 * 7. findMedian() -> 3.5
 * 8. insert(3)
 * 9. findMedian() -> 3
 * Approach:
 * - Divide the stream into 2 lists where one holds all numbers that are less
 * than the median and vice versa.
 * - Since the median is either be the largest of the smaller list (maxHeap) or
 * the smallest one of the larger list (minHeap), can use a min heap and max heap
 * respectively. That said, if the largest value of the smaller list is >= inserted
 * value, insert to the smaller list. Else, insert to the larger list.
 * - At every insertion, balance the numbers in both heap.
 * Cost:
 * - O(1) time, O(n) space.
 */
public class MedianOfStream {
    // first half, keep track of max element
    final PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a),
    // second half, keep track of min
    minHeap = new PriorityQueue<>((a, b) -> a - b);

    public void insertNum(final int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() >= num) maxHeap.add(num);
        else minHeap.add(num);

        // balance, either both the heaps will have equal number of elements or
        //max-heap will have one more element than the min-heap
        if (maxHeap.size() > minHeap.size() + 1) minHeap.add(maxHeap.poll());
        else if (minHeap.size() > maxHeap.size()) maxHeap.add(minHeap.poll());
    }

    public double findMedian() {
        return (maxHeap.size() == minHeap.size())
                ? (double) (maxHeap.peek() + minHeap.peek()) / 2
                : maxHeap.peek();
    }
}
