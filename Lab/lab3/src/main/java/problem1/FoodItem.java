package problem1;

/**
 * the FoodItem abstract class have same field of name, price, available quantity and max quantity
 */
public abstract class FoodItem implements Food {
  private String name;
  private Double price;
  private Integer availableQuantity;
  private Integer maxQuantity;

  /**
   *
   * @param name the name of the food
   * @param price the price of the food
   * @param availableQuantity the available quantity of the food
   * @param maxQuantity the maximum quantity of the food
   * @throws InvalidFoodQuantityException if the available quantity exceed the maximum quantity
   * throw the exception.
   */
  public FoodItem(String name, Double price, Integer  availableQuantity,
      Integer maxQuantity) throws InvalidFoodQuantityException {
    this.name = name;
    this.price = price;
    this.maxQuantity = maxQuantity;
    if (availableQuantity > this.maxQuantity) {
      throw new InvalidFoodQuantityException();
    }
    this.availableQuantity = availableQuantity;
  }
}
