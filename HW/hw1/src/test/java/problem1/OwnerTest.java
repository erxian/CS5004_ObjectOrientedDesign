package problem1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class OwnerTest {
    private Owner evelyn;
    private Owner michel;

    @Before
    public void setUp() throws Exception {
        evelyn = new Owner("evelyn", "xu", "8781498988");
        michel = new Owner("michel", "zhang", "10086");
    }

    @Test
    public void getName() {
        assertEquals(evelyn.getName(), "xu evelyn");
        assertEquals(michel.getName(), "zhang michel");
    }

    @Test
    public void getPhoneNum() {
        assertEquals(evelyn.getPhoneNum(), "8781498988");
        assertEquals(michel.getPhoneNum(), "Invalid Phone Number");
    }

    @Test
    public void validatePhone() {
        evelyn.validatePhone("1122334455");
        evelyn.validatePhone("10001");
    }
}