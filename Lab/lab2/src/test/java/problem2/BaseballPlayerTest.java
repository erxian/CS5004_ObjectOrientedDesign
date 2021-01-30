package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BaseballPlayerTest {
  private BaseballPlayer mike;
  private Name name;

  @Before
  public void setUp() throws Exception {
    name = new Name("mike", "T", "trout");
    mike = new BaseballPlayer(name, 172.50, 73.2, "baseball",
        "us USA", 0.281, 17);
  }

  @Test
  public void getTeam() {
    assertEquals("us USA", mike.getTeam());
  }

  @Test
  public void getAverageBatting() {
    assertEquals(0.281, mike.getAverageBatting(), 0.0);
  }

  @Test
  public void getSeasonHomeRuns() {
    assertEquals(17, mike.getSeasonHomeRuns(), 0.0);
  }
}