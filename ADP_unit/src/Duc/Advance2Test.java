package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Advance2;

class Advance2Test {

	@Test
    public void testSum() {
        Advance2 advance = new Advance2();
        assertEquals(23, advance.sum(5765));
        assertEquals(5, advance.sum(5));
        assertEquals(0, advance.sum(0));
	}

}
