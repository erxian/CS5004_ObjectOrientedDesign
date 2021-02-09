package problem1;

public class WindowCleaning extends AbstractExterior {
  private Integer floorNum;

  /**
   * Constructor for the AbstractExterior class.
   *
   * @param propertyAddress The address of the property.
   * @param propertySize    The size of the property.
   * @param isMonthly       Whether or not the service is carried out monthly.
   * @param preServiceNum   The number of services previously carried out at the address.
   * @param floorNum The number of floors the property has.
   * @throws InvalidPropertyServiceException if the property floor is more than 3 throw exception.
   */
  public WindowCleaning(String propertyAddress, PropertySize propertySize, boolean isMonthly,
      Integer preServiceNum, Integer floorNum) throws InvalidPropertyServiceException {
    super(propertyAddress, propertySize, isMonthly, preServiceNum);
    this.isValidFloorNum(floorNum);
    this.floorNum = floorNum;
  }

  /**
   * if the property floor is more than 3 throw exception.
   * @param floorNum The number of floors the property has.
   * @throws InvalidPropertyServiceException if the property floor is more than 3 throw exception.
   */
  private void isValidFloorNum(Integer floorNum) throws InvalidPropertyServiceException {
    Integer maxFloor = 3;
    if (floorNum > maxFloor) {
      throw new InvalidPropertyServiceException("Floor number exceed max level 3");
    }
  }

  /**
   * Get the floor of the property.
   * @return the floor of the property.
   */
  public Integer getFloorNum() {
    return this.floorNum;
  }

  /**
   * Calculate the fee charged by floor.
   * @param floorNum The number of floors the property has
   * @return The floor rate
   */
  public double calculateFloorFee(Integer floorNum) {
    int noFeeFloorNum = 1;
    double floorRate = 0.05;
    if (floorNum > noFeeFloorNum) {
      return floorRate;
    }
    return 0;
  }

  /**
   * Calculate a total price of the specified property service.
   *
   * @return the total price of the property service.
   */
  @Override
  public double calculatePrice() {
    return super.calculatePrice() * (1 + this.calculateFloorFee(floorNum));
  }
}
