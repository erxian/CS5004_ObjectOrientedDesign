package problem2;

public class Farmer extends Civilians {

  /**
   * A Farmer class inherit from Civilians, has its own name, age and wealth
   *
   * @param wealth the wealth of the Farmer
   * @param name   the name of the Farmer
   * @param age    the age of the Farmer
   */
  public Farmer(double wealth, String name, Integer age) {
    super(wealth, name, age);
  }
}
