package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Advance5;

class Advance5Test {
	@Test
    public void testKiemTraDoiXung_True() {
        Advance5 advance = new Advance5();
        assertTrue(advance.kiemTraDoiXung(12121));
        assertTrue(advance.kiemTraDoiXung(12321));
        assertTrue(advance.kiemTraDoiXung(1234321));
    }

    @Test
    public void testKiemTraDoiXung_False() {
        Advance5 advance = new Advance5();
        assertFalse(advance.kiemTraDoiXung(112));
        assertFalse(advance.kiemTraDoiXung(12345));
        assertFalse(advance.kiemTraDoiXung(123456));
    }

    @Test
    public void testKiemTraDoiXung_SingleDigit() {
        Advance5 advance = new Advance5();
        assertTrue(advance.kiemTraDoiXung(1));
        assertTrue(advance.kiemTraDoiXung(9));
    }

}
