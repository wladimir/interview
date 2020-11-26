package interviewcake.greedy;

import java.util.Arrays;
import java.util.Random;

/**
 * Problem:
 * - Given a list of integers, shuffle its location in-place.
 * Example:
 * - Input: []int{1, 2, 3, 4, 5}
 * Output: []int{2, 1, 4, 3, 5}
 * Approach:
 * - Iterate through the list, swap current value with a value in a randomized
 * index that is between the current and last index.
 * Solution:
 * - Cache the last index value of the list.
 * - Iterate through the list, get a randomized index value between the
 * current index and the last index, then use it to swap the corresponding
 * values at these two indices.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class FisherYatesShuffle {
    private final Random random = new Random();

    public int[] shuffle(int[] input) {
        if (input == null || input.length < 2) return input;

        int end = input.length - 1;
        for (int i = 0; i < end; i++) {
            int randomIndex = random.nextInt(end - i) + i;

            if (i != randomIndex) {
                int temp = input[i];
                input[i] = input[randomIndex];
                input[randomIndex] = temp;
            }
        }

        System.err.println(Arrays.toString(input));
        return input;
    }
}
