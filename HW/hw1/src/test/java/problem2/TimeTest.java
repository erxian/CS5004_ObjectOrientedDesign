package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TimeTest {
    private Time today;
    private Time tomorrow;
    private Time yesterday;

    @Before
    public void setUp() throws Exception {
        today = new Time(10, 30,45);
        tomorrow = new Time(15,-9,20);
        yesterday = new Time(24,58,61);
    }

    @Test
    public void getHour() {
        assertEquals(today.getHour(), 10);
        assertEquals(tomorrow.getHour(), 15);
        assertEquals(yesterday.getHour(), 0);
    }

    @Test
    public void getMinutes() {
        assertEquals(today.getMinutes(), 30);
        assertEquals(tomorrow.getMinutes(), 0);
        assertEquals(yesterday.getMinutes(), 58);
    }

    @Test
    public void getSecond() {
        assertEquals(today.getSecond(), 45);
        assertEquals(tomorrow.getSecond(), 20);
        assertEquals(yesterday.getSecond(), 0);
    }

    @Test
    public void setHour() {
        today.setHour(11);
        assertEquals(today.getHour(), 11);
        today.setHour(-1);
        assertEquals(today.getHour(), 0);
    }

    @Test
    public void setMinutes() {
        today.setMinutes(40);
        assertEquals(today.getMinutes(), 40);
        today.setMinutes(67);
        assertEquals(today.getMinutes(), 0);
    }

    @Test
    public void setSecond() {
        today.setSecond(50);
        assertEquals(today.getSecond(), 50);
        today.setSecond(-5);
        assertEquals(today.getSecond(), 0);
    }
}