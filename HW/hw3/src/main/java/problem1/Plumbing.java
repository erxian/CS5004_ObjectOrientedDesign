package problem1;

public class Plumbing extends AbstractSpecialist {
  private static Integer  permittingFee  = 20;
  /**
   * Constructor for the Plumbing class.
   *
   * @param propertyAddress     The address of the property.
   * @param propertySize        The size of the property.
   * @param isMonthly           Whether or not the service is carried out monthly.
   * @param preServiceNum       The number of services previously carried out at the address.
   * @param isComplex           Indicates if the work to be done is complex
   * @param licensedEmployeeNum The number of licensed employees required to complete the work
   * @throws InvalidPropertyServiceException if require over 4 employees throw the exception.
   */
  public Plumbing(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum, boolean isComplex, Integer licensedEmployeeNum)
      throws InvalidPropertyServiceException {
    super(propertyAddress, propertySize, isMonthly, preServiceNum, isComplex, licensedEmployeeNum);
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
   * check if two Plumbing object are equal
   *
   * @param o the object waits to compare
   */
  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  /**
   * Return the hashCode of Plumbing object
   *
   * @return the hashCode of Plumbing object
   */
  @Override
  public int hashCode() {
    return super.hashCode();
  }

  /**
   * Return the whole information about an Plumbing service
   * @return the whole information about an Plumbing service
   */
  @Override
  public String toString() {
    return super.toString();
  }

}
