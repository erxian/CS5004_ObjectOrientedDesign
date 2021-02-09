package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlumbingTest {
  private Plumbing waterHeater;

  @Before
  public void setUp() throws Exception {
    waterHeater = new Plumbing("No.888", PropertySize.MEDIUM, false,
        6, true, 5);
  }

  @Test
  public void calculatePrice() {
    assertEquals(1020, waterHeater.calculatePrice(),0.0);
  }

  @Test
  public void testEquals() throws InvalidPropertyServiceException {
    Plumbing copy = new Plumbing("No.888", PropertySize.MEDIUM, false,
        6, true, 5);
    assertTrue(waterHeater.equals(copy));
  }

  @Test
  public void testHashCode() throws InvalidPropertyServiceException {
    Plumbing copy = new Plumbing("No.888", PropertySize.MEDIUM, false,
        6, true, 5);
    assertTrue(waterHeater.hashCode() == copy.hashCode());
  }

  @Test
  public void testToString() {
    String expected = "Specialist service info are {Address: No.888, Property Size: MEDIUM"
        + ", isMonthly: false, preServiceNum: 6, isComplex: true, licensedEmployeeNum: 5}";
    assertEquals(expected, waterHeater.toString());
  }

}