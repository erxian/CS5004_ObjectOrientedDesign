package problem2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TripTest {
    private Trip tripA;
    private Trip tripB;

    @Before
    public void setUp() throws Exception {
        tripA = new Trip("gulangyu", "xmdaxue",
                new Time(9, 0, 0),
                new Time(15,30,10));
        tripB = new Trip("caotang", "ifs",
                new Time(10, 21, 40),
                new Time(10,0,0));
    }

    @Test
    public void getDuration() {
        assertEquals(tripA.getDuration().getHour(), 6);
        assertEquals(tripA.getDuration().getMinutes(), 30);
        assertEquals(tripA.getDuration().getSecond(), 10);
        assertEquals(tripB.getDuration().getHour(), 0);
        assertEquals(tripB.getDuration().getMinutes(), 0);
        assertEquals(tripB.getDuration().getSecond(), 0);
    }
}