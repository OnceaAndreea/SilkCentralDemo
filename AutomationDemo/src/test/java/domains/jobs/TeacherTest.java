package domains.jobs;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {

    Teacher teacher = new Teacher("Jane Smith", "math", 35);

    @Test
    public void checkAge() {
        assertEquals(35, teacher.getAge());
    }

    @Test
    public void checkTeacherName() { assertEquals("Annae", teacher.getName());
    }

    @Test
    public void checkCurrentYear() {
        assertEquals(2023, 2023);
    }

}
