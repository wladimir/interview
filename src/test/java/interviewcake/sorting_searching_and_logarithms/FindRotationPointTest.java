package interviewcake.sorting_searching_and_logarithms;

import junit.framework.TestCase;

public class FindRotationPointTest extends TestCase {
    public void testFindRotationPoint() {
        assertEquals(
                5,
                new FindRotationPoint().findRotationPoint(new String[]{
                        "ptolemaic",
                        "retrograde",
                        "supplant",
                        "undulate",
                        "xenoepist",
                        "asymptote", // <-- rotates here!
                        "babka",
                        "banoffee",
                        "engender",
                        "karpatka",
                        "othellolagkage"
                })
        );
        assertEquals(
                4,
                new FindRotationPoint().findRotationPoint(new String[]{
                        "ptolemaic",
                        "retrograde",
                        "supplant",
                        "undulate",
                        "xenoepist",
                })
        );
    }
}
