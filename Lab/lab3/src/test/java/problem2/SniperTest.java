package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SniperTest {
  private Sniper sam;

  @Before
  public void setUp() throws Exception {
    sam = new Sniper(66.0f, "sam wane", 22);
  }

  @Test
  public void getStamina() {
    assertEquals(66.0f, sam.getStamina(), 0.0);
  }

  @Test
  public void addStamina() {
    double addNum = 5;
    sam.addStamina(addNum);
    assertEquals(71.0f, sam.getStamina(), 0.0);
  }

  @Test
  public void removeStamina() {
    double deNum = 10;
    sam.removeStamina(deNum);
    assertEquals(56.0f, sam.getStamina(), 0.0);
  }
}