package freecodecamp.dynamic_programming.memoization;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HowSum {
    // O(n^m * m) time, O(m) space
    public List<Integer> howSum(final int targetSum, final int[] numbers) {
        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        for (final int number : numbers) {
            final int remainder = targetSum - number;
            final List<Integer> result = howSum(remainder, numbers);
            if (result != null) {
                result.add(number);
                return result;
            }
        }

        return null;
    }

    private final Map<Integer, List<Integer>> memo = new HashMap<>();

    // O(n * m^2) time, O(m^2) space
    public List<Integer> howSumMemoized(final int targetSum, final int[] numbers) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);

        if (targetSum == 0) return new ArrayList<>();
        if (targetSum < 0) return null;

        for (final int number : numbers) {
            final int remainder = targetSum - number;
            final List<Integer> result = howSum(remainder, numbers);
            if (result != null) {
                result.add(number);
                memo.put(targetSum, result);
                return result;
            }
        }

        memo.put(targetSum, null);
        return null;
    }

    /**
     * Best sum is variation where we keep track of shortest result
     */
}
