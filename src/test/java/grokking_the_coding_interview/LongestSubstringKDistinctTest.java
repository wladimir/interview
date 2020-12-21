package grokking_the_coding_interview;

import junit.framework.TestCase;

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
public class LongestSubstringKDistinctTest extends TestCase {
    public void testFindLength() {
    }
}
