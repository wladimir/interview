package grokking_the_coding_interview.cyclic_sort;

import common.util.Swap;

/**
 * Problem:
 * - Given an array containing n+1 numbers taken from the range 1 to n. It has
 * only one duplicate number but can be repeated over time. Find that one.
 * Example:
 * - Input: []int{1, 4, 4, 3, 2}
 * Output: 4
 * Approach:
 * - Similar to missing number problem, can place each number on its correct
 * index.
 * - If while swapping the number with its index both the numbers being swapped
 * are same, we have found the duplicate.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class FindDuplicateNumber {
    public int findNumber(final int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // skip self
            if (nums[i] != i + 1) {
                int j = nums[i] - 1;
                if (nums[i] != nums[j]) Swap.swap(nums, i, j);
                else return nums[i];
            } else i++;

        }
        return -1;
    }
}
