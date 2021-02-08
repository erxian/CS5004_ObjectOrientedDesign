package problem1;

/**
 * A class representing Interior property service
 */
public class Interior extends AbstractNonSpecialist {
  private Integer petsNum;
  /**
   * Constructor for the AbstractPropertyService class.
   *
   * @param propertyAddress The address of the property.
   * @param propertySize    The size of the property.
   * @param isMonthly       Whether or not the service is carried out monthly.
   * @param preServiceNum   The number of services previously carried out at the address.
   * @param petsNum  The number of pets living at the address.
   */
  public Interior(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum, Integer petsNum) {
    super(propertyAddress, propertySize, isMonthly, preServiceNum);
    this.petsNum = petsNum;
  }

  /**
   * Get pets number
   * @return the pets number
   */
  public Integer getPetsNum() {
    return this.petsNum;
  }

  /**
   * Calculate the fees charged by pets
   * @param petsNum the pets number
   * @return the pets fee (a rate)
   */
  public double calculatePetsFee(Integer petsNum) {
    int minNum = 0;
    int mediumNum = 3;
    double lowRate = 0.05;
    double highRate = 0.07;
    if (petsNum < mediumNum && petsNum > minNum) {
      return lowRate;
    } else if (petsNum > mediumNum) {
      return highRate;
    } else {
      return 0;
    }
  }

  /**
   * Calculate a total price of the specified property service.
   *
   * @return the total price of the property service.
   */
  @Override
  public double calculatePrice() {
    return super.calculatePrice() * (1 + this.calculatePetsFee(petsNum));
  }
}
