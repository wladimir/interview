package leetcode.array_and_string;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class TwoSumTest extends TestCase {
    public void testTwoSum() {
        assertArrayEquals(
                new int[]{0, 1},
                new TwoSum().twoSum(new int[]{2, 7, 11, 15}, 9)
        );
    }
}
