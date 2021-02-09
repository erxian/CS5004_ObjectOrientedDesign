package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GardeningTest {
  private Gardening treeHouse;

  @Before
  public void setUp() throws Exception {
    treeHouse = new Gardening("No.112", PropertySize.MEDIUM,
        false, 5);
  }

  @Test
  public void calculatePrice() {
    assertEquals(180, treeHouse.calculatePrice(), 0.0);
  }

  @Test
  public void testEquals() throws InvalidPropertyServiceException {
    Gardening copy = new Gardening("No.112", PropertySize.MEDIUM,
        false, 5);
    assertTrue(treeHouse.equals(copy));
  }

  @Test
  public void testEqualsWithSelf() throws InvalidPropertyServiceException {
    assertTrue(treeHouse.equals(treeHouse));
  }

  @Test
  public void testEqualsWithNull() throws InvalidPropertyServiceException {
    assertFalse(treeHouse.equals(null));
  }

  @Test
  public void testEqualsWithOtherObject() throws InvalidPropertyServiceException {
    Cleaning other = new Cleaning("No.10011", PropertySize.MEDIUM, false,
        7, 1);
    assertFalse(treeHouse.equals(other));
  }

  @Test
  public void testHashCode() throws InvalidPropertyServiceException {
    Gardening copy = new Gardening("No.112", PropertySize.MEDIUM,
        false, 5);
    assertTrue(treeHouse.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Specialist service info are {Address: No.112, Property Size: MEDIUM"
        + ", isMonthly: false, preServiceNum: 5}";
    assertEquals(expected, treeHouse.toString());
  }

}