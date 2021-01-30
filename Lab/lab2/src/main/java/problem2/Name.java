package problem2;

/**
 * Class Name contains information about the first name, middle name and last name of a person.
 */
public class Name {
  private String firstName;
  private String middleName;
  private String lastName;

  /**
   * Constructs a new Name with firstName and lastName
   * @param firstName - The first name of a person
   * @param middleName - The middle name of a person
   * @param lastName - The last name of a person
   */
  public Name(String firstName, String middleName, String lastName) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
  }
  /**
   * Return the firtsName of Name
   * @return the firtsName of Name
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * Return the middleName of Name
   * @return the middleName of Name
   */
  public String getMiddleName() {
    return middleName;
  }

  /**
   * Return  the lastName of Name
   * @return the lastName of Name
   */
  public String getLastName() {
    return lastName;
  }
}
