package grokking_the_coding_interview.sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem:
 * - Given a string, find the length of the longest substring which has no repeating characters.
 * Example:
 * - Input: "aabccbb"
 * Output: 3
 * Explanation: Longest substring which has no repeating characters.is "abc"
 * Approach:
 * - Similar to longest substring with k distinct characters, we can use a hashmap
 * to remember the last index of each character we have processed.
 * Cost:
 * - O(n) time, O(k) space where k is the number of characters in the map.
 */
public class NoRepeatSubstring {
    public int findLength(String str) {
        int start = 0;
        int length = 0;

        final Map<Character, Integer> positions = new HashMap<>();

        for (int end = 0; end < str.length(); end++) {
            final char right = str.charAt(end);

            if (positions.containsKey(right)) {
                start = positions.get(right) + 1;
            }

            positions.put(right, end);
            length = Math.max(length, end - start + 1);
        }

        return length;
    }
}
