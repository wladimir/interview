package grokking_the_coding_interview.cyclic_sort;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class CyclicSortTest extends TestCase {
    public void testSort() {
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5},
                new CyclicSort().sort(new int[]{3, 1, 5, 4, 2})
        );
    }
}
