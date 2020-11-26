package interviewcake.greedy;

import junit.framework.TestCase;

public class AppleStocksTest extends TestCase {
    public void testGetMaxProfit() {
        assertEquals(
                6,
                new AppleStocks().getMaxProfit(new int[]{10, 7, 5, 8, 11, 9})
        );
    }
}
