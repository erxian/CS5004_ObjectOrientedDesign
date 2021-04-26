package problem1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Before;
import org.junit.Test;

public class TrendingTopicsTest {
  private List<String> list;
  private TrendingTopics tt;

  @Before
  public void setUp() throws Exception {
    list = Arrays.asList("Seattle", "wildfires", "DEFCON26", "NEU", "NEU",
        "Seattle", "Seattle", "NEU", "DEFCON26", "wildfires");
    tt = new TrendingTopics();
  }

  @Test
  public void countTopics() {
    Map<String, Integer> expected = new HashMap<>();
    expected.put("Seattle", 3);
    expected.put("wildfires", 2);
    expected.put("DEFCON26", 2);
    expected.put("NEU", 3);

    assertEquals(expected, tt.countTopics(list));
  }
}