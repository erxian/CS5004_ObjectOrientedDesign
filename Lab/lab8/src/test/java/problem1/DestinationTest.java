package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DestinationTest {
  private Destination destination;

  @Before
  public void setUp() throws Exception {
    destination = new Destination("Boston", "US", "NZ9001", 1002.0f);
  }

  @Test
  public void getDestinationName() {
    assertEquals("Boston", destination.getDestinationName());
  }

  @Test
  public void getCountry() {
    assertEquals("US", destination.getCountry());
  }

  @Test
  public void getAirportCode() {
    assertEquals("NZ9001", destination.getAirportCode());
  }

  @Test
  public void getDistanceFromSeattle() {
    assertTrue(destination.getDistanceFromSeattle() == 1002.0f);
  }
}