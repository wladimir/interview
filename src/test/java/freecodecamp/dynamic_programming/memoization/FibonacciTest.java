package freecodecamp.dynamic_programming.memoization;

import junit.framework.TestCase;

public class FibonacciTest extends TestCase {
    public void testFibonacciMemoized() {
        assertEquals(
                12586269025L,
                new Fibonacci().fibonacciMemoized(50)
        );
    }
}
