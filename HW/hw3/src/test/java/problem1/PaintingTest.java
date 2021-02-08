package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PaintingTest {
  private Painting smallHouse;
  private Painting largeHouse;

  @Before
  public void setUp() throws Exception {
    smallHouse = new Painting("No.10011", PropertySize.SMALL, false,
        7, 1);
    largeHouse = new Painting("No.666", PropertySize.LARGE, true,
        9, 4);
  }

  @Test
  public void calculatePrice() {
    assertEquals(1344, smallHouse.calculatePrice(), 0.0);
    assertEquals(1027.2, largeHouse.calculatePrice(), 0.01);
  }

  @Test
  public void getServiceHour() {
    assertEquals(16, smallHouse.getServiceHour(smallHouse.propertySize), 0);
    assertEquals(24, largeHouse.getServiceHour(largeHouse.propertySize), 0);
  }
}