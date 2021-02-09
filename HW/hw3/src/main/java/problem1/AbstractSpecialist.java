package problem1;

import java.util.Objects;

public abstract class AbstractSpecialist extends AbstractPropertyService implements PropertyService {
  static private Integer baseRate = 200;
  private boolean isComplex;
  private Integer licensedEmployeeNum;
  /**
   * Constructor for the AbstractSpecialist class.
   *
   * @param propertyAddress The address of the property.
   * @param propertySize    The size of the property.
   * @param isMonthly       Whether or not the service is carried out monthly.
   * @param preServiceNum   The number of services previously carried out at the address.
   * @param isComplex  Indicates if the work to be done is complex
   * @param licensedEmployeeNum The number of licensed employees required to complete the work
   * @throws InvalidPropertyServiceException if require over 4 employees throw the exception.
   */
  public AbstractSpecialist(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum, boolean isComplex, Integer licensedEmployeeNum)
      throws InvalidPropertyServiceException {
    super(propertyAddress, propertySize, isMonthly, preServiceNum);
    this.isComplex = isComplex;
    this.setMinRequirement(isComplex, licensedEmployeeNum);
  }

  /**
   * Get licensed employee numbers.
   * @return the licensed employee numbers.
   */
  public Integer getLicensedEmployeeNum() {
    return this.licensedEmployeeNum;
  }

  /**
   * check if the service is complex.
   * @return if the service is complex.
   */
  public boolean isComplex() {
    return this.isComplex;
  }

  /**
   * Set min requirement of employee number.
   * @param isComplex if the service is complex.
   * @param licensedEmployeeNum the licensed employee numbers.
   * @throws InvalidPropertyServiceException not sure why child class affect parent class
   */
  public void setMinRequirement(boolean isComplex, Integer licensedEmployeeNum)
      throws InvalidPropertyServiceException {
    Integer minNum = 1;
    Integer complexMinNum = 2;
    Integer complexLargeMinNum = 3;
    // All specialist services require at least one licensed employee.
    if (!isComplex && licensedEmployeeNum < minNum) {
      this.licensedEmployeeNum = minNum;
      // Complex work requires at least 2 employees if the house is small or medium sized
    } else if (isComplex && (this.propertySize == PropertySize.SMALL ||
        this.propertySize == PropertySize.MEDIUM) &&
          licensedEmployeeNum < complexMinNum) {
          this.licensedEmployeeNum = complexMinNum;
      // Complex work requires at least 3 if the house is large
    } else if (isComplex && this.propertySize == PropertySize.LARGE &&
        licensedEmployeeNum < complexLargeMinNum) {
        this.licensedEmployeeNum = complexLargeMinNum;
    } else {
      this.licensedEmployeeNum = licensedEmployeeNum;
    }
  }

  /**
   * Calculate a total price of the specified property service.
   *
   * @return the total price of the property service.
   */
  @Override
  public double calculatePrice() {
    return this.licensedEmployeeNum * baseRate;
  }


  /**
   * check if two AbstractSpecialist object are equal
   *
   * @param o the object waits to compare
   */
  @Override
  public boolean equals(Object o) {
    AbstractSpecialist abstractSpecialist = (AbstractSpecialist) o;
    return super.equals(o) && Objects.equals(isComplex(), abstractSpecialist.isComplex()) &&
        Objects.equals(getLicensedEmployeeNum(), abstractSpecialist.getLicensedEmployeeNum());
  }

  /**
   * Return the hashCode of AbstractSpecialist object
   *
   * @return the hashCode of AbstractSpecialist object
   */
  @Override
  public int hashCode() {
    return super.hashCode() + Objects.hash(isComplex(), getLicensedEmployeeNum());
  }

  /**
   * Return the whole information about an Specialist service
   * @return the whole information about an Specialist service
   */
  @Override
  public String toString() {
    return super.toString() +
        ", isComplex: " + String.format("%b", this.isComplex()) +
        ", licensedEmployeeNum: " + String.format("%d", this.getLicensedEmployeeNum()) +
        "}";
  }
}
