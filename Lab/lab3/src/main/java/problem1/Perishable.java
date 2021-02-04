package problem1;

/**
 * A Perishable abstract class inherit from FoodITem with its all fields plus order date and expire date
 * the maximum quantity of perishable food is 100
 */
public abstract class Perishable extends FoodItem{
  private Integer orderDate;
  private Integer expireDate;

  /**
   *
   * @param name the name of the perishable food
   * @param price the price of the perishable food
   * @param availableQuantity the available quantity of the perishable food
   * @param orderDate the order date of the perishable food
   * @param expireDate the expire date of the perishable food
   * @throws InvalidFoodQuantityException if the available quantity exceed the maximum quantity
   * throw the exception.
   */
  public Perishable(String name, Double price, Integer availableQuantity,
      Integer orderDate, Integer expireDate)
      throws InvalidFoodQuantityException {
    super(name, price, availableQuantity, 100);
    this.orderDate = orderDate;
    this.expireDate = expireDate;
  }
}
