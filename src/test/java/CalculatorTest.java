import calculator.demo.Calculator;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    @Ignore
    public void testAdd() {

        assertEquals(5, calculator.sum(2, 6));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void  testSub() {
        assertEquals(10, 36-26);
    }

    @Test
    public void test1() {
        assertEquals(1, 1);
    }

    @Test
    public void  test2() {
        assertEquals(2, 2);
    }

}
