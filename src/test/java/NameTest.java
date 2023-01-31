import org.junit.Test;

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


}
