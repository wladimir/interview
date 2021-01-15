package grokking_the_coding_interview.two_heaps;

import junit.framework.TestCase;

public class MedianOfStreamTest extends TestCase {
    public void testFindMedian() {
        MedianOfStream medianOfAStream = new MedianOfStream();
        medianOfAStream.insertNum(3);
        medianOfAStream.insertNum(1);
        assertEquals(2.0, medianOfAStream.findMedian());
        medianOfAStream.insertNum(5);
        assertEquals(3.0, medianOfAStream.findMedian());
        medianOfAStream.insertNum(4);
        assertEquals(3.5, medianOfAStream.findMedian());
    }
}
