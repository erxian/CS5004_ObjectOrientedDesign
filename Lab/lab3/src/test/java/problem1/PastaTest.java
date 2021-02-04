package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PastaTest {
  private Pasta emptyPasta;

  @Before
  public void setUp() throws Exception {
    emptyPasta = new Pasta("empty pasta", 15.6, 120);
  }

  @Test(expected = InvalidFoodQuantityException.class)
  public void invalidSetUp() throws InvalidFoodQuantityException {
    Pasta twisterPasta = new Pasta("twister pasta", 12.1, 274);
  }
}