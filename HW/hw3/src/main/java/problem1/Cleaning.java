package problem1;

/**
 * A class representing a cleaning interior property service.
 */
public class Cleaning extends Interior {

  /**
   * Constructor for the AbstractPropertyService class.
   *
   * @param propertyAddress The address of the property.
   * @param propertySize    The size of the property.
   * @param isMonthly       Whether or not the service is carried out monthly.
   * @param preServiceNum   The number of services previously carried out at the address.
   * @param petsNum         The number of pets living at the address.
   */
  public Cleaning(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum, Integer petsNum) {
    super(propertyAddress, propertySize, isMonthly, preServiceNum, petsNum);
  }
}
