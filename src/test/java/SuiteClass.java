import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testPackage.ColourTest;

import static org.junit.Assert.assertEquals;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        CalculatorTest.class,
        ColourTest.class
})
//@Suite
//@SelectClasses({CalculatorTest.class, testPackage.ColourTest.class})
public class SuiteClass {

    @Test
    public void testDouble() {

        assertEquals(25, 5*5);
    }
}
