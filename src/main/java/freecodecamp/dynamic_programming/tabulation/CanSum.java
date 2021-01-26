package freecodecamp.dynamic_programming.tabulation;

import java.util.List;

public class CanSum {
    // O(m*n) time, O(m) time
    public boolean canSum(final int targetSum, final List<Integer> numbers) {
        final boolean[] table = new boolean[targetSum + 1];
        table[0] = true;

        for (int i = 0; i <= targetSum; i++)
            if (table[i] == true)  // look ahead
                for (final int num : numbers)
                    if (i + num <= targetSum)
                        table[i + num] = true;

        return table[targetSum];
    }
}
