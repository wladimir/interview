package grokking_the_coding_interview.two_pointers;

/**
 * Problem:
 * - Given an array of sorted numbers and a target sum, find a pair in the
 * array whose sum is equal to the given target.
 * Example:
 * - Input: []int{1, 2, 6, 8, 16, 26}, target=14
 * Output: []int{2, 3}
 * Explanation: 6 (index 2) + 8 (index 3) = 14
 * Approach:
 * - Have one pointer start at the beginning and one at the end of the array.
 * - At each step, see if the two pointers add up to the target sum and move
 * them toward each other accordingly.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class PairWithTargetSum {
    public int[] search(final int[] arr, final int targetSum) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == targetSum) return new int[]{left, right};

            if (sum < targetSum) left++;
            else right--;
        }

        return new int[]{-1, -1};
    }
}
