package grokking_the_coding_interview.merge_intervals;

import common.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem:
 * - Given a list of non-overlapping intervals sorted by their start time, insert
 * a given interval at the correct position and merge all necessary intervals to
 * produce a list that has only mutually exclusive intervals.
 * Example:
 * - Input: []Interval{{1, 3}, {5, 7}, {8, 12}}, interval{4, 6}
 * Output: []Interval{{1, 3}, {4, 7}, {8, 12}}
 * Approach:
 * - Since the list is sorted, can skip all the intervals where their end time is
 * less than the new interval's start time.
 * - The merging process is similar to the one in merge interval problem.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class InsertInterval {
    public List<Interval> insert(final List<Interval> intervals, final Interval newInterval) {
        if (intervals == null || intervals.isEmpty()) return Collections.singletonList(newInterval);

        final List<Interval> merged = new ArrayList<>();

        int i = 0;
        while (intervals.get(i).end < newInterval.start) merged.add(intervals.get(i++));

        int start = newInterval.start;
        int end = newInterval.end;
        while (intervals.get(i).start <= newInterval.end) {
            start = Math.min(intervals.get(i).start, start);
            end = Math.max(intervals.get(i).end, end);
            i++;
        }
        merged.add(new Interval(start, end));

        while (i < intervals.size()) merged.add(intervals.get(i++));

        return merged;
    }
}
