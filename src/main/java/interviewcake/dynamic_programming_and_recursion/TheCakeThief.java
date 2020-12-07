package interviewcake.dynamic_programming_and_recursion;

/**
 * Problem:
 * Write a method maxDuffelBagValue() that takes an array of cake type objects and a weight capacity,
 * and returns the maximum monetary value the duffel bag can hold.
 * Also known as the unbounded knapsack problem.
 * Approach:
 * We use a bottom-up ↴ approach to find the max value at our duffel bag's weightCapacity
 * by finding the max value at every capacity from 0 to weightCapacity.
 * Cost:
 * O(n*k) time, and O(k) space, where n is number of types of cake and k is the capacity of the duffel bag.
 */
public class TheCakeThief {
    public long maxDuffelBagValue(final CakeType[] cakeTypes, final int capacity) {
        final long[] maxValueAtCapacity = new long[capacity + 1];

        for (int c = 0; c <= capacity; c++) {
            long maxValue = 0;

            for (final CakeType cakeType : cakeTypes)
                if (cakeType.weight <= c) {
                    long maxValueUsingCake = cakeType.value + maxValueAtCapacity[c - cakeType.weight];
                    maxValue = Math.max(maxValue, maxValueUsingCake);
                }

            maxValueAtCapacity[c] = maxValue;
        }

        return maxValueAtCapacity[capacity];
    }

    public static class CakeType {
        final int weight;
        final int value;

        public CakeType(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
