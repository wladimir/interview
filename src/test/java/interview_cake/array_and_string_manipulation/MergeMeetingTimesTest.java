package interview_cake.array_and_string_manipulation;

import common.Pair;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class MergeMeetingTimesTest extends TestCase {
    public void test() {
        final List<Pair<List<MergeMeetingTimes.Meeting>>> pairs = asList(
                Pair.of(
                        emptyList(),
                        emptyList()
                ),
                Pair.of(
                        asList(new MergeMeetingTimes.Meeting(1, 2)),
                        asList(new MergeMeetingTimes.Meeting(1, 2))
                ),
                Pair.of(
                        asList(new MergeMeetingTimes.Meeting(1, 2), new MergeMeetingTimes.Meeting(2, 3)),
                        asList(new MergeMeetingTimes.Meeting(1, 3))
                ),
                Pair.of(
                        asList(new MergeMeetingTimes.Meeting(1, 5), new MergeMeetingTimes.Meeting(2, 3)),
                        asList(new MergeMeetingTimes.Meeting(1, 5))
                ),
                Pair.of(
                        asList(new MergeMeetingTimes.Meeting(1, 2), new MergeMeetingTimes.Meeting(4, 5)),
                        asList(new MergeMeetingTimes.Meeting(1, 2), new MergeMeetingTimes.Meeting(4, 5))
                ),
                Pair.of(
                        asList(new MergeMeetingTimes.Meeting(1, 5), new MergeMeetingTimes.Meeting(2, 3), new MergeMeetingTimes.Meeting(4, 5)),
                        asList(new MergeMeetingTimes.Meeting(1, 5))
                ),
                Pair.of(
                        asList(new MergeMeetingTimes.Meeting(1, 2), new MergeMeetingTimes.Meeting(2, 3), new MergeMeetingTimes.Meeting(4, 5)),
                        asList(new MergeMeetingTimes.Meeting(1, 3), new MergeMeetingTimes.Meeting(4, 5))
                ),
                Pair.of(asList(new MergeMeetingTimes.Meeting(1, 6), new MergeMeetingTimes.Meeting(2, 3), new MergeMeetingTimes.Meeting(4, 5)),
                        asList(new MergeMeetingTimes.Meeting(1, 6))
                )
        );

        pairs.forEach(p -> assertEquals(p.b, new MergeMeetingTimes().mergeMeetings(p.a)));
    }
}
