package grokking_the_coding_interview.two_pointers;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class DutchNationalFlagTest extends TestCase {
    public void testSort() {
        assertArrayEquals(
                new int[]{0, 0, 1, 2, 2, 2},
                new DutchNationalFlag().sort(new int[]{2, 2, 0, 1, 2, 0})
        );
    }
}
