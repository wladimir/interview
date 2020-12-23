package grokking_the_coding_interview.sliding_window;

import junit.framework.TestCase;

public class FruitsIntoBasketsTest extends TestCase {
    public void testFindLength() {
        assertEquals(
                3,
                new FruitsIntoBaskets().findLength(new char[]{'A', 'B', 'C', 'A', 'C'})
        );
        assertEquals(
                5,
                new FruitsIntoBaskets().findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'})
        );
    }
}
