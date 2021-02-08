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
}