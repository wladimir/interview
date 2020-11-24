package hashing;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class TopScoresTest extends TestCase {
    public void testSort() {
        assertArrayEquals(
                new int[]{91, 89, 65, 65, 53, 41, 37},
                new TopScores().sort(new int[]{37, 89, 41, 65, 65, 91, 53}, 100)
        );
    }
}
