package problem2;

public class Engineer extends Civilians {

  /**
   * A Engineer class inherit from Civilians, has its own name, age and wealth
   *
   * @param wealth the wealth of the Engineer
   * @param name   the name of the Engineer
   * @param age    the age of the Engineer
   */
  public Engineer(double wealth, String name, Integer age) {
    super(wealth, name, age);
  }
}
