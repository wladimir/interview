package interviewcake.queues_and_stacks;

/**
 * Problem:
 * - Given a sentence as string, and the position of an opening parenthesis
 * position, find the matching closing one position.
 * Example:
 * - Input: "I ((like) (nesting) parenthesis)", opening parenthesis position = 2
 * Output: 31, because the matching parenthesis of the one in position 2 is at
 * index 31.
 * Approach:
 * - Iterate through the string and keep a count of matching parenthesis at each
 * step.
 * Solution:
 * - Return -1 if the string is empty or the opening parenthesis position is
 * larger than the string size.
 * - Iterate through the string, starting at the opening parenthesis position and
 * keep a count of it.
 * - Increase the count as we meet the opening parenthesis and decrement it as we
 * meet the closing parenthesis.
 * - When the count if 0, it is the matching end.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class ParenthesisMatching {
    public int getClosingParen(final String sentence, final int openingParenIndex) {
        int count = 0;

        for (int i = openingParenIndex + 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '(') count++;
            else if (sentence.charAt(i) == ')') {
                if (count == 0) return i;
                count--;
            }
            System.err.println(count);
        }

        return -1;
    }

    public static void main(String[] s) {
        new ParenthesisMatching().getClosingParen("(())", 0);
    }
}
