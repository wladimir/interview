package freecodecamp.dynamic_programming;

import junit.framework.TestCase;

import static java.util.Arrays.asList;

public class CanConstructTest extends TestCase {
    public void testCanConstruct() {
        assertTrue(new CanConstruct().canConstruct("abcdef", asList("ab", "abc", "cd", "def", "abcd")));
    }
}
