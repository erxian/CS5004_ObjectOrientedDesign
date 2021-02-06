package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FarmerTest {
  private Farmer cowBoy;

  @Before
  public void setUp() throws Exception {
    cowBoy = new Farmer(50.50f, "lulu li", 45);
  }

  @Test
  public void getWealth() {
    assertEquals(50.50f, cowBoy.getWealth(),0.0);
  }

  @Test
  public void addWealth() {
    double addNum = 10.25f;
    cowBoy.addWealth(addNum);
    assertEquals(60.75f, cowBoy.getWealth(), 0.0);
  }

  @Test
  public void decreaseWealth() {
    double deNum = 20.00f;
    cowBoy.decreaseWealth(deNum);
    assertEquals(30.50f, cowBoy.getWealth(), 0.0);
  }
}