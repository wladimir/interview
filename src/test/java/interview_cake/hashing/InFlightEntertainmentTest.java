package interview_cake.hashing;

import hashing.InFlightEntertainment;
import junit.framework.TestCase;

public class InFlightEntertainmentTest extends TestCase {
    public void testFillFlight() {
        assertFalse(new InFlightEntertainment().fillFlight(new int[]{}, 6));
        assertTrue(new InFlightEntertainment().fillFlight(new int[]{2, 3, 4}, 6));
        assertFalse(new InFlightEntertainment().fillFlight(new int[]{2, 3, 4}, 8));
    }
}
