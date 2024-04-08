package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Sort1;

class Sort1Test {
	@Test
    public void testSortAsc_Number1IsGreaterThanNumber2() {
        Sort1 sorter = new Sort1();
        sorter.setNumber1(5);
        sorter.setNumber2(3);
        sorter.sortAsc();
        assertEquals(3, sorter.getNumber1());
        assertEquals(5, sorter.getNumber2());
    }

    @Test
    public void testSortAsc_Number1IsLessThanNumber2() {
        Sort1 sorter = new Sort1();
        sorter.setNumber1(2);
        sorter.setNumber2(7);
        sorter.sortAsc();
        assertEquals(2, sorter.getNumber1());
        assertEquals(7, sorter.getNumber2());
    }
	

}
