package Duc;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;

import org.junit.jupiter.api.Test;

import Pham.Advance7;

class Advance7Test {
	 @Test
	    public void testTinhThu_ValidDate() {
	        Advance7 advance = new Advance7();
	        assertEquals(Calendar.SUNDAY, advance.tinhThu(5, 4, 2020));
	        assertEquals(Calendar.MONDAY, advance.tinhThu(6, 4, 2020));
	        assertEquals(Calendar.TUESDAY, advance.tinhThu(7, 4, 2020));
	    }

	    @Test
	    public void testTinhThu_InvalidDate() {
	        Advance7 advance = new Advance7();
	        assertEquals(0, advance.tinhThu(30, 2, 2020)); 
	    }

	    @Test
	    public void testTinhThu_FutureDate() {
	        Advance7 advance = new Advance7();
	        assertEquals(0, advance.tinhThu(1, 1, 2100)); 
	    }

	    @Test
	    public void testTinhThu_CurrentDate() {
	        Advance7 advance = new Advance7();
	        java.time.LocalDate currentDate = java.time.LocalDate.now();
	        int expectedDayOfWeek = currentDate.getDayOfWeek().getValue();
	        assertEquals(expectedDayOfWeek, advance.tinhThu(currentDate.getDayOfMonth(), currentDate.getMonthValue(), currentDate.getYear()));
	    }

}
