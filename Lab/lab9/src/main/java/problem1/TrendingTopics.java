package problem1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrendingTopics {

  /**
   * This Class is to identify trending topics
   */
  public TrendingTopics() {
    // do nothing
  }

  /**
   * Return a map, key is topics, value is the frequency of this topics
   * @param list a given string list
   * @return a map
   */
  public Map<String, Integer> countTopics(List<String> list) {
    return list.stream()
        .collect(Collectors.toMap(s -> s, s -> 1, Integer::sum));
  }
  /*
  public static void main(String[] args) {
    List<String> list = Arrays.asList("Seattle", "wildfires", "DEFCON26", "NEU", "NEU",
      "Seattle", "Seattle", "NEU", "DEFCON26", "wildfires");

    TrendingTopics tt = new TrendingTopics();
    System.out.println(tt.countTopics(list));
  }*/
}
