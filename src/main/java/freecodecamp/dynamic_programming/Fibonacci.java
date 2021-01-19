package freecodecamp.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    // O(2^n) time and O(n) space
    public void dib(final long n) {
        if (n <= 1) return;
        dib(n - 1);
        dib(n - 1);
    }

    // O(2^n) time and O(n) space
    public void lib(final long n) {
        if (n <= 1) return;
        dib(n - 2);
        dib(n - 2);
    }

    private final Map<Long, Long> memo = new HashMap<>();

    // O(n) time, O(n) space
    public long fibonacciMemoized(final long n) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1;

        memo.put(n, fibonacciMemoized(n - 1) + fibonacciMemoized(n - 2));
        return memo.get(n);
    }
}
