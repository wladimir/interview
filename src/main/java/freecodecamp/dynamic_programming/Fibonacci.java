package freecodecamp.dynamic_programming;

public class Fibonacci {
    // O (2^n) time and O(n) space
    public void dib(final int n) {
        if (n <= 1) return;
        dib(n - 1);
        dib(n - 1);
    }

    // O (2^n) time and O(n) space
    public void lib(final int n) {
        if (n <= 1) return;
        dib(n - 2);
        dib(n - 2);
    }
}
