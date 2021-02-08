package problem1;

public class Exterior extends AbstractNonSpecialist {
  /**
   * Constructor for the AbstractPropertyService class.
   *
   * @param propertyAddress The address of the property.
   * @param propertySize    The size of the property.
   * @param isMonthly       Whether or not the service is carried out monthly.
   * @param preServiceNum   The number of services previously carried out at the address.
   */
  public Exterior(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum) {
    super(propertyAddress, propertySize, isMonthly, preServiceNum);
  }
}
