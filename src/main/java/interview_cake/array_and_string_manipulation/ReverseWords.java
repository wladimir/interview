package interview_cake.array_and_string_manipulation;

/**
 * Problem:
 * - Given a list of string that is made up of word but in reverse, return the
 * correct order in-place.
 * Example:
 * - Input: []char{"w", "o", "r", "l", "d", "", "h", "e", "l", "l", "o", "", "s", "a", "y"}
 * Output: []char{"s", "a", "y", "", "h", "e", "l", "l", "o", "", "w", "o", "r", "l", "d"}
 * Approach:
 * - Similar to reversing string, use the same idea to reverse all the characters
 * in the list first so that we could have a list of words in the right order, not
 * its characters.
 * - Iterate through the list again and reverse its characters.
 * Solution:
 * - Reverse all the characters to get a list of words in the right order using
 * same idea as reversing a string.
 * - Iterate through the list again the reverse its characters by first keeping
 * track of the start index for each word since they are separated by an empty
 * string.
 * - Once we fine an empty string, update the start word index and use the same
 * idea to reverse the characters order.
 * Cost:
 * - O(n) time, O(1) space.
 */

public class ReverseWords {
    public char[] reverseWords(final char[] message) {
        reverse(message, 0, message.length - 1);

        int start = 0;
        for (int i = 0; i <= message.length; i++) {
            if (i == message.length || message[i] == ' ') {
                reverse(message, start, i - 1);
                start = i + 1;
            }
        }

        return message;
    }

    public char[] reverse(final char[] input, int left, int right) {
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
