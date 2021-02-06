package problem2;

/**
 * the Soldiers piece in a video game
 */
public class Soldiers extends Pieces {
  private double stamina;
  private static double minStamina = 0;
  private static double maxStamina = 100;
  /**
   * A Soldiers class has its name and age
   *
   * @param stamina the stamina of the Soldier
   * @param name the name of the Soldier
   * @param age  the age of the Soldier
   */
  public Soldiers(double stamina, String name, Integer age) {
    super(name, age);
    this.validStamina(stamina);
    this.stamina = stamina;
  }

  /**
   * Return the stamina of the soldier
   * @return the stamina of the soldier
   */
  public double getStamina() {
    return this.stamina;
  }

  /**
   * check if stamina is within the range 0-100, if not throw exception
   * @param stamina the stamina of the Soldier
   */
  private void validStamina(double stamina) {
    if (stamina > maxStamina || stamina < minStamina) {
      throw new IllegalArgumentException("Stamina out of range 0-100");
    }
  }

  /**
   * add stamina to the soldier
   * @param num the num add to soldier stamina
   */
  public void addStamina(double num) {
    if (num < minStamina) {
      num = minStamina;
    }
    if (this.stamina + num > maxStamina) {
      throw new IllegalArgumentException("Stamina over 100 after add");
    }
    this.stamina += num;
  }

  /**
   * remove the stamina of the soldier
   * @param num the num need remove from soldier stamina
   */
  public void removeStamina(double num) {
    if (num < minStamina) {
      num = minStamina;
    }
    if (this.stamina - num < minStamina) {
      throw new IllegalArgumentException("Stamina less than 0 after remove");
    }
    this.stamina -= num;
  }
}
