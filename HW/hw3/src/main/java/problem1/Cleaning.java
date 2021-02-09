package problem1;

/**
 * A class representing a cleaning interior property service.
 */
public class Cleaning extends AbstractInterior {

  /**
   * Constructor for the AbstractInterior class.
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

  /**
   * check if two Cleaning object are equal
   *
   * @param o the objects waits to compare
   */
  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  /**
   * Return the hashCode of Cleaning object
   *
   * @return the hashCode of Cleaning object
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }

  /**
   * Return the whole information about an Cleaning service
   *
   * @return the whole information about an Cleaning service
   */
  @Override
  public String toString() {
    return super.toString();
  }
}
