package problem2;

/**
 * The Civilian piece in a video game
 */
public class Civilians extends Pieces {
  private double wealth;
  private static double minWealth = 0;
  /**
   * A Civilians class inherit from Pieces, has its own wealth
   *
   * @param wealth the wealth of the Civilian
   * @param name the name of the Civilian
   * @param age  the age of the Civilian
   */
  public Civilians(double wealth, String name, Integer age) {
    super(name, age);
    this.validateWealth(wealth);
    this.wealth = wealth;
  }

  /**
   * check if the wealth is greater than 0, if not throw Exception
   * @param wealth
   */
  private void validateWealth(double wealth) {
    if (wealth <= minWealth) {
      throw new IllegalArgumentException("Wealth mush be greater than 0");
    }
  }

  /**
   * Return the wealth of Civilian
   * @return the wealth of the civilian
   */
  public double getWealth() {
    return this.wealth;
  }

  /**
   * add wealth
   * @param num the add number of wealth
   */
  public void addWealth(double num) {
    if (num < minWealth) {
      num = minWealth;
    }
    this.wealth += num;
  }

  /**
   * decrease wealth
   * @param num the add number of wealth
   */
  public void decreaseWealth(double num) {
    if (num > this.wealth) {
      throw new IllegalArgumentException("decrease wealth exceed current wealth");
    }
    this.wealth -= num;
  }
}
