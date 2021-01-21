import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthorTest {
    private Author Emi;

    @Before
    public void setUp() throws Exception {
        Emi = new Author(new Person("Amelia", "Earhart"), "Amelia.Earhart@gmail.com", "malianwa Rd, yuhejiayuan");
    }

    @Test
    public void getName() throws Exception {
        assertEquals(Emi.getName(), "Earhart Amelia");
        //TestCase.fail("Not yet implemented");
    }

    @Test
    public void getEmail() throws Exception {
        assertEquals(Emi.getEmail(), "Amelia.Earhart@gmail.com");
        //TestCase.fail("Not yet implemented");
    }

    @Test
    public void getAddress() throws Exception {
        assertEquals(Emi.getAddress(), "malianwa Rd, yuhejiayuan");
        //TestCase.fail("Not yet implemented");
    }
}