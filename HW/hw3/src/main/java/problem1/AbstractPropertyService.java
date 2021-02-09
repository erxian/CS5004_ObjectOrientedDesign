package problem1;

import java.util.Objects;

/**
 * An Abstract class representing common fields of a property service.
 */
public abstract class AbstractPropertyService implements PropertyService {
  protected String propertyAddress;
  protected PropertySize propertySize;
  protected boolean isMonthly;
  protected Integer preServiceNum;

  /**
   * Constructor for the AbstractPropertyService class.
   * @param propertyAddress The address of the property.
   * @param propertySize The size of the property.
   * @param isMonthly Whether or not the service is carried out monthly.
   * @param preServiceNum The number of services previously carried out at the address.
   */
  public AbstractPropertyService(String propertyAddress, PropertySize propertySize,
      boolean isMonthly, Integer preServiceNum) {
    this.propertyAddress = propertyAddress;
    this.propertySize = propertySize;
    this.isMonthly = isMonthly;
    this.preServiceNum = preServiceNum;
  }

  /**
   * Get the address of the property.
   * @return address of the property.
   */
  public String getPropertyAddress() {
    return this.propertyAddress;
  }

  /**
   * Get the size of the property.
   * @return the size of the property.
   */
  public PropertySize getPropertySize() {
    return this.propertySize;
  }

  /**
   * Check if the service is monthly
   * @return if the service is monthly
   */
  public boolean isMonthly() {
    return this.isMonthly;
  }

  /**
   * Get the number of services previously carried out at the address.
   * @return the number of services previously carried out at the address.
   */
  public Integer getPreServiceNum() {
    return this.preServiceNum;
  }

  /**
   * check if two AbstractPropertyService object are equal
   *
   * @param o the object waits to compare
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AbstractPropertyService abstractPropertyService = (AbstractPropertyService) o;
    return Objects.equals(getPropertyAddress(), abstractPropertyService.getPropertyAddress()) &&
        Objects.equals(getPropertySize(), abstractPropertyService.getPropertySize()) &&
        Objects.equals(isMonthly(), abstractPropertyService.isMonthly()) &&
        Objects.equals(getPreServiceNum(), abstractPropertyService.getPreServiceNum());
  }

  /**
   * Return the hashCode of AbstractPropertyService object
   * @return the hashCode of AbstractPropertyService object
   */
  @Override
  public int hashCode() {
    return Objects.hash(getPropertySize(), getPropertySize(), isMonthly(), getPreServiceNum());
  }

  /**
   * Return the whole information about an property service
   * @return the whole information about an property service
   */
  @Override
  public String toString() {
    return "Specialist service info are {" +
        "Address: " + propertyAddress +
        ", Property Size: " + propertySize +
        ", isMonthly: " + isMonthly +
        ", preServiceNum: " + preServiceNum;
  }
}
