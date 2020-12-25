package grokking_the_coding_interview.two_pointers;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class SquaringSortedArrayTest extends TestCase {
    public void testMakeSquares() {
        assertArrayEquals(
                new int[]{0, 1, 4, 4, 9},
                new SquaringSortedArray().makeSquares(new int[]{-2, -1, 0, 2, 3})
        );
    }
}
