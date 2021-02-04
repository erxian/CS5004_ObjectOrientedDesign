package problem1;

/**
 * A Rice class inherit all field from NonPerishable class, has its own
 * name, price and available quantity.
 */
public class Rice extends NonPerishable{

  /**
   *
   * @param name the name of the Rice
   * @param price the price of the Rice
   * @param availableQuantity the available quantity of the Rice
   * @throws InvalidFoodQuantityException if the available quantity exceed the maximum quantity
   * 250, throw the exception.
   */
  public Rice(String name, Double price, Integer availableQuantity)
      throws InvalidFoodQuantityException {
    super(name, price, availableQuantity);
  }
}
