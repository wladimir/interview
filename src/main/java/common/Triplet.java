package common;

public class Triplet<T> {
    public final T a;
    public final T b;
    public final T c;

    public Triplet(final T a, final T b, final T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static <T> Triplet<T> of(final T a, final T b, final T c) {
        return new Triplet<>(a, b, c);
    }

    @Override
    public String toString() {
        return "Pair{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
}
