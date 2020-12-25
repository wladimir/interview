package grokking_the_coding_interview.two_pointers;

import java.util.Arrays;

/**
 * Problem:
 * - Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space..
 * Example:
 * - Input: []int{2, 3, 3, 3, 6, 9, 9}
 * Output: 4
 * Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
 * Approach:
 * - Have one pointer iterate the array and one placing non-duplicate number.
 * Cost:
 * - O(n) time, O(1) space.
 */
public class RemoveDuplicates {
    public int remove(final int[] arr) {
        int next = 1;

        System.out.println("before:" + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[next - 1])
                arr[next++] = arr[i];
        }

        System.out.println("after:" + Arrays.toString(arr));
        return next;
    }
}
