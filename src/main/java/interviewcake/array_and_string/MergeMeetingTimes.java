package interviewcake.array_and_string;

import common.Interval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Problem:
 * - Given a list of unsorted, independent Intervals, returns a list of a merged
 * one.
 * Example:
 * - Input: [[1, 2], [2, 3], [4, 5]]
 * Output: [[1,3], [4, 5]]
 * - Input: [[1, 5], [2, 3]]
 * Output: [[1, 5]]
 * Approach:
 * - Sort the list in ascending order so that Intervals that might need to be
 * merged are next to each other.
 * - Can merge two Intervals together if the first one's end time is greater or
 * or equal than the second one's start time.
 * Solution:
 * - Sort the list in ascending order.
 * - Create a new list of merged Intervals and consider the first Interval in the
 * original list to be the last merged one.
 * - Iterate through the original list and verify if the last merged Interval's
 * end time is greater or equal than the current Interval's start time.
 * - If it is true, merge them using the last merged Interval's start time
 * and the larger one's end time.
 * Cost:
 * - O(nlogn) time, O(n) space.
 * - Because we sort all Interval first, the runtime is O(nlogn). We create a new
 * list of merged Interval times, so the space cost is O(n).
 */
public class MergeMeetingTimes {
    public List<Interval> mergeMeetings(final List<Interval> intervals) {
        final List<Interval> merged = new ArrayList<>();
        if (intervals == null || intervals.isEmpty()) return intervals;

        intervals.sort(Comparator.comparingInt(a -> a.start));

        merged.add(intervals.get(0));
        for (Interval interval : intervals) {
            final Interval last = merged.get(merged.size() - 1);

            // if the current Interval overlaps with the last merged interval, use the
            // later end time of the two
            if (interval.start <= last.end) last.end = Math.max(last.end, interval.end);
            else merged.add(interval);
        }

        return merged;
    }
}
