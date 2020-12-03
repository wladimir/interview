package interviewcake.dynamic_programming_and_recursion;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashSet;

public class RecursiveStringPermutationsTest extends TestCase {
    public void testThreeCharacterString() {
        assertEquals(
                new HashSet<>(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")),
                new RecursiveStringPermutations().getPermutations("abc")
        );
    }
}
