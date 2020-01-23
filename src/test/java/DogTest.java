import org.junit.Test;

import static org.junit.Assert.*;


/**
 * DogTest is a JUnit class for performing Unit testing of the Dog class
 */
public class DogTest {

    /**
     * method to execute the getName getter method of the Dog class.
     */
    @Test
    public void getName() {

        Dog d = new Dog("buddy","lynne", 4, "jack russel");
        System.out.println("TestCase   DogTest.getName\n\n");
        assertEquals("buddy", d.getName());
    }

    /**
     * method to execute the setName setter method of the Dog class for setting name
     */
    @Test
    public void setName() {
        Dog d = new Dog("buddy","lynne", 4, "jack russel");
        System.out.println("TestCase   DogTest.setName\n\n");
        d.setName("fido");
        assertEquals("fido", d.getName());
    }
}