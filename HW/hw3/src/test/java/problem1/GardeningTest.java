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
}