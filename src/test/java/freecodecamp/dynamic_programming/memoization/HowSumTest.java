package freecodecamp.dynamic_programming.memoization;

import junit.framework.TestCase;

import static java.util.Arrays.asList;

public class HowSumTest extends TestCase {
    public void testHowSum() {
        assertEquals(
                asList(3, 2, 2),
                new HowSum().howSum(7, new int[]{2, 3})
        );
    }

    public void testHowSumMemoized() {
        assertEquals(
                asList(2, 2, 2, 2),
                new HowSum().howSumMemoized(8, new int[]{2, 3, 5})
        );
    }
}
