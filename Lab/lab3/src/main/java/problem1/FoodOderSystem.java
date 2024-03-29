package problem1;

/**
 * this class contains a daily list of needed food items
 */
public class FoodOderSystem {
  private FoodItem[] foodItemList;

  /**
   *
   * @param foodItemList the list of all food items
   */
  public FoodOderSystem(FoodItem[] foodItemList) {
    this.foodItemList = foodItemList;
  }

  /**
   * Return the food list
   * @return the food list
   */
  public FoodItem[] getFoodItemList() {
    return this.foodItemList;
  }
}
