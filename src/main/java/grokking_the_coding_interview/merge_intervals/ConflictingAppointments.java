package grokking_the_coding_interview.merge_intervals;

import common.Interval;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Problem:
 * - Given a list of intervals, check if any of them is conflicting.
 * Example:
 * - Input: []Interval{{1, 2}, {2, 3}, {4, 5}}
 * Output: false
 * - Input: []Interval{{1, 5}, {2, 3}}
 * Output: true
 * Approach:
 * - Similar to merge intervals problem, need to return the true
 * immediately if any of them is conflicting.
 * Cost:
 * - O(nlogn) time, O(n) space.
 */
public class ConflictingAppointments {
    public boolean canAttendAllAppointments(final Interval[] intervals) {
        if (intervals == null || intervals.length < 2) return true;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a.start));

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start < intervals[i - 1].end) return false;
        }

        return true;
    }
}
