package problem3;

/**
 * CS 5004 Spring 2021
 * Zengping Xu
 *
 * Represents an Author with their details--name, email and physical address
 *
 */
public class Author {
  private String name;
  private String email;
  private String address;
  /**
   * Creates a new author given the author's name, email and address as strings.
   *
   * @param name the author's name
   * @param email the author's email address
   * @param address the authors physical address
   */
  public Author(String name, String email, String address) {
    this.name = name;
    this.email = email;
    this.address = address;
  }
  /**
   * Return the author name
   * @return the name
   */
  public String getName() {
    return this.name;
  }
  /**
   * Return the author email
   * @return the email
   */
  public String getEmail() {
    return this.email;
  }
  /**
   * Return the author address
   * @return the address
   */
  public String getAddress() {
    return this.address;
  }
}