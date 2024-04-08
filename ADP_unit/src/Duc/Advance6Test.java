package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Advance6;

class Advance6Test {
	@Test
    public void testTinhTuoi_ValidDate() {
        Advance6 advance = new Advance6();
        assertEquals(21, advance.tinhTuoi(12, 1, 1999));
    }

    @Test
    public void testTinhTuoi_CurrentDate() {
        Advance6 advance = new Advance6();
        int currentYear = java.time.LocalDate.now().getYear();
        assertEquals(0, advance.tinhTuoi(1, 1, currentYear)); 
    }

    @Test
    public void testTinhTuoi_FutureDate() {
        Advance6 advance = new Advance6();
        assertEquals(-1, advance.tinhTuoi(1, 1, 2024)); 
    }


}
