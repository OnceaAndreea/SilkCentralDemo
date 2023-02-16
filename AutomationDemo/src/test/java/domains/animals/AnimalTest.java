package domains.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}
