package manyPP.many3.manyP.many5.domains.jobs;

import org.junit.Test;
import package1.MyEncryptor;

import static org.junit.Assert.assertEquals;

public class TeacherATest {

    MyEncryptor myEncryptor = new MyEncryptor(27);
    MyEncryptor myEncryptor1 = new MyEncryptor(1);
    @Test
    public void checkDog() {
        assertEquals(myEncryptor.encrypt("dOg"), myEncryptor1.encrypt("dOg"));
    }
}
