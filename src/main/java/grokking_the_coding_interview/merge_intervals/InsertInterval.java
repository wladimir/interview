package grokking_the_coding_interview.merge_intervals;

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
}
