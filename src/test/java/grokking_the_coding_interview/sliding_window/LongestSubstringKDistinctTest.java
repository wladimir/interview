package grokking_the_coding_interview.sliding_window;

import junit.framework.TestCase;

public class LongestSubstringKDistinctTest extends TestCase {
    public void testFindLength() {
        assertEquals(
                5,
                new LongestSubstringKDistinct().findLength("cbbebi", 3)
        );
    }
}
