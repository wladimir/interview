package interviewcake.queues_and_stacks;

import junit.framework.TestCase;

public class ParenthesisMatchingTest extends TestCase {
    public void testGetClosingParen() {
        assertEquals(
                7,
                new ParenthesisMatching().getClosingParen("((((()))))", 2)
        );
    }
}
