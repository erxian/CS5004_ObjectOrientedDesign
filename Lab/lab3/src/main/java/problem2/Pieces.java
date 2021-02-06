package problem2;

/**
 * the piece in a video game
 */
public abstract class Pieces {
  private String name;
  private Integer age;

  /**
   * A Pieces class has its name and age
   * @param name the name of the Pieces
   * @param age the age of the Pieces
   */
  public Pieces(String name, Integer age) {
    this.name = name;
    this.validateAge(age);
    this.age = age;
  }

  /**
   * check if the Age is within 0-128, if not throw exception
   * @param age the age of the Pieces
   */
  private void validateAge(Integer age) {
    Integer minAge = 0;
    Integer maxAge = 128;
    if (age > maxAge || age < minAge) {
      throw new IllegalArgumentException("Age must be 0 ~ 128");
    }
  }
}

