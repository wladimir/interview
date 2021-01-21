package freecodecamp.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * Travelled on a m*n 2D grid, from top-left to bottom-right. You can travel only down or right.
 * <p>
 * gridTraveller(2, 3) -> 3
 * gridTraveller(1, 1) -> 1
 * gridTraveller(0, 1) -> 0
 * gridTraveller(1, 0) -> 0
 * gridTraveller(n, 0) -> 0
 * gridTraveller(0, 0) -> 0
 * <p>
 * visualize as BT where nodes are coordinates
 * <p>
 * O(2^m+n) time, O(m+n) space
 */
public class GridTraveller {
    public long gridTraveller(final int m, final int n) {
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;

        return gridTraveller(m - 1, n) + gridTraveller(m, n - 1);
    }

    private final Map<String, Long> memo = new HashMap<>();

    public long gridTravellerMemoized(final int m, final int n) {
        final String key = m + "," + n;
        if (memo.containsKey(key)) return memo.get(key);
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;

        memo.put(key, gridTravellerMemoized(m - 1, n) + gridTravellerMemoized(m, n - 1));
        return memo.get(key);
    }
}
