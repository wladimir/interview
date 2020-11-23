package interview_cake.array_and_string_manipulation;

import junit.framework.TestCase;

import java.util.Arrays;

public class ReverseStringInPlaceTest extends TestCase {
    public void testReverse() {
        assertTrue(
                Arrays.equals(
                        new char[]{'d', 'c', 'b', 'a'},
                        new ReverseStringInPlace().reverse(new char[]{'a', 'b', 'c', 'd'})
                )
        );
    }
}
