import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void HasAdd() {
        assertEquals(11, calculator.add(1, 10));
    }

    @Test
    public void HasSubtract() {
        assertEquals(-9, calculator.subtract(1, 10));
    }

    @Test
    public void HasMultiply() {
        assertEquals(10, calculator.multiply(1, 10));
    }

//    @Test
//    public void HasDivide() {
//        assertEquals(4.8, calculator.divide(2.4, 0.5), 0.01);
//    }


}
