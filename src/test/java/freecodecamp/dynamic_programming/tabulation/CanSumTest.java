package freecodecamp.dynamic_programming.tabulation;

import junit.framework.TestCase;

import static java.util.Arrays.asList;

public class CanSumTest extends TestCase {
    public void testCanSum() {
        assertTrue(new CanSum().canSum(7, asList(5, 3, 4, 7)));
    }
}
