package problem1;

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
}
