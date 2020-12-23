package grokking_the_coding_interview.sliding_window;

import junit.framework.TestCase;

public class NoRepeatSubstringTest extends TestCase {
    public void testFindLength() {
        assertEquals(
                3,
                new NoRepeatSubstring().findLength("aabccbb")
        );
        assertEquals(
                2,
                new NoRepeatSubstring().findLength("abbbb")
        );
        assertEquals(
                3,
                new NoRepeatSubstring().findLength("abccde")
        );
    }
}
