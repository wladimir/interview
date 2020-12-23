package grokking_the_coding_interview.sliding_window;

import junit.framework.TestCase;

public class MinSizeSubArraySumTest extends TestCase {
    public void testFindMinSubArray() {
        assertEquals(
                2,
                new MinSizeSubArraySum().findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2})
        );
    }
}
