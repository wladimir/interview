package common;

public class Pair<T> {
    public final T a;
    public final T b;

    public Pair(final T a, final T b) {
        this.a = a;
        this.b = b;
    }

    public static <T> Pair<T> of(final T a, final T b) {
        return new Pair<>(a, b);
    }

    @Override
    public String toString() {
        return "Pair{" + "a=" + a + ", b=" + b + '}';
    }
}
