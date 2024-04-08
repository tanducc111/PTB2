package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.MaxNumber2;

class MaxNumber2Test {
	@Test
    public void testMax2_FirstNumberIsMax() {
        MaxNumber2 maxNumber = new MaxNumber2();
        assertEquals(5, maxNumber.max2(5, 3));
    }

    @Test
    public void testMax2_SecondNumberIsMax() {
        MaxNumber2 maxNumber = new MaxNumber2();
        assertEquals(7, maxNumber.max2(3, 7));
    }
	

}
