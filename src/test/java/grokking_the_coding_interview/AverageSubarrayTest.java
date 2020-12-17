package grokking_the_coding_interview;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class AverageSubarrayTest extends TestCase {
    public void testFindAverages() {
        assertArrayEquals(
                new double[]{2.2, 2.8, 2.4, 3.6, 2.8},
                new AverageSubarray().findAverages(5, new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2}),
                0
        );
    }
}
