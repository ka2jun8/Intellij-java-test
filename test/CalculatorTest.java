import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void multiply() throws Exception {
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(2, 6);
        assertThat(actual, is(expected));
    }

    @Test
    public void divide() throws Exception {
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3, 2);
        assertThat(actual, is(expected));
    }

}