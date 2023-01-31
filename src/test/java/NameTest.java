import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class NameTest {

    @Test
    public void testComposedGirlName() {
        assertEquals("Ana - Maria", "Ana" + " - " + "Maria");
    }

    @Test
    public void testComposedBoyName() {
        assertEquals("Andrei - Daniel", "Andrei" + " - " + "Daniel");
    }

    @Test
    public void testUpperCase() {
        assertEquals("ANDREI", "Andrei".toUpperCase(Locale.ROOT));
    }


}
