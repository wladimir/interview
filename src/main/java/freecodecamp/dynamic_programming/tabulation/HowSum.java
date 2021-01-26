package freecodecamp.dynamic_programming.tabulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HowSum {
    // m - target, n - numbers.length
    // O(m^2*n) time, O(m^2) space
    public List<Integer> howSum(final int targetSum, final List<Integer> numbers) {
        final List<List<Integer>> table = new ArrayList<>(Collections.nCopies(targetSum + 1, null));
        table.set(0, new ArrayList<>());

        for (int i = 0; i <= targetSum; i++) {
            if (table.get(i) == null)
                continue;
            for (int num : numbers) {
                if (i + num > targetSum)
                    continue;
                final List<Integer> result = new ArrayList<>(table.get(i));
                result.add(num);
                table.set(i + num, result);
            }
        }

        return table.get(targetSum);
    }
}
