package grokking_the_coding_interview.sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem:
 * - Given an array of characters where each character represents a fruit tree,
 * you are given two baskets and your goal is to put maximum number of fruits
 * in each basket.
 * Constraints:
 * - Each basket can have only one type of fruit.
 * - You can start with any tree, but once you have started you can’t skip a tree.
 * You will pick one fruit from each tree until you cannot, i.e., you will stop
 * when you have to pick from a third fruit type.
 * Example:
 * - Input: fruits=['A', 'B', 'C', 'A', 'C']
 * Output: 3
 * Explanation: Can put 2 'C' in 1 basket and 1 'A' in other from
 * subarray ['C', 'A', 'C']
 * Approach:
 * - Similar to "longest substring with k distinct characters" with k=2.
 * Cost:
 * - O(n) time, O(k) space where k is the number of characters in the map.
 */
public class FruitsIntoBaskets {
    public int findLength(final char[] arr) {
        int start = 0;
        int length = 0;

        final Map<Character, Integer> counts = new HashMap<>();

        for (int end = 0; end < arr.length; end++) {
            counts.compute(arr[end], (k, v) -> v == null ? 1 : v + 1);

            while (counts.size() > 2) {
                counts.compute(arr[start], (k, v) -> v - 1);
                if (counts.get(arr[start]) == 0) counts.remove(arr[start]);

                start++;
            }

            length = Math.max(length, end - start + 1); // number of character occurences in map
        }

        return length;
    }
}
