package grokking_the_coding_interview.sliding_window;

/**
 * Problem:
 * - Given an array, find the average of all contiguous subarrays of size k.
 * Example:
 * - Input: []int{1, 3, 2, 6, -1, 4, 1, 8, 2}, k=5
 * Output: []int{2.2, 2.8, 2.4, 3.6, 2.8}
 * Approach:
 * - View each contiguous subarray as a sliding window of k elements.
 * - As we move to the next subarray, slide the window by one element to
 * reuse the sum from previous array.
 * Cost:
 * - O(n) time, O(k) space.
 */
public class AverageSubarray {
    public double[] findAverages(final int K, final int[] arr) {
        double[] result = new double[arr.length - K + 1];

        double sum = 0; // double for division below
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            // slide, if needed
            if (end >= K - 1) {
                result[start] = sum / K;
                sum -= arr[start];
                start++;
            }
        }

        return result;
    }
}
