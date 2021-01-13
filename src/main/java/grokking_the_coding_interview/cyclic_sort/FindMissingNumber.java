package grokking_the_coding_interview.cyclic_sort;

import common.util.Swap;

/**
 * Problem:
 * - Given an array containing n numbers taken from the range 1 to n. It can
 * have duplicates. Find all those missing numbers.
 * Example:
 * - Input: []int{2, 3, 1, 8, 2, 3, 5, 1}
 * Output: []int{4, 6, 7}
 * Approach:
 * - Similar to missing number problem, can rearrange the array using cyclic
 * sort.
 * - Those that do not have the correct indices are the missing ones.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class FindMissingNumber {
    public int findMissingNumber(final int[] nums) {
        int i = 0;

        while (i < nums.length)
            // if not equal to its index
            if (nums[i] < nums.length && nums[nums[i]] != nums[i]) Swap.swap(nums, i, nums[i]);
            else i++;

        for (int j = 0; j < nums.length; j++)
            if (nums[j] != j) return j;

        return -1;
    }
}
