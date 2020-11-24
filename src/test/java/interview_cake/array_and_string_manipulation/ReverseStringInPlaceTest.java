package interview_cake.array_and_string_manipulation;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class ReverseStringInPlaceTest extends TestCase {
    public void testReverse() {
        assertArrayEquals(
                new char[]{'d', 'c', 'b', 'a'},
                new ReverseStringInPlace().reverse(new char[]{'a', 'b', 'c', 'd'})
        );
    }
}
