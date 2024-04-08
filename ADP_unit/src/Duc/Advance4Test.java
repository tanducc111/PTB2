package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Advance4;

class Advance4Test {
	@Test
    public void testIsPrimeNumber_Prime() {
        Advance4 advance = new Advance4();
        assertTrue(advance.isPrimeNumber(2));
        assertTrue(advance.isPrimeNumber(3));
        assertTrue(advance.isPrimeNumber(5));
        assertTrue(advance.isPrimeNumber(7));
        assertTrue(advance.isPrimeNumber(11));
        assertTrue(advance.isPrimeNumber(13));
        assertTrue(advance.isPrimeNumber(17));
    }

    @Test
    public void testIsPrimeNumber_NonPrime() {
        Advance4 advance = new Advance4();
        assertFalse(advance.isPrimeNumber(1));
        assertFalse(advance.isPrimeNumber(4));
        assertFalse(advance.isPrimeNumber(6));
        assertFalse(advance.isPrimeNumber(8));
        assertFalse(advance.isPrimeNumber(9));
        assertFalse(advance.isPrimeNumber(10));
    }

    @Test
    public void testIsPrimeNumber_Negative() {
        Advance4 advance = new Advance4();
        assertFalse(advance.isPrimeNumber(-2));
        assertFalse(advance.isPrimeNumber(-3));
        assertFalse(advance.isPrimeNumber(-10));
    }
	

}
