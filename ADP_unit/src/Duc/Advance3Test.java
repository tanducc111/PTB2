package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.Advance3;

class Advance3Test {

	@Test
    public void testFibonacci_NegativeIndex() {
        Advance3 advance = new Advance3();
        assertEquals(-1, advance.fibonacci(-5));
    }

    @Test
    public void testFibonacci_ZeroIndex() {
        Advance3 advance = new Advance3();
        assertEquals(0, advance.fibonacci(0));
    }

    @Test
    public void testFibonacci_FirstTwoIndices() {
        Advance3 advance = new Advance3();
        assertEquals(0, advance.fibonacci(0));
        assertEquals(1, advance.fibonacci(1));
    }

    @Test
    public void testFibonacci_PositiveIndex() {
        Advance3 advance = new Advance3();
        assertEquals(1, advance.fibonacci(2));
        assertEquals(2, advance.fibonacci(3));
        assertEquals(3, advance.fibonacci(4));
        assertEquals(5, advance.fibonacci(5));
        assertEquals(8, advance.fibonacci(6));
    }

}
