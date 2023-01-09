import calculator.demo.Calculator;
import org.junit.Test;
import org.junit.Assert;

public class ColourTest {

    Calculator calculator = new Calculator();

    @Test
    public void testBloodColour() {
        Assert.assertEquals("red", calculator.getBloodColour());
    }

    @Test
    public void testSunColour() {
        Assert.assertEquals("yellow", calculator.getBloodColour());
    }

}
