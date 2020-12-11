package leetcode.array_and_string;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem:
 * - Given an array of integers, return indices of the two numbers such that they
 * add up to a specific target.
 * - You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * Example:
 * - Input: nums = []int{2, 5, 4}, target = 6
 * Output: [0, 2] since nums[0] + nums[2] = 2 + 4 = 6
 * Approach:
 * - Use a hash map to store the value and its index as we iterate through the
 * list.
 * - Within each iteration, look up the difference of target and the current
 * value to see if we have seen that number.
 * - Simply return two cached indices once that condition meets.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> cache = new HashMap<>();

        for (int i = 0; i < nums.length; i++) cache.put(nums[i], i);

        for (int i = 0; i < nums.length; i++) {
            int toFind = target - nums[i];
            if (cache.containsKey(toFind) && i != cache.get(toFind)) return new int[]{i, cache.get(toFind)};
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
