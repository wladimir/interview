package grokking_the_coding_interview.sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem:
 * - Given a string, find the length of the longest substring in it with no more
 * than k distinct characters.
 * Example:
 * - Input: string="araaci", k=1
 * Output: 2
 * Explanation: Longest substring with no more than 1 distinct characters is "aa".
 * - Input: string="araaci", k=2
 * Output: 4
 * Explanation: Longest substring with no more than 2 distinct characters is "araa".
 * - Input: string="araaci", k=3
 * Output: 5
 * Explanation: Longest substring with no more than 3 distinct characters is "araac".
 * Approach:
 * - Use a hashmap to remember the frequency of each character we have seen.
 * - Insert characters until we have k distinct characters in the map to be consider a
 * window.
 * - Shrink the window until there is no more k distinct characters in the map and keep
 * updating the maximum window length at each step.
 * Cost:
 * - O(n) time, O(k) space where k is the number of characters in the map.
 */
public class LongestSubstringKDistinct {
    public int findLength(final String str, final int k) {
        if (str == null || str.isEmpty() || str.length() < k) throw new IllegalArgumentException();

        final Map<Character, Integer> occurences = new HashMap<>();

        int length = 0;
        int start = 0;

        for (int end = 0; end < str.length(); end++) {
            occurences.compute(str.charAt(end), (key, value) -> value == null ? 1 : value + 1);

            while (occurences.size() > k) {
                char left = str.charAt(start);
                occurences.compute(left, (key, value) -> value - 1);
                if (occurences.get(left) == 0) occurences.remove(left);

                start++;
            }
            length = Math.max(length, end - start + 1);
        }

        return length;
    }
}
