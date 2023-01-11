import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CalculatorTest.class,
        ColourTest.class
})
public class SuiteClass {

    @Test
    public void testDouble() {

        Assert.assertEquals(10, 5*5);
    }
}
