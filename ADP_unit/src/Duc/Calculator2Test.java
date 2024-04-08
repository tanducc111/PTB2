package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Calculator2;

class Calculator2Test {
	Calculator2 calculator = new Calculator2();

    @Test
    public void testSub_ResultValue() {
        calculator.number1 = 5;
        calculator.number2 = 3;
        calculator.sub();
        assertEquals(2, calculator.result);
    }

    @Test
    public void testSub_LargerThanMaxInt() {
        calculator.number1 = Integer.MAX_VALUE;
        calculator.number2 = -1;
        assertThrows(ArithmeticException.class, () -> {
            calculator.sub();
        });
    }

    @Test
    public void testSub_SmallerThanMinInt() {
        calculator.number1 = Integer.MIN_VALUE;
        calculator.number2 = 1;
        assertThrows(ArithmeticException.class, () -> {
            calculator.sub();
        });
    }
}
