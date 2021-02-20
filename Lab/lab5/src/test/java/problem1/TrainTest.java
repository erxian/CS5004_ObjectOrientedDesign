package problem1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainTest {
  private Train train;

  @Before
  public void setUp() throws Exception {
    train = new Train("NYC to Boston", 100.0f, 150.0f);
  }

  @Test
  public void getId() {
    assertEquals("NYC to Boston", train.getId());
  }
}