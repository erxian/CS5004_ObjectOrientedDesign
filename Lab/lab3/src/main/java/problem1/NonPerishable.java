package problem1;

/**
 * A NonPerishable abstract class inherit from FoodITem with its all fields
 * the maximum quantity of non perishable food is 200
 */
public abstract class NonPerishable extends FoodItem{

  /**
   *
   * @param name the name of the non perishable food
   * @param price the price of the non perishable food
   * @param availableQuantity the available quantity of the non perishable food
   * @throws InvalidFoodQuantityException if the available quantity exceed the maximum quantity
   * 250, throw the exception.
   */
  public NonPerishable(String name, Double price, Integer availableQuantity)
      throws InvalidFoodQuantityException {
    super(name, price, availableQuantity, 250);
  }
}
