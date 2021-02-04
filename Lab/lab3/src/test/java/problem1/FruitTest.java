package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FruitTest {
  private Fruit banana;

  @Before
  public void setUp() throws Exception {
    banana = new Fruit("banana", 8.5, 70, 20210204, 20210208);
  }

  @Test(expected = InvalidFoodQuantityException.class)
  public void invalidSetUp() throws InvalidFoodQuantityException {
    Fruit apple = new Fruit("apple", 12.1, 150, 20210204, 20210220);
  }
}