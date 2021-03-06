package interviewcake.array_and_string;

import common.Triplet;
import junit.framework.TestCase;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertArrayEquals;

public class MergeSortedArraysTest extends TestCase {
    public void testMerge() {
        final List<Triplet<int[]>> result = asList(
                Triplet.of(
                        new int[]{},
                        new int[]{1},
                        new int[]{1}
                ),
                Triplet.of(
                        new int[]{1, 3, 5},
                        new int[]{2, 4, 6},
                        new int[]{1, 2, 3, 4, 5, 6}
                ),
                Triplet.of(
                        new int[]{1, 2, 3, 4, 5},
                        new int[]{6},
                        new int[]{1, 2, 3, 4, 5, 6}
                )
        );
        result.forEach(t -> assertArrayEquals(t.c, new MergeSortedArrays().merge(t.a, t.b)));
    }
}
