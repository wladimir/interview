package interviewcake.queues_and_stacks;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Problem:
 * - Given a string, determine if its brackets are properly nested.
 * Example:
 * - Input: "{[]()}"
 * Output: true
 * - Input: "{[(])}"
 * Output: false
 * - Input: "{[}"
 * Output: false
 * Approach:
 * - Use a stack to keep track of matching parenthesis as we iterate
 * through the string.
 * Solution:
 * - Iterate through the string, keep a stack to keep track of closing and
 * opening parenthesis.
 * - If we see an opener, push it to the stack.
 * - If we see an closer, pop from the stack if is the one for the opener at the
 * top of stack.
 * Cost:
 * - O(n) time and O(n) space, where n is the number of operations.
 */
public class BracketValidator {
    public boolean isValid(final String code) {
        final Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < code.length(); i++) {
            final char c = code.charAt(i);
            if (c == '(' || c == '[' || c == '{') stack.push(c);
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                final char last = stack.pop();
                if ((last == '(' && c != ')') || (last == '[' && c != ']') || (last == '{' && c != '}')) return false;
            }
        }

        System.err.println(stack);
        return stack.isEmpty();
    }
}
