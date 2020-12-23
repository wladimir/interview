package grokking_the_coding_interview.sliding_window;

import junit.framework.TestCase;

public class MaxSubarrayTest extends TestCase {
    public void testFindMaxSumSubArray() {
        assertEquals(
                8,
                new MaxSubarray().findMaxSumSubArray(3, new int[]{2, 1, 5, 1, 3, 2})
        );
    }
}
