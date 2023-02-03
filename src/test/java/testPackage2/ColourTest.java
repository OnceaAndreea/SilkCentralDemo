package testPackage2;

import calculator.demo.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColourTest {
    Calculator calculator = new Calculator();

    @Test
    public void testSkyColour() {
        assertEquals("blue", calculator.getSkyColour());
    }

}
