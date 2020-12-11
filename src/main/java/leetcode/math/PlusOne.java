package leetcode.math;

/**
 * Problem:
 * - Given a number represented as an array of digits, plus one to the number.
 * Assumption:
 * - The input are non-negative.
 * - The digits are stored such that the most significant digit is at the head of the list.
 * - The number does not contain leading zeros.
 * Example:
 * - Input: []int{1, 2, 5}
 * Output: []int{1, 2, 6}
 * - Input: []int{1, 2, 9}
 * Output: []int{1, 3, 0}
 * - Input: []int{1, 9, 9}
 * Output: []int{2, 0, 0}
 * Solution:
 * - Iterate through the list from right to left and add 1 to the current digit accordingly.
 * - If the current digit is less than 9, add 1 and update it.
 * - Otherwise, set it to 0.
 * - If all the digits are 9, append an 0 in the end and update the first digit to 1.
 * Cost:
 * - O(n) time, O(1) space, where n is the length of the list.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        final int[] num = new int[digits.length + 1];
        num[0] = 1;
        return num;
    }
}
