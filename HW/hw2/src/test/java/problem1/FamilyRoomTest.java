package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FamilyRoomTest {
  private FamilyRoom family;

  @Before
  public void setUp() throws Exception {
    family = new FamilyRoom(200.01f);
  }

  @Test
  public void getMaxOccupancy() {
    assertEquals(4, family.getMaxOccupancy());
  }
}