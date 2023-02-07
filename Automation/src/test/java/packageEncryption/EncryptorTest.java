package packageEncryption;

import org.junit.Test;
import package1.MyEncryptor;
import static org.junit.Assert.assertEquals;

public class EncryptorTest {

    MyEncryptor myEncryptor = new MyEncryptor(1);

    @Test
    public void checkZebra() {
        assertEquals(myEncryptor.encrypt("Zebra"), "afcsb");
    }

}
