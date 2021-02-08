package problem1;

public class Gardening extends Exterior {
  private static double removalFee = 20;
  /**
   * Constructor for the AbstractPropertyService class.
   *
   * @param propertyAddress The address of the property.
   * @param propertySize    The size of the property.
   * @param isMonthly       Whether or not the service is carried out monthly.
   * @param preServiceNum   The number of services previously carried out at the address.
   */
  public Gardening(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum) {
    super(propertyAddress, propertySize, isMonthly, preServiceNum);
  }

  /**
   * Calculate a total price of the specified property service.
   *
   * @return the total price of the property service.
   */
  @Override
  public double calculatePrice() {
    return super.calculatePrice() + removalFee;
  }
}
