package interviewcake.array_and_string;

import common.Interval;
import common.Pair;
import junit.framework.TestCase;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class MergeMeetingTimesTest extends TestCase {
    public void test() {
        final List<Pair<List<Interval>>> pairs = asList(
                Pair.of(
                        emptyList(),
                        emptyList()
                ),
                Pair.of(
                        asList(new Interval(1, 2)),
                        asList(new Interval(1, 2))
                ),
                Pair.of(
                        asList(new Interval(1, 2), new Interval(2, 3)),
                        asList(new Interval(1, 3))
                ),
                Pair.of(
                        asList(new Interval(1, 5), new Interval(2, 3)),
                        asList(new Interval(1, 5))
                ),
                Pair.of(
                        asList(new Interval(1, 2), new Interval(4, 5)),
                        asList(new Interval(1, 2), new Interval(4, 5))
                ),
                Pair.of(
                        asList(new Interval(1, 5), new Interval(2, 3), new Interval(4, 5)),
                        asList(new Interval(1, 5))
                ),
                Pair.of(
                        asList(new Interval(1, 2), new Interval(2, 3), new Interval(4, 5)),
                        asList(new Interval(1, 3), new Interval(4, 5))
                ),
                Pair.of(asList(new Interval(1, 6), new Interval(2, 3), new Interval(4, 5)),
                        asList(new Interval(1, 6))
                )
        );

        pairs.forEach(p -> assertEquals(p.b, new MergeMeetingTimes().mergeMeetings(p.a)));
    }
}
