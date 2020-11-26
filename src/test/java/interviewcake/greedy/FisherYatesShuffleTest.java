package interviewcake.greedy;

import junit.framework.TestCase;

public class FisherYatesShuffleTest extends TestCase {
    public void testShuffle() {
        assertNotNull(
                new FisherYatesShuffle().shuffle(new int[]{1, 2, 3, 4, 5})
        );
    }
}
