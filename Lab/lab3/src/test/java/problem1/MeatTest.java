package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MeatTest {
  private Meat pork;

  @Before
  public void setUp() throws Exception {
    pork = new Meat("pig meat", 5.00, 50, 20210204, 20210218);
  }

  @Test (expected = InvalidFoodQuantityException.class)
  public void invalidSetUp() throws InvalidFoodQuantityException {
    Meat beef = new Meat("cattle meat", 12.1, 150, 20210204, 20210220);
  }

}