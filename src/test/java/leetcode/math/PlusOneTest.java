package leetcode.math;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest extends TestCase {
    public void testPlusOne() {
        assertArrayEquals(
                new int[]{1, 2, 6},
                new PlusOne().plusOne(new int[]{1, 2, 5})
        );
        assertArrayEquals(
                new int[]{1, 3, 0},
                new PlusOne().plusOne(new int[]{1, 2, 9})
        );
        assertArrayEquals(
                new int[]{2, 0, 0},
                new PlusOne().plusOne(new int[]{1, 9, 9})
        );
        assertArrayEquals(
                new int[]{1, 0, 0, 0},
                new PlusOne().plusOne(new int[]{9, 9, 9})
        );
    }
}
