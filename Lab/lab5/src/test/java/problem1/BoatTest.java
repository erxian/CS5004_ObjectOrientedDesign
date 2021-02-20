package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoatTest {
  private Boat boat;

  @Before
  public void setUp() throws Exception {
    boat = new Boat("Queen", 50.0f, 70.0f);
  }

  @Test
  public void getId() {
    assertEquals("Queen", boat.getId());
  }
}