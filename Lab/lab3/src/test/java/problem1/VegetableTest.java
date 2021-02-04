package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VegetableTest {
  private Vegetable potato;

  @Before
  public void setUp() throws Exception {
    potato = new Vegetable("potato", 0.5, 90, 20210224, 20210210);
  }

  @Test(expected = InvalidFoodQuantityException.class)
  public void invalidSetUp() throws InvalidFoodQuantityException {
    Vegetable mushroom = new Vegetable("mushroom", 12.1, 150, 20210204, 20210220);
  }
}