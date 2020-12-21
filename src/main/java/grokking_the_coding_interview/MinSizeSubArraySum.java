package grokking_the_coding_interview;

/**
 * Problem:
 * - Given an array of positive numbers and a positive number s, find the length
 * of the smallest contiguous subarray whose sum is greater than or equal to s.
 * Example:
 * - Input: array=int{2, 1, 5, 2, 3, 2}, s=7
 * Output: 2
 * Explanation: Smallest subarray with a sum great than or equal to 7 is [5, 2]
 * with length=2.
 * Approach:
 * - The difference between the previous problem and this one is that the size of
 * the sliding window is not fixed.
 * - Can still use the similar strategy to add up elements until their sum is greater
 * than equal to s and view them as our sliding window.
 * - Shrink the window until the window's sum is smaller than s again while keep
 * updating the minimum length.
 * Cost:
 * - O(n) time, O(1) space.
 */

public class MinSizeSubArraySum {
    public int findMinSubArray(final int S, final int[] arr) {
        int length = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum >= S) {
                length = Math.min(length, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        return length;
    }
}
