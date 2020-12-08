package interviewcake.queues_and_stacks;

import junit.framework.TestCase;

public class BracketValidatorTest extends TestCase {
    public void testIsValid() {
        assertTrue(new BracketValidator().isValid("([]{[]})[]{{}()}"));
        assertFalse(new BracketValidator().isValid("[[]]())"));
        assertFalse(new BracketValidator().isValid("[[]]["));
    }
}
