package Duc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Pham.SolveEquation;

class SolveEquationTest {
	@Test
    public void testLinearEquation_MultiRoots() {
        SolveEquation equation = new SolveEquation();
        equation.number1 = 0;
        equation.number2 = 0;
        assertEquals("Multi roots", equation.linearEquation());
    }

    @Test
    public void testLinearEquation_NoRoot() {
        SolveEquation equation = new SolveEquation();
        equation.number1 = 0;
        equation.number2 = 5; 
        assertEquals("No root", equation.linearEquation());
    }

    @Test
    public void testLinearEquation_OneRoot() {
        SolveEquation equation = new SolveEquation();
        equation.number1 = 2; 
        equation.number2 = 6; 
        assertEquals("One root", equation.linearEquation());
    }

}
