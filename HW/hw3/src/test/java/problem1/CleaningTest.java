package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CleaningTest {
  private Cleaning sophieHouse;
  private Cleaning evelyn;
  private Cleaning tomHouse;

  @Before
  public void setUp() throws Exception {
  sophieHouse = new Cleaning("No.10011", PropertySize.MEDIUM, false,
      7, 1);
  evelyn = new Cleaning("No.666", PropertySize.LARGE, true,
        9, 4);
  tomHouse = new Cleaning("No.770", PropertySize.SMALL, true,
        3, 0);
  }

  @Test
  public void getPetsFee() {
    assertEquals(0.05, sophieHouse.calculatePetsFee(sophieHouse.getPetsNum()), 0.00);
    assertEquals(0.07, evelyn.calculatePetsFee(evelyn.getPetsNum()), 0.0);
  }

  @Test
  public void getSmallServiceHour() {
    assertEquals(1, tomHouse.getServiceHour(tomHouse.propertySize), 0);
  }

  @Test
  public void getMediumServiceHour() {
    assertEquals(2, sophieHouse.getServiceHour(sophieHouse.propertySize), 0);
  }

  @Test
  public void getLargeServiceHour() {
    assertEquals(4, evelyn.getServiceHour(evelyn.propertySize), 0);
  }


  @Test
  public void isTenthService() {
    assertEquals(false, sophieHouse.isTenthService(sophieHouse.preServiceNum));
    assertEquals(true, evelyn.isTenthService(evelyn.preServiceNum));
  }

  @Test
  public void calculatePrice() {
    assertEquals(168, sophieHouse.calculatePrice(), 0.00);
    assertEquals(171.2, evelyn.calculatePrice(), 0.001);
    assertEquals(72, tomHouse.calculatePrice(), 0.0);
  }

}