package problem2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RunnerTest {
  private Runner liuxiang;
  private Name name;

  @Before
  public void setUp() throws Exception {
    name = new Name("liu", "", "xiang");
    liuxiang = new Runner(name, 175.12, 60.5, "running",
        32.35, 110.21, "international competition");
  }

  @Test
  public void getBest5Ktime() {
    assertEquals(32.35, liuxiang.getBest5Ktime(), 0.0);
  }

  @Test
  public void getBestHMtime() {
    assertEquals(110.21, liuxiang.getBestHMtime(), 0.0);
  }

  @Test
  public void getFavorEvent() {
    assertEquals("international competition", liuxiang.getFavorEvent());
  }
}