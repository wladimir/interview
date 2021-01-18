package grokking_the_coding_interview.subsets;

import junit.framework.TestCase;

import static java.util.Arrays.asList;

public class PermutationsTest extends TestCase {
    public void testFindPermutations() {
        assertEquals(
                asList(asList(5, 3, 1), asList(3, 5, 1), asList(3, 1, 5), asList(5, 1, 3), asList(1, 5, 3), asList(1, 3, 5)),
                new Permutations().findPermutations(new int[]{1, 3, 5})
        );
    }
}
