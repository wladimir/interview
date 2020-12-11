package leetcode.array_and_string;

/**
 * Problem:
 * - Given a sorted array of integers, return indices of the two numbers such
 * that they add up to a specific target.
 * Example:
 * - Input: nums = []int{2, 3, 4}, target = 6
 * Output: [0, 2] since nums[0] + nums[2] = 2 + 4 = 6
 * Approach
 * - Since the array is sorted, can use two-pointer approach that has one point
 * to the start of the list while the other point at the end and move the
 * toward each other.
 * Solution:
 * - Have one pointer point to the start of the list and the other point at the end.
 * - Iterate through the list and check their sum.
 * - If it is smaller than the target, increment the start pointer to make the
 * sum bigger little by little.
 * - Otherwise, decrement the end pointer to make the sum smaller.
 * - When the sum is equal to the target, we found the answer.
 * Cost:
 * - O(n) time, O(1) space.
 */

public class TwoSumSorted {
    public int[] twoSumSorted(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            final int sum = nums[start] + nums[end];
            if (sum > target) end--;
            else if (sum < target) start++;
            else return new int[]{start, end};
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
