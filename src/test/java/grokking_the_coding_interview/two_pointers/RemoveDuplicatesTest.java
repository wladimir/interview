package grokking_the_coding_interview.two_pointers;

import junit.framework.TestCase;

public class RemoveDuplicatesTest extends TestCase {
    public void testRemove() {
        assertEquals(
                4,
                new RemoveDuplicates().remove(new int[]{2, 3, 3, 3, 6, 9, 9})
        );
    }
}
