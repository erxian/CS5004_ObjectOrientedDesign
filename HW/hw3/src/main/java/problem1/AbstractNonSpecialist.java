package problem1;

/**
 * An Abstract class representing the shared fields and behavior of
 * non specialist service calculate price methods.
 */
public abstract class AbstractNonSpecialist extends AbstractPropertyService implements PropertyService {
  private static Integer baseRate = 80;
  /**
   * Constructor for the AbstractPropertyService class.
   *
   * @param propertyAddress The address of the property.
   * @param propertySize    The size of the property.
   * @param isMonthly       Whether or not the service is carried out monthly.
   * @param preServiceNum   The number of services previously carried out at the address.
   */
  public AbstractNonSpecialist(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum) {
    super(propertyAddress, propertySize, isMonthly, preServiceNum);
  }


  /**
   * Check if the current service is a 10th service.
   * @param preServiceNum The number of services previously carried out at the address,
   * @return true if current service is a 10th service.
   */
  public boolean isTenthService(Integer preServiceNum) {
    Integer discountTime = 10;
    Integer currentServiceNum = preServiceNum + 1;
    if (currentServiceNum % discountTime == 0) {
      return true;
    }
    return false;
  }

  /**
   * Get service hour according to the property size.
   * @param propertySize The size of the property
   * @return 1 if size if SMALL, 2 if size is MEDIUM, 4 if size is LARGE,
   * 0 if size if invalid.
   */
  public Integer getServiceHour(PropertySize propertySize) {
    switch (propertySize) {
      case MEDIUM:
        return 2;
      case LARGE:
        return 4;
      default:
        return 1;
    }
  }

  /**
   * Calculate a total price of the specified property service.
   * @return the total price of the property service.
   */
  @Override
  public double calculatePrice() {
    double tenthDiscount = 0.5;
    double monthlyDiscount = 0.9;

    double basicPrice = this.baseRate * this.getServiceHour(propertySize);
    if (this.isTenthService(preServiceNum)) {
      return basicPrice  * tenthDiscount;
    }
    if (this.isMonthly) {
      return basicPrice * monthlyDiscount;
    }
    return basicPrice;
  }
}
