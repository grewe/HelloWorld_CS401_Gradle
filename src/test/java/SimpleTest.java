import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * Test Class containing simple tests
 */
public class SimpleTest {

    @Test
    public void test1() {
        System.out.println("Test 1 works");
    }


    @Test
    public void test2() {
        System.out.println("Test 2 fails"); //
        fail("Not implemented yet");
    }
}
