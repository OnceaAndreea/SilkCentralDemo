import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameTest {

    @Test
    public void testComposedName() {
        assertEquals("Ana - Maria", "Ana" + " - " + "Maria");
    }


}
