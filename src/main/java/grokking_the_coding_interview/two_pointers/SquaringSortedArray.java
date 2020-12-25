package grokking_the_coding_interview.two_pointers;

import java.util.Arrays;

/**
 * Problem:
 * - Given a sorted array, create a new array containing squares of all the
 * number of the input array in the sorted order.
 * Assumption:
 * - The input can have negative numbers.
 * Example:
 * - Input: []int{-2, -1, 0, 1, 2}
 * Output: []int{0, 1, 1, 4, 4}
 * Approach:
 * - The difficult part is to generate the output array with squares in sorted order because we have negative numbers and their squares are positive.
 * - Have one pointer start at the beginning and one at the end and let them
 * move toward each other.
 * - At each step, whichever bigger will be added to the output array, from
 * right to left.
 * Cost:
 * - O(n) time, O(n) space.
 */
public class SquaringSortedArray {
    public int[] makeSquares(int[] arr) {
        int[] squares = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        int highestIndex = arr.length - 1;

        System.out.println("before:" + Arrays.toString(arr));
        while (left < right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                squares[highestIndex--] = leftSquare;
                left++;
            } else {
                squares[highestIndex--] = rightSquare;
                right--;
            }
        }

        System.out.println("after:" + Arrays.toString(squares));
        return squares;
    }
}
