package leetcode.array_and_string;

import junit.framework.TestCase;

public class ValidPalindromeTest extends TestCase {
    public void testTwoSum() {
        assertTrue(new ValidPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(new ValidPalindrome().isPalindrome("race a car"));
    }
}
