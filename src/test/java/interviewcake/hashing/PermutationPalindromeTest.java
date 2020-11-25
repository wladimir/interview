package interviewcake.hashing;

import junit.framework.TestCase;

public class PermutationPalindromeTest extends TestCase {
    public void testHasPalindromePermutation() {
        assertTrue(new PermutationPalindrome().hasPalindromePermutation("civic"));
        assertFalse(new PermutationPalindrome().hasPalindromePermutation("civil"));
    }
}
