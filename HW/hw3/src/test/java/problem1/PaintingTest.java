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

  @Test
  public void testEquals() throws InvalidPropertyServiceException {
    Painting copy = new Painting("No.10011", PropertySize.SMALL, false,
        7, 1);
    assertTrue(smallHouse.equals(copy));
  }

  @Test
  public void testNotEquals() throws InvalidPropertyServiceException {
    Painting copy = new Painting("No.10011", PropertySize.SMALL, false,
        7, 2);
    assertFalse(smallHouse.equals(copy));
  }

  @Test
  public void testEqualsPets() throws InvalidPropertyServiceException {
    Painting copy = new Painting("No.555", PropertySize.MEDIUM, true,
        4, 2);
    assertFalse(smallHouse.equals(copy));
  }


  @Test
  public void testHashCode() throws InvalidPropertyServiceException {
    Painting copy = new Painting("No.10011", PropertySize.SMALL, false,
        7, 1);
    assertTrue(smallHouse.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Specialist service info are {Address: No.10011, Property Size: SMALL"
        + ", isMonthly: false, preServiceNum: 7, petsNum: 1}";
    assertEquals(expected, smallHouse.toString());
  }

}