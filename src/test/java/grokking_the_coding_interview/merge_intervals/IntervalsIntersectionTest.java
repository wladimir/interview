package grokking_the_coding_interview.merge_intervals;

import common.Interval;
import junit.framework.TestCase;

import static java.util.Arrays.asList;

public class IntervalsIntersectionTest extends TestCase {
    public void testMerge() {
        final Interval[] input1 = new Interval[]{new Interval(1, 3), new Interval(5, 6), new Interval(7, 9)};
        final Interval[] input2 = new Interval[]{new Interval(2, 3), new Interval(5, 7)};

        assertEquals(
                asList(new Interval(2, 3), new Interval(5, 6), new Interval(7, 7)),
                asList(new IntervalsIntersection().merge(input1, input2))
        );
    }
}
