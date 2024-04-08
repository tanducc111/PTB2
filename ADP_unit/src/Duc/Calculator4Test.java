package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Calculator4;

class Calculator4Test {
	@Test
    public void testDiv_ResultValue() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(10);
        calculator.setNumber2(2);
        assertEquals(5, calculator.div());
    }

    @Test
    public void testDiv_DivisionByZero() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(5);
        calculator.setNumber2(0);
        assertThrows(ArithmeticException.class, calculator::div);
    }

    @Test
    public void testDiv_ReturnFloatType() {
        Calculator4 calculator = new Calculator4();
        calculator.setNumber1(5);
        calculator.setNumber2(2);
        assertEquals(2.5, calculator.div());
    }

}
