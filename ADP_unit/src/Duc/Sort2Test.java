package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Sort2;

class Sort2Test {
	@Test
	public void testSortDesc_Number1IsGreaterThanNumber2() {
		Sort2 sorter = new Sort2(5, 3);
		sorter.sortDesc();
		assertEquals(5, sorter.getNumber1());
		assertEquals(3, sorter.getNumber2());
	}

	@Test
	public void testSortDesc_Number1IsLessThanNumber2() {
		Sort2 sorter = new Sort2(2, 7);
		sorter.sortDesc();
		assertEquals(7, sorter.getNumber1());
		assertEquals(2, sorter.getNumber2());
	}

}
