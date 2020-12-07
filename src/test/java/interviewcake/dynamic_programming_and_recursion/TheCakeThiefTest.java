package interviewcake.dynamic_programming_and_recursion;

import junit.framework.TestCase;

public class TheCakeThiefTest extends TestCase {
    public void testMaxDuffelBagValue() {
        final TheCakeThief.CakeType[] cakeTypes = {
                new TheCakeThief.CakeType(2, 3), new TheCakeThief.CakeType(3, 6), new TheCakeThief.CakeType(5, 1),
                new TheCakeThief.CakeType(6, 1), new TheCakeThief.CakeType(7, 1), new TheCakeThief.CakeType(8, 1)
        };
        assertEquals(
                12,
                new TheCakeThief().maxDuffelBagValue(cakeTypes, 7)
        );
    }

}
