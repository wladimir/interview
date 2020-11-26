package interviewcake.greedy;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

public class ProductOfAllNumbersTest extends TestCase {
    public void testGetProductsOfAllIntsExceptAtIndex() {
        assertArrayEquals(
                new int[]{84, 12, 28, 21},
                new ProductOfAllNumbers().getProductsOfAllIntsExceptAtIndex(new int[]{1, 7, 3, 4})
        );
    }
}
