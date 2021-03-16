package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SingleRoomTest {
  private SingleRoom room;

  @Before
  public void setUp() throws Exception {
    room = new SingleRoom(51.22f);
  }

  @Test
  public void getMaxOccupancy() {
    assertEquals(1, room.getMaxOccupancy());
  }
}