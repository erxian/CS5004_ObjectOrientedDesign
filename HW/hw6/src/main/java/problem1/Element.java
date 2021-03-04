package problem1;

import java.util.Objects;

/**
 * The Element Class with fileds: priority and value.
 */
public class Element {
  private Integer priority;
  private String value;

  /**
   * Constructor a new Element.
   *
   * @param priority the priority
   * @param value    the value
   */
  public Element(Integer priority, String value) {
    this.priority = priority;
    this.value = value;
  }

  /**
   * Gets priority.
   *
   * @return the priority
   */
  public Integer getPriority() {
    return this.priority;
  }

  /**
   * Gets value.
   *
   * @return the value
   */
  public String getValue() {
    return this.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getPriority(), getValue());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Element that = (Element) o;
    return Objects.equals(getPriority(), that.getPriority()) &&
        Objects.equals(getValue(), that.getValue());
  }

  @Override
  public String toString() {
    return "Element{" +
            "priority='" + this.priority + '\'' +
            ", value='" + this.value +
            '}';
  }
}
