package problem1;

import java.util.Objects;

public class Electrical extends AbstractSpecialist {
  static private Integer  permittingFee  = 50;

  /**
   * Constructor for the AbstractPropertyService class.
   *
   * @param propertyAddress     The address of the property.
   * @param propertySize        The size of the property.
   * @param isMonthly           Whether or not the service is carried out monthly.
   * @param preServiceNum       The number of services previously carried out at the address.
   * @param isComplex           Indicates if the work to be done is complex
   * @param licensedEmployeeNum The number of licensed employees required to complete the work
   * @throws InvalidPropertyServiceException if require over 4 employees throw the exception.
   */
  public Electrical(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum, boolean isComplex, Integer licensedEmployeeNum)
      throws InvalidPropertyServiceException {
    super(propertyAddress, propertySize, isMonthly, preServiceNum, isComplex, licensedEmployeeNum);
    this.checkMinRequirement(isComplex, licensedEmployeeNum);
  }

  /**
   * Check min requirement of employee number.
   * @param isComplex if the service is complex.
   * @param licensedEmployeeNum the licensed employee numbers.
   * @throws InvalidPropertyServiceException if require over 4 employees throw the exception.
   */
  public void checkMinRequirement(boolean isComplex, Integer licensedEmployeeNum)
      throws InvalidPropertyServiceException {
    super.setMinRequirement(isComplex, licensedEmployeeNum);
    Integer maxNum = 4;
    if (licensedEmployeeNum > maxNum) {
      throw new InvalidPropertyServiceException("electrical service cannot exceed 4 licensed employees");
    }
  }

  /**
   * Calculate a total price of the specified property service.
   *
   * @return the total price of the property service.
   */
  @Override
  public double calculatePrice() {
    return super.calculatePrice() + permittingFee;
  }

  /**
   * check if two Electrical object are equal
   * @param o the object waits to compare
   */
  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  /**
   * Return the hashCode of Electrical object
   * @return the hashCode of Electrical object
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }

  /**
   * Return the whole information about an Electrical service
   * @return the whole information about an Electrical service
   */
  @Override
  public String toString() {
    return super.toString();
  }
}
