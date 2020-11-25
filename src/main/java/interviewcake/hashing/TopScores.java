package interviewcake.hashing;

import java.util.Arrays;

/**
 * Problem:
 * - Given an unsorted list scores (integer) and a highest possible score
 * (integer), return a sorted list utilizing that fact.
 * Example:
 * - Input: []int{37, 89, 41, 65, 91, 53}, 100
 * Output: []int{91, 89, 65, 53, 41, 37}
 * Approach:
 * - Utilize the highest score to allocate a fix-sized list ahead of time where
 * where its indices represent the scores themselves and its values represent
 * how many time these scores appear in the list.
 * Solution:
 * - Utilize the highest score to allocate a fix-sized list ahead of time.
 * - Iterate through the unsorted list and populate the scores where indices
 * represent scores and values represent how many time the score appears.
 * - Iterate backward and add the score to the output list so that it is
 * sorted from highest to lowest.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class TopScores {
    public int[] sort(int[] input, int highestPossibleScore) {
        int[] scoreCounts = new int[highestPossibleScore + 1];
        Arrays.stream(input).forEach(i -> scoreCounts[i]++); // unordered score counts

        int[] sortedScores = new int[input.length];
        int index = 0;
        for (int i = scoreCounts.length - 1; i >= 0; i--)  // index == score
            for (int j = 0; j < scoreCounts[i]; j++)
                sortedScores[index++] = i;

        return sortedScores;
    }
}
