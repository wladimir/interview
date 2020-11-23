package interview_cake.array_and_string_manipulation;

import junit.framework.TestCase;

import java.util.Arrays;

public class ReverseWordsTest extends TestCase {
    public void testReverseWords() {
        assertTrue(
                Arrays.equals(
                        new char[]{'w', 'o', 'r', 'l', 'd', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 's', 'a', 'y'},
                        new ReverseWords().reverseWords(new char[]{'s', 'a', 'y', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'})
                )
        );
    }
}
