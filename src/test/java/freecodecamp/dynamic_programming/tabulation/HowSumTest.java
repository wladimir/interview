package freecodecamp.dynamic_programming.tabulation;

import junit.framework.TestCase;

import static java.util.Arrays.asList;

public class HowSumTest extends TestCase {
    public void testHowSum() {
        assertEquals(
                asList(4, 3),
                new HowSum().howSum(7, asList(5, 3, 4))
        );
    }
}
