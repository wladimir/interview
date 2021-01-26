package freecodecamp.dynamic_programming.tabulation;

import junit.framework.TestCase;

public class FibonacciTest extends TestCase {
    public void testFib() {
        assertEquals(
                21,
                new Fibonacci().fib(8)
        );
    }
}
