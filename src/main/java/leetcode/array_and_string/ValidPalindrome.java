package leetcode.array_and_string;

/**
 * Problem:
 * - Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * Example:
 * - Input: "A man, a plan, a canal: Panama"
 * Output: true
 * - Input: "race a car"
 * Output: false
 * Approach:
 * - Use two pointers approach that have one point to the start of the string and
 * the other point at the end.
 * - Move them toward each other and compare if they're the same characters while
 * skipping non-alphanumeric characters and ignoring cases.
 * Solution:
 * - Have a pointer point to the start of the string and the other point at the end.
 * - Make the string lower case.
 * - While the start one is less the end one, ignore non-alphanumeric characters
 * and move them toward each other.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        s = s.toLowerCase();

        while (start < end) {
            while (!Character.isLetterOrDigit(s.charAt(start))) start++;
            while (!Character.isLetterOrDigit(s.charAt(end))) end--;

            if (s.charAt(start) != s.charAt(end)) return false;

            start++;
            end--;
        }

        return true;
    }
}
