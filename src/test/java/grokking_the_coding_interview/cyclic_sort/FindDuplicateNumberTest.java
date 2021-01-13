package grokking_the_coding_interview.cyclic_sort;

import junit.framework.TestCase;

public class FindDuplicateNumberTest extends TestCase {
    public void testFindNumber() {
        assertEquals(
                1,
                new FindDuplicateNumber().findNumber(new int[]{1, 4, 4, 3, 2})
        );
    }
}
