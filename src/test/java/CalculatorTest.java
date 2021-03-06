import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        int addition = calculator.add(2, 3);
        assertEquals(5, addition);
    }

    @Test
    public void canSubtract(){
        int subtraction = calculator.subtract(3, 2);
        assertEquals(1, subtraction);
    }

    @Test
    public void canMultiply(){
        int multiplication = calculator.multiply(2, 3);
        assertEquals(6, multiplication);
    }

    @Test
    public void canDivide(){
        double division = calculator.divide(6, 2);
        assertEquals(3.0, division, 0.1);
    }

}
