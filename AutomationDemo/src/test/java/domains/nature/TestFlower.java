package domains.nature;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFlower {

    Flower flower = new Flower("Hortensia", true, "blue");

    @Test
    public void checkFlowerName() {
        assertEquals(flower.getName(), "Hortensia");
    }

    @Test
    public void checkFljhowerName() {
        assertEquals(flower.getName(), "Hortensia");
    }


}
