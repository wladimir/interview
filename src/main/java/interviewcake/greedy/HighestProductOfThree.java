package interviewcake.greedy;

/**
 * Problem:
 * - Given a list of integers, return the highest product of three numbers.
 * Example:
 * - Input: []int{-10, -10, 1, 3, 2}
 * Output: 300, because -10.-10.3 gives the highest product
 * Approach:
 * - Use a greedy approach to keep track of the current highest, current lowest,
 * highest of three, highest of two and lowest of two for every value as we
 * iterate through the list.
 * Solution:
 * - Initialize a highest number, a lowest number, a highest of two numbers,
 * a lowest of two numbers, and a highest of three numbers from the first
 * 2-3 numbers in the list.
 * - Iterate through the list and update each value in accordingly.
 * - Make sure to update these in the right order, in which the highest product
 * of three must be calculated first using the highest and lowest product of
 * two, then the highest product of two, lowest product of two, current highest
 * and current lowest.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class HighestProductOfThree {
    public int highestProductOf3(final int[] input) {
        if (input.length < 3) throw new IllegalArgumentException("Invalid size");

        int highest = Math.max(input[0], input[1]);
        int lowest = Math.min(input[0], input[1]);

        // only 1 option
        int highest2 = input[0] * input[1];
        int lowest2 = input[0] * input[1];
        int highest3 = input[0] * input[1] * input[2];

        for (int i = 2; i < input.length; i++) {
            int current = input[i];

            highest3 = Math.max(highest3, Math.max(highest2 * current, lowest2 * current));
            highest2 = Math.max(highest2, Math.max(highest * current, lowest * current));
            lowest2 = Math.max(highest2, Math.min(highest * current, lowest * current));
            highest = Math.max(highest, current);
            lowest = Math.min(lowest, current);
        }

        return highest3;
    }
}
