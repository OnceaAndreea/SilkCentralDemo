package domains.jobs;

import org.junit.Assert;
import org.junit.Test;

public class TeacherTest {

    Teacher teacher = new Teacher("Jane Smith", "math", 35);

    @Test
    public void checkAge() {
        Assert.assertEquals(35, teacher.getAge());
    }
}
