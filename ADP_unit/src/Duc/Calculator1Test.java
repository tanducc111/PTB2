package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Calculator1;

class Calculator1Test {

	Calculator1 calculator = new Calculator1();

    @Test
    public void testAdd_ResultValue() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testAdd_LargerThanMaxInt() {
    	assertEquals(3000000000.0, calculator.add(2000000000, 1000000000));
    }

    @Test
    public void testAdd_SmallerThanMinInt() {
    	assertEquals(-3000000000.0, calculator.add(-2000000000, -1000000000));
    }

}
