package grokking_the_coding_interview;

/**
 * Problem:
 * - Given an array of positive numbers and a positive number k, find the maximum
 * sum of any contiguous subarray of size k.
 * Example:
 * - Input: int{2, 1, 5, 1, 3, 2}, k=3
 * Output: 9
 * Explanation: Subarray with maximum sum is [5, 1, 3].
 * Approach:
 * - View each contiguous subarray as a sliding window of k elements.
 * - As we move to the next subarray, slide the window by one element to
 * reuse the sum from previous array and update the maximum sum.
 * Cost:
 * - O(n) time, O(1) space.
 */

public class MaxSubarray {
    public int findMaxSumSubArray(final int K, final int[] arr) {
        int max = 0;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            if (end >= K - 1) {
                max = Math.max(max, sum);
                sum -= arr[end];
                start++;
            }
        }

        return max;
    }
}
