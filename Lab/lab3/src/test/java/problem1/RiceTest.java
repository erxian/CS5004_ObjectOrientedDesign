package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RiceTest {
  private Rice dongbei;

  @Before
  public void setUp() throws Exception {
    dongbei = new Rice("dongbei rice", 32.0, 200);
  }

  @Test(expected = InvalidFoodQuantityException.class)
  public void invalidSetUp() throws InvalidFoodQuantityException {
    Rice hunan = new Rice("hunan rice", 12.1, 300);
  }
}