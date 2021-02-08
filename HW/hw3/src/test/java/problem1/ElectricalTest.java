package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElectricalTest {
  private Electrical fixLight;
  private Electrical updateLine;

  @Before
  public void setUp() throws Exception {
    fixLight = new Electrical("No.888", PropertySize.MEDIUM, false,
        6, true, 3);
    updateLine = new Electrical("No.666", PropertySize.LARGE, true,
        6, false, 2);
  }

  @Test
  public void getLicensedEmployeeNum() {
    assertEquals(3, fixLight.getLicensedEmployeeNum(), 0);
  }

  @Test
  public void isComplex() {
    assertEquals(true, fixLight.isComplex());
    assertEquals(false, updateLine.isComplex());
  }

  @Test
  public void setMinRequirementForAll() throws InvalidPropertyServiceException {
    Electrical atLeastOne = new Electrical("No.666", PropertySize.LARGE, true,
        6, false, 0);
    assertEquals(1, atLeastOne.getLicensedEmployeeNum(), 0);
  }

  @Test
  public void setMinRequirementForComplexSmall() throws InvalidPropertyServiceException {
    Electrical atLeastTwo = new Electrical("No.666", PropertySize.SMALL, true,
        6, true, 1);
    assertEquals(2, atLeastTwo.getLicensedEmployeeNum(), 0);
  }

  @Test
  public void setMinRequirementForComplexMedium() throws InvalidPropertyServiceException {
    Electrical atLeastTwo = new Electrical("No.666", PropertySize.MEDIUM, true,
        6, true, 1);
    assertEquals(2, atLeastTwo.getLicensedEmployeeNum(), 0);
  }

  @Test
  public void setMinRequirementForComplexLarge() throws InvalidPropertyServiceException {
    Electrical atLeastThree = new Electrical("No.666", PropertySize.LARGE, true,
        6, true, 2);
    assertEquals(3, atLeastThree.getLicensedEmployeeNum(), 0);
  }


  @Test (expected = InvalidPropertyServiceException.class)
  public void setMinRequirementForOverFour() throws InvalidPropertyServiceException {
    Electrical overFour = new Electrical("No.666", PropertySize.LARGE, true,
        6, true, 5);
  }

  @Test
  public void calculatePrice() {
    assertEquals(650, fixLight.calculatePrice(), 0.0);
  }
}