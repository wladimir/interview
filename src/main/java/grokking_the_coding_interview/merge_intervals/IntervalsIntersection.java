package grokking_the_coding_interview.merge_intervals;

import common.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem:
 * - Given two sorted lists of intervals, find the intersection between them.
 * Example:
 * - Input: []Interval{{1, 3}, {5, 6}, {7, 9}}, []Interval{{2, 3}, {5, 7}}
 * Output: []Interval{{2, 3}, {5, 6}, {7, 7}}
 * Approach:
 * - Iterate through both list at the same time and check if two intervals
 * are overlapping at each step.
 * - Opposite to the merging process, an overlapped interval has:
 * - a bigger start between the two intervals
 * - a smaller end between the two intervals
 * Cost:
 * - O(n) time, O(n) space.
 */
public class IntervalsIntersection {
    public Interval[] merge(final Interval[] arr1, final Interval[] arr2) {
        final List<Interval> merged = new ArrayList<>();

        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            // if two intervals are overlapping, insert an interval that has a
            // bigger start between the two intervals and a smaller end between them
            if ((arr1[i].start >= arr2[j].start && arr1[i].start <= arr2[j].end) ||
                    (arr2[j].start >= arr1[i].start && arr2[j].start <= arr1[i].end)) {
                merged.add(new Interval(
                        Math.max(arr1[i].start, arr2[j].start),
                        Math.min(arr1[i].end, arr2[j].end)
                ));
            }

            if (arr1[i].end < arr2[j].end) i++;
            else j++;
        }

        return merged.toArray(new Interval[merged.size()]);
    }
}
