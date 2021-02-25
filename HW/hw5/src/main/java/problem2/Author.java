package problem2;

import java.util.Objects;
import java.util.Set;

/**
 * A mutable class representing a name.
 */
public class Author implements Creator{
  private String firstName;
  private String lastName;


  /**
   * Constructor for the Name class.
   * @param firstName The first name, a String.
   * @param lastName The last name, a String.
   */
  public Author(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /**
   * Gets the first name.
   * @return The first name, a String.
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Gets the last name.
   * @return The last name, a String.
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Get the creator of the item
   *
   * @return the creator of the item
   */
  @Override
  public Set<RecordingArtist> getArtists() {
    return null;
  }

  @Override
  public boolean isBand(){
    return false;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Author that = (Author) o;
    return Objects.equals(getFirstName(), that.getFirstName()) &&
        Objects.equals(getLastName(), that.getLastName());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getFirstName(), getLastName());
  }

  @Override
  public String toString() {
    return "Author{" +
        "firstName='" + firstName + '\'' + ", " +
        "lastName='" + lastName + '\'' +
        '}';
  }
}
