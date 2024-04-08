package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Triangle;

class TriangleTest {
	@Test
    public void testMaxLength_FirstNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.number1 = 5;
        triangle.number2 = 3;
        triangle.number3 = 2;
        assertEquals(5, triangle.maxLength());
    }

    @Test
    public void testMaxLength_SecondNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.number1 = 3;
        triangle.number2 = 7;
        triangle.number3 = 2;
        assertEquals(7, triangle.maxLength());
    }

    @Test
    public void testMaxLength_ThirdNumberIsMax() {
        Triangle triangle = new Triangle();
        triangle.number1 = 3;
        triangle.number2 = 2;
        triangle.number3 = 9;
        assertEquals(9, triangle.maxLength());
    }

    @Test
    public void testMaxLength_InvalidInput() {
        Triangle triangle = new Triangle();
        triangle.number1 = 3;
        triangle.number2 = 2;
        triangle.number3 = -1;
        assertEquals(-1, triangle.maxLength());
    }

}
