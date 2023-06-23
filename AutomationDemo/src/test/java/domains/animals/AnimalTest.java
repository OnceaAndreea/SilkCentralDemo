package domains.animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    Cat cat = new Cat("asian", "Rita", 2, false);

    @Test
    public void checkCatName() {
        assertEquals("Rita", cat.getName());
    }

    @Test
    public void checkCatAge() {
        assertEquals(2, cat.getAge());
    }

    @Test
    public void checkIfCatVaccinated() {
        assertEquals(false, cat.isVaccinated());
    }

    @Test
    public void checkCatBreed() {
        assertEquals("malaesian", cat.getBreed());
    }

    @Test
    public void checkCatAgeAfterOneYear() {
        assertEquals(4, cat.getAge() + 1);
    }

    @Test
    public void checkCatBreed1() {
        assertEquals("malaesian", cat.getBreed());
    }

    @Test
    public void checkCatAgeAfterOneYear1() {
        assertEquals(4, cat.getAge() + 1);
    }

}
