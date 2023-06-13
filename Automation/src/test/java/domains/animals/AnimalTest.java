package domains.animals;

import org.junit.Test;
import package1.MyEncryptor;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    MyEncryptor myEncryptor = new MyEncryptor(2);

        @Test
        public void checkCat() {
            assertEquals(myEncryptor.encrypt("CAT"), "ecv");
            assertEquals(System.getProperty("a"), "y");
    }

    @Test
    public void testVariables() {
        System.out.println(System.getProperty("#sctm_keywords"));
        System.out.println(System.getProperty("p1"));
        System.out.println(System.getProperty("param1"));
        System.out.println("aaaaaaaaaaa");
    }

    @Test
    public void showParams() {
        System.out.println(System.getProperty("#sctm_execdef_name"));
        System.out.println(System.getProperty("#sctm_execdef_id"));
        System.out.println(System.getProperty("#sctm_product"));
        System.out.println(System.getProperty("#sctm_version"));
        System.out.println(System.getProperty("#sctm_build"));
        System.out.println(System.getProperty("#sctm_keywords"));
        System.out.println(System.getProperty("#sctm_regular_execdef_run_id"));
        System.out.println(System.getProperty("#sctm_test_name"));
        System.out.println(System.getProperty("#sctm_test_id"));
        System.out.println(System.getProperty("#sctm_source_root_dir"));
        System.out.println(System.getProperty("#external_id"));
        System.out.println(System.getProperty("#sctm_data_driven_parent_test_name"));
        System.out.println(System.getProperty("#sctm_data_driven_parent_test_id"));
    }
}
