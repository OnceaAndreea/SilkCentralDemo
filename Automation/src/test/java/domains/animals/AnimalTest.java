package domains.animals;

import org.junit.Test;
import package1.MyEncryptor;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    MyEncryptor myEncryptor = new MyEncryptor(2);

        @Test
        public void checkCat() {
            assertEquals(myEncryptor.encrypt("CAT"), "ecv");
    }
}
