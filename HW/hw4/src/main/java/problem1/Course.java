package problem1;

import java.util.Objects;

public class Course {
  private final String name;
  private final String prefix;
  private final int number;

  /**
   *
   * @param name the name of course
   * @param prefix the prefix of course
   * @param number the number of course
   */
  public Course(String name, String prefix, int number) {
    this.name = name;
    this.prefix = prefix;
    this.number = number;
  }

  /**
   * Return the course details
   * @return the course details
   */
  @Override
  public String toString() {
    return this.prefix + this.number + ": " + this.name;
  }

  /**
   * Check if two course object is equal.
   * @param o the course waits to compare
   * @return true if equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Course course = (Course) o;
    return this.number == course.number &&
        this.name.equals(course.name) &&
        this.prefix.equals(course.prefix);
  }

  /**
   * Check if two course object have same hash code.
   * @return True if has, false otherwise.
   */
  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.prefix, this.number);
  }
}

