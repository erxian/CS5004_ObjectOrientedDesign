package p3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor2 {
  private static List<StringProcessor2.DataType> replaceList = new ArrayList<>();

  public StringProcessor2() {
  }

  public static <DataType> List<StringProcessor2.DataType> replaceAndRepeatLetters(char sourceChar, char destChar,
                                           int numRepetitions, List<String> stringList){

    for (String s: stringList) {
      String newStr = null;
      /** new a pattern */
      Pattern pattern = Pattern.compile(Character.toString(sourceChar));
      Matcher matcher = pattern.matcher(s);

      /** count how many times it matches*/
      int count = 0;
      while(matcher.find()) {
        count++;
      }

      /** if matching, then replace the string */
      if (count > 0) {
        String repeated = new String(new char[numRepetitions])
            .replace("\0", Character.toString(destChar));
        newStr = matcher.replaceAll(repeated);
      }

      /** initialize a DataType to store the new string */
      StringProcessor2.DataType dataType = new StringProcessor2.DataType(s, newStr, count);

      /** add the DataType to the list */
      replaceList.add(dataType);
    }

    return replaceList;
  }


  /**
   * Compare two StringProcessor2 Objects for equality.
   * @param o Another StringProcessor2
   * @return true if objects are equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof StringProcessor2)) {
      return false;
    }
    StringProcessor2 that = (StringProcessor2) o;
    return Objects.equals(replaceList, that.replaceList);
  }

  /**
   * Returns integer hashCode of the Object.
   * @return Integer hashCode of the Object.
   */
  @Override
  public int hashCode() {
    return Objects.hash(replaceList);
  }

  /**
   * String representation of a RestaurantRecommender Object.
   * @return String representation of a RestaurantRecommender Object.
   */
  @Override
  public String toString() {
    return "StringProcessor2{" +
        "replaceList=" + replaceList +
        '}';
  }

  /**
   * A placeholder for a data type of user choosing
   */
  private static class DataType {
    private String origin;
    private String replaced;
    private int times;

    public DataType(String origin, String replaced, int times) {
      this.origin = origin;
      this.replaced = replaced;
      this.times = times;
    }

    @Override
    public String toString() {
      return origin +
          ", " + replaced +
          ", " + String.valueOf(times);
    }
  }

  public static void main(String[] args) {
    List<String> list = Arrays.asList("puppy", "penguin", "tiger", "apple");
    List<StringProcessor2.DataType> newList = replaceAndRepeatLetters('p', 'T', 3, list);
    newList.stream().forEach(System.out::println);
  }
}