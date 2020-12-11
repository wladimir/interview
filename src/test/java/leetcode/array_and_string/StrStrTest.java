package leetcode.array_and_string;

import junit.framework.TestCase;

public class StrStrTest extends TestCase {
    public void testStrStr() {
        assertEquals(0, new StrStr().strStr("", ""));
        assertEquals(-1, new StrStr().strStr("abc", "d"));
        assertEquals(5, new StrStr().strStr("aabbccdd", "cd"));

        assertEquals(0, new StrStr().strStr2("", ""));
        assertEquals(-1, new StrStr().strStr2("abc", "d"));
        assertEquals(5, new StrStr().strStr2("aabbccdd", "cd"));
    }
}
