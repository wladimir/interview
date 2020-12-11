package leetcode.array_and_string;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumSortedTest extends TestCase {
    public void testTwoSumSorted() {
        assertArrayEquals(
                new int[]{0, 1},
                new TwoSumSorted().twoSumSorted(new int[]{2, 7, 11, 15}, 9)
        );
    }
}
