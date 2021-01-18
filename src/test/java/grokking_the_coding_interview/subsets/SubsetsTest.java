package grokking_the_coding_interview.subsets;

import junit.framework.TestCase;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class SubsetsTest extends TestCase {
    public void testFindSubsets() {
        assertEquals(
                asList(emptyList(), asList(1), asList(5), asList(1, 5), asList(3), asList(1, 3), asList(5, 3), asList(1, 5, 3)),
                new Subsets().findSubsets(new int[]{1, 5, 3})
        );
    }
}
