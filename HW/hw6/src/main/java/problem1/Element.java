package problem1;

public class Element {
  private Integer priority;
  private String value;

  public Element(Integer priority, String value) {
    this.priority = priority;
    this.value = value;
  }

  public Integer getPriority() {
    return this.priority;
  }

  public String getValue() {
    return this.value;
  }
}
