package interviewcake.array_and_string;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class ReverseWordsTest extends TestCase {
    public void testReverseWords() {
        assertArrayEquals(
                new char[]{'w', 'o', 'r', 'l', 'd', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 's', 'a', 'y'},
                new ReverseWords().reverseWords(new char[]{'s', 'a', 'y', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'})
        );
    }
}
