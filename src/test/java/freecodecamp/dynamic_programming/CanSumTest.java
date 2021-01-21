package freecodecamp.dynamic_programming;

import junit.framework.TestCase;

public class CanSumTest extends TestCase {
    public void testCanSum() {
        assertTrue(new CanSum().canSum(8, new int[]{2, 3, 5}));
    }

    public void testCanSumMemoized() {
        assertFalse(new CanSum().canSumMemoized(300, new int[]{7, 14}));
    }
}
