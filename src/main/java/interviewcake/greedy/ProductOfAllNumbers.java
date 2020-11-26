package interviewcake.greedy;

/**
 * Problem:
 * - Given a list of integers, return a corresponding list where every index
 * holds the product of every other values except the value in that index.
 * And, you can't use division!
 * Example:
 * - Input: []int{1, 7, 3, 4}
 * Output: []int{84, 12, 28, 21}
 * Approach:
 * - Iterate through the list and at each step, calculate the product of all
 * the integers before each index and the product of all the integers after
 * each index.
 * Solution:
 * - Iterate through the list from left to right and get the product of all
 * other numbers before their indices.
 * - Iterate through the list from right to left and get the product of all
 * other numbers after their indices.
 * Example walkthrough:
 * - After the first iteration, we end up with:
 * []int{1*1, 1*1, 1*7, 1*7*3} or []int{1, 1, 7, 21}
 * - After the second iteration, we end up with:
 * []int{1*4*3*7, 1*4*3, 7*4, 21*1} or []{84, 12, 28, 21}
 * Cost:
 * - O(n) time, O(n) space.
 */
public class ProductOfAllNumbers {
    public int[] getProductsOfAllIntsExceptAtIndex(int[] input) {
        if (input.length < 2) throw new IllegalArgumentException("Invalid size");

        final int[] result = new int[input.length];

        int start = 1;
        for (int i = 0; i < input.length; i++) {
            result[i] = start;
            start *= input[i];
        }

        start = 1;
        for (int i = input.length - 1; i >= 0; i--) {
            result[i] *= start;
            start *= input[i];
        }

        return result;
    }
}
