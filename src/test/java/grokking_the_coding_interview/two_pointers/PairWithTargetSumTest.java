package grokking_the_coding_interview.two_pointers;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class PairWithTargetSumTest extends TestCase {
    public void testSearch() {
        assertArrayEquals(
                new int[]{1, 3},
                new PairWithTargetSum().search(new int[]{1, 2, 3, 4, 6}, 6)
        );
    }
}
