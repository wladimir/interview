package freecodecamp.dynamic_programming;

import junit.framework.TestCase;

public class GridTravellerTest extends TestCase {
    public void testGridTraveller() {
        assertEquals(
                1,
                new GridTraveller().gridTraveller(1, 1)
        );

        assertEquals(
                6,
                new GridTraveller().gridTraveller(3, 3)
        );
    }

    public void testGridTravellerMemoized() {
        assertEquals(
                2333606220L,
                new GridTraveller().gridTravellerMemoized(18, 18)
        );
    }
}
