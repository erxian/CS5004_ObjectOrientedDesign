import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {
    private Person emilily;

    @Before
    public void setUp() throws Exception {
        emilily = new Person("Amelia", "Earhart");
    }

    @Test
    public void getName() {
        assertEquals(emilily.getName(), "Earhart Amelia");
    }
}