package problem2;

import java.util.Objects;
/**
 * A Recipient of a mail package with first name, last name and email address.
 */
public class Recipient {
  private String firstName;
  private String lastName;
  private String address;

  /**
   * Constructor for the Recipient class.
   * @param firstName The person's first name, a String.
   * @param lastName The person's last name, a String.
   * @param email The email address, a String.
   */
  public Recipient(String firstName, String lastName, String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = email;
  }

  /**
   * Gets the recipient's first name.
   * @return The first name, a String.
   */
  public String getFirstName() {
    return this.firstName;
  }

  /**
   * Gets the recipient's last name.
   * @return The last name, a String.
   */
  public String getLastName() {
    return this.lastName;
  }

  /**
   * Gets the email address.
   * @return the email address.
   */
  public String getAddress() {
    return this.address;
  }


  @Override
  /**
   * rewrite equals to compare two recipient object
   */
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Recipient)) return false;
    Recipient recipient = (Recipient) o;
    return Objects.equals(getFirstName(), recipient.getFirstName()) &&
        Objects.equals(getLastName(), recipient.getLastName()) &&
        Objects.equals(getAddress(), recipient.getAddress());
  }
}
