package freecodecamp.dynamic_programming;

public class CanSum {
    // m - target sum
    // n - array length
    // O(n^m) time, O(m) space
    // time: height of m (assume -1 in array, so -1 in each step), each node branches n times
    public boolean canSum(final int targetSum, final int[] numbers) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (final int number : numbers) {
            final int remainder = targetSum - number;
            if (canSum(remainder, numbers)) return true;
        }

        return false;
    }
}
