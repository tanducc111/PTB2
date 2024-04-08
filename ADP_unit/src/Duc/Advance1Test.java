package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Advance1;

class Advance1Test {

	@Test
	public void testUSCLN() {
        Advance1 advance = new Advance1();
        assertEquals(5, advance.USCLN(15, 10));

        assertEquals(8, advance.USCLN(24, 32));

        assertEquals(6, advance.USCLN(6, 6));
    }

    @Test
    public void testBSCNN() {
        Advance1 advance = new Advance1();
        assertEquals(30, advance.BSCNN(10, 15));

        assertEquals(24, advance.BSCNN(8, 12));
        
        assertEquals(6, advance.BSCNN(6, 6));
    }

}
