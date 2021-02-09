package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WindowCleaningTest {
  private WindowCleaning oneFloor;
  private WindowCleaning threeFloor;

  @Before
  public void setUp() throws Exception {
    oneFloor = new WindowCleaning("No.668", PropertySize.MEDIUM, false,
        5, 1);
    threeFloor = new WindowCleaning("No.774", PropertySize.LARGE, true,
        5, 3);
  }

  @Test (expected = InvalidPropertyServiceException.class)
  public void testInvalidFloorNum() throws InvalidPropertyServiceException {
    WindowCleaning tallHouse = new WindowCleaning("No.668",
        PropertySize.MEDIUM, false, 5, 5);
  }

  @Test
  public void getFloorNum() {
    assertEquals(1, oneFloor.getFloorNum(), 0);
  }

  @Test
  public void calculateFloorFee() {
    assertEquals(0, oneFloor.calculateFloorFee(oneFloor.getFloorNum()), 0.0);
    assertEquals(0.05, threeFloor.calculateFloorFee(threeFloor.getFloorNum()), 0.01);
  }

  @Test
  public void calculatePrice() {
    assertEquals(160, oneFloor.calculatePrice(), 0.0);
    assertEquals(302.4, threeFloor.calculatePrice(), 0.01);
  }

  @Test
  public void testEquals() throws InvalidPropertyServiceException {
    WindowCleaning copy = new WindowCleaning("No.668", PropertySize.MEDIUM, false,
        5, 1);
    assertTrue(oneFloor.equals(copy));
  }

  @Test
  public void testNotEquals() throws InvalidPropertyServiceException {
    WindowCleaning copy = new WindowCleaning("No.668", PropertySize.MEDIUM, false,
        5, 2);
    assertFalse(oneFloor.equals(copy));
  }

  @Test
  public void testEqualsFloor() throws InvalidPropertyServiceException {
    WindowCleaning copy = new WindowCleaning("No.555", PropertySize.SMALL, true,
        4, 1);
    assertFalse(oneFloor.equals(copy));
  }


  @Test
  public void testHashCode() throws InvalidPropertyServiceException {
    WindowCleaning copy = new WindowCleaning("No.668", PropertySize.MEDIUM, false,
        5, 1);
    assertTrue(oneFloor.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Specialist service info are {Address: No.668, Property Size: MEDIUM"
        + ", isMonthly: false, preServiceNum: 5, floorNum: 1}";
    assertEquals(expected, oneFloor.toString());
  }

}