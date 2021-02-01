package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoubleRoomTest {
  private DoubleRoom twoBed;

  @Before
  public void setUp() throws Exception {
    twoBed = new DoubleRoom(99.00f, 0);
  }

  @Test
  public void getMaxOccupancy() {
    assertEquals(2, twoBed.getMaxOccupancy());
  }
}