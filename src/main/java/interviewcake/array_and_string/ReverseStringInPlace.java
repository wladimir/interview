package interviewcake.array_and_string;

/**
 * Problem:
 * - Given a list of string, reverse its order in place.
 * Example:
 * - Input: ["a", "b", "c", "d"]
 * Output: ["d", "c", "b", "a"]
 * Approach:
 * - Use two pointers approach to swap two values on both ends as we move toward
 * the middle.
 * Solution:
 * - Initialize the two pointers, one starts at the beginning and one starts at
 * the end of the list.
 * - While the start pointer does not meet the end pointer in the middle, keep
 * swapping these two values.
 * - Move the start pointer up and move the end pointer down.
 * Cost:
 * - O(n) time, O(1) space.
 */

public class ReverseStringInPlace {
    public char[] reverse(final char[] input) {
        if (input == null || input.length == 0) return input;

        int left = 0;
        int right = input.length - 1;
        while (left < right) {
            char temp = input[left];
            input[left] = input[right];
            input[right] = temp;

            left++;
            right--;
        }

        return input;
    }
}
