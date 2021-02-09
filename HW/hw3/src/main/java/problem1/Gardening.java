package problem1;

public class Gardening extends AbstractExterior {
  private static double removalFee = 20;
  /**
   * Constructor for the Gardening class.
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


  /**
   * check if two Gardening object are equal
   *
   * @param o the object waits to compare
   */
  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  /**
   * Return the hashCode of Gardening object
   *
   * @return the hashCode of Gardening object
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }

  /**
   * Return the whole information about an Gardening service
   *
   * @return the whole information about an Gardening service
   */
  @Override
  public String toString() {
    return super.toString() + "}";
  }
}
