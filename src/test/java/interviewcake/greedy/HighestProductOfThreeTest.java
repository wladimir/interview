package interviewcake.greedy;

import junit.framework.TestCase;

public class HighestProductOfThreeTest extends TestCase {
    public void testHighestProductOf3() {
        assertEquals(
                300,
                new HighestProductOfThree().highestProductOf3(new int[]{-10, -10, 1, 3, 2})
        );
    }
}
