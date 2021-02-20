package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BusTest {
  private Bus bus;

  @Before
  public void setUp() throws Exception {
    bus = new Bus("Stanford school bus", 20.0f, 35.0f);
  }

  @Test
  public void getId() {
    assertEquals("Stanford school bus", bus.getId());
  }
}