package common.util;

public class Swap {
    public static void swap(final int[] arr, final int i, final int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
