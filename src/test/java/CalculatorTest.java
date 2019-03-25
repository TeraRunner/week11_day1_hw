import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator( 4, 2);
    }

    @Test
    public void getNumber() {
        assertEquals(4, calculator.getNumber1());
        assertEquals(2, calculator.getNumber2());
    }

    @Test
    public void isAdding() {
        assertEquals(6, calculator.add(calculator.number1, calculator.number2));
    }

    @Test
    public void isSubstracting() {
        assertEquals(2, calculator.subtract(calculator.number1, calculator.number2));
    }

    @Test
    public void isMultiplying() {
        assertEquals(8, calculator.multiply(calculator.number1, calculator.number2));
    }

    @Test
    public void isdividing() {
        assertEquals(2, calculator.divide(calculator.number1, calculator.number2));
    }

}
