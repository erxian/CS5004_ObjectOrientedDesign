package problem1;

import java.util.Objects;

public abstract class AbstractExterior extends AbstractNonSpecialist {
  /**
   * Constructor for the AbstractExterior class.
   *
   * @param propertyAddress The address of the property.
   * @param propertySize    The size of the property.
   * @param isMonthly       Whether or not the service is carried out monthly.
   * @param preServiceNum   The number of services previously carried out at the address.
   */
  protected AbstractExterior(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum) {
    super(propertyAddress, propertySize, isMonthly, preServiceNum);
  }

  /**
   * check if two AbstractExterior object are equal
   *
   * @param o the object waits to compare
   */
  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  /**
   * Return the hashCode of AbstractExterior object
   *
   * @return the hashCode of AbstractExterior object
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }

  /**
   * Return the whole information about an Exterior service
   *
   * @return the whole information about an Exterior service
   */
  @Override
  public String toString() {
    return super.toString();
  }
}
