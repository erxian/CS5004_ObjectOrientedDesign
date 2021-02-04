package problem1;

/**
 * A Pasta class inherit all field from NonPerishable class, has its own
 * name, price and available quantity.
 */
public class Pasta extends NonPerishable{

  /**
   *
   * @param name the name of the Pasta
   * @param price the price of the Pasta
   * @param availableQuantity the available quantity of Pasta
   * @throws InvalidFoodQuantityException if the available quantity exceed the maximum quantity
   * 250, throw the exception.
   */
  public Pasta(String name, Double price, Integer availableQuantity)
      throws InvalidFoodQuantityException {
    super(name, price, availableQuantity);
  }
}
