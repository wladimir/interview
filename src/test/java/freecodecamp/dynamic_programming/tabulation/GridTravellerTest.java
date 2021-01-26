package freecodecamp.dynamic_programming.tabulation;

import junit.framework.TestCase;

public class GridTravellerTest extends TestCase {
    public void testGridTraveler() {
        assertEquals(
                6,
                new GridTraveller().gridTraveler(3, 3)
        );
    }
}
