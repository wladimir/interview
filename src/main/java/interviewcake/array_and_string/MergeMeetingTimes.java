package interviewcake.array_and_string;

import java.util.*;

/**
 * Problem:
 * - Given a list of unsorted, independent meetings, returns a list of a merged
 * one.
 * Example:
 * - Input: [[1, 2], [2, 3], [4, 5]]
 * Output: [[1,3], [4, 5]]
 * - Input: [[1, 5], [2, 3]]
 * Output: [[1, 5]]
 * Approach:
 * - Sort the list in ascending order so that meetings that might need to be
 * merged are next to each other.
 * - Can merge two meetings together if the first one's end time is greater or
 * or equal than the second one's start time.
 * Solution:
 * - Sort the list in ascending order.
 * - Create a new list of merged meetings and consider the first meeting in the
 * original list to be the last merged one.
 * - Iterate through the original list and verify if the last merged meeting's
 * end time is greater or equal than the current meeting's start time.
 * - If it is true, merge them using the last merged meeting's start time
 * and the larger one's end time.
 * Cost:
 * - O(nlogn) time, O(n) space.
 * - Because we sort all meeting first, the runtime is O(nlogn). We create a new
 * list of merged meeting times, so the space cost is O(n).
 */
public class MergeMeetingTimes {
    public List<Meeting> mergeMeetings(final List<Meeting> meetings) {
        final List<Meeting> merged = new ArrayList<>();
        if (meetings == null || meetings.isEmpty()) return meetings;

        meetings.sort(Comparator.comparingInt(a -> a.start));

        merged.add(meetings.get(0));
        for (Meeting meeting : meetings) {
            final Meeting last = merged.get(merged.size() - 1);

            // if the current meeting overlaps with the last merged meeting, use the
            // later end time of the two
            if (meeting.start <= last.end) last.end = Math.max(last.end, meeting.end);
            else merged.add(meeting);
        }

        return merged;
    }

    public static class Meeting {
        public Meeting(final int start, final int end) {
            this.start = start;
            this.end = end;
        }

        public int start, end;

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final Meeting meeting = (Meeting) o;
            return start == meeting.start && end == meeting.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }

        @Override
        public String toString() {
            return "Meeting{" + "start=" + start + ", end=" + end + '}';
        }
    }
}
