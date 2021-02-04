package problem1;

/**
 * A Vegetable class which own its name, price, availableQuantity, orderDate and expireDate.
 */
public class Vegetable extends Perishable{
  /**
   *
   * @param name the name of the Meat
   * @param price the price of the Meat
   * @param availableQuantity the available quantity of the Meat
   * @param orderDate the order date of the Meat
   * @param expireDate the expiration date of the Meat
   * @throws InvalidFoodQuantityException if the available quantity exceed the maximum quantity
   * 100, throw the exception.
   */
  public Vegetable(String name, Double price, Integer availableQuantity, Integer orderDate,
      Integer expireDate) throws InvalidFoodQuantityException {
    super(name, price, availableQuantity, orderDate, expireDate);
  }
}
