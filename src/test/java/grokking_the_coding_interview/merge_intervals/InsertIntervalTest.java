package grokking_the_coding_interview.merge_intervals;

import common.Interval;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class InsertIntervalTest extends TestCase {
    public void testInsert() {
        final List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 3));
        input.add(new Interval(5, 7));
        input.add(new Interval(8, 12));

        assertEquals(
                asList(new Interval(1, 3), new Interval(4, 7), new Interval(8, 12)),
                new InsertInterval().insert(input, new Interval(4, 6))
        );
    }
}
