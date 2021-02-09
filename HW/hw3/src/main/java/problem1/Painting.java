package problem1;

/**
 * A class representing Painting interior property service
 */
public class Painting extends AbstractInterior {

  /**
   * Constructor for the Painting class.
   *
   * @param propertyAddress The address of the property.
   * @param propertySize    The size of the property.
   * @param isMonthly       Whether or not the service is carried out monthly.
   * @param preServiceNum   The number of services previously carried out at the address.
   * @param petsNum         The number of pets living at the address.
   */
  public Painting(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum, Integer petsNum) {
    super(propertyAddress, propertySize, isMonthly, preServiceNum, petsNum);
  }

  /**
   * Get service hour according to the property size.
   *
   * @param propertySize The size of the property
   * @return 1 if size if SMALL, 2 if size is MEDIUM, 4 if size is LARGE, 0 if size if invalid.
   */
  @Override
  public Integer getServiceHour(PropertySize propertySize) {
    switch (propertySize) {
      case LARGE:
        return 24;
      default:
        return 16;
    }
  }

  /**
   * check if two Painting object are equal
   *
   * @param o the object waits to compare
   */
  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  /**
   * Return the hashCode of Painting object
   *
   * @return the hashCode of Painting object
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }

  /**
   * Return the whole information about an Painting service
   *
   * @return the whole information about an Painting service
   */
  @Override
  public String toString() {
    return super.toString();
  }
}
