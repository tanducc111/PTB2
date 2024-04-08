package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.MaxNumber1;

class MaxNumber1Test {

	@Test
    public void testMax3_FirstNumberIsMax() {
        assertEquals(5, MaxNumber1.max3(5, 3, 1));
    }

    @Test
    public void testMax3_SecondNumberIsMax() {
        assertEquals(7, MaxNumber1.max3(3, 7, 2));
    }

    @Test
    public void testMax3_ThirdNumberIsMax() {
        assertEquals(9, MaxNumber1.max3(4, 3, 9));
    }

}
