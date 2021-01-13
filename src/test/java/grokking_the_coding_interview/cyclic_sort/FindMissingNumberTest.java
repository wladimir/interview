package grokking_the_coding_interview.cyclic_sort;

import junit.framework.TestCase;

public class FindMissingNumberTest extends TestCase {
    public void testFindMissingNumber() {
        assertEquals(
                2,
                new FindMissingNumber().findMissingNumber(new int[]{4, 0, 3, 1})
        );
    }
}
