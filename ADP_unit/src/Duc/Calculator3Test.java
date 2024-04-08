package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Calculator3;

class Calculator3Test {

	@Test
    public void testMul_ResultValue() {
        Calculator3 calculator = new Calculator3(5, 3);
        assertEquals(15, calculator.mul());
    }

    @Test
    public void testMul_LargerThanMaxInt() {
        Calculator3 calculator = new Calculator3(Integer.MAX_VALUE, 2);
        assertThrows(ArithmeticException.class, calculator::mul);
    }

    @Test
    public void testMul_SmallerThanMinInt() {
        Calculator3 calculator = new Calculator3(Integer.MIN_VALUE, -1);
        assertThrows(ArithmeticException.class, calculator::mul);
    }

}
