package problem3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person emilily;

    @Before
    public void setUp() throws Exception {
        emilily = new Person("Amelia", "Earhart");
    }

    @Test
    public void getFirstName() {
        assertEquals(emilily.getFirstName(), "Amelia");
    }

    @Test
    public void getLastName() {
        assertEquals(emilily.getLastName(), "Earhart");
    }
}