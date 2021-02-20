package problem1;

public class Train extends Vehicle {
  /**
   * The Train transit Train
   * @param id the id of the Train
   * @param averageSpeed the average speed of the Train
   * @param maxSpeed the max speed of the Train
   */

  public Train(String id, Float averageSpeed, Float maxSpeed) {
    super(id, averageSpeed, maxSpeed);
  }

  /**
   * Get the id of the Train.
   *
   * @return the id of the Train.
   */
  @Override
  public String getId() {
    return super.getId();
  }

  /**
   * Get the average speed of the Train
   *
   * @return the average speed of the Train
   */
  @Override
  public Float getAverageSpeed() {
    return super.getAverageSpeed();
  }

  /**
   * get the max speed of the Train.
   *
   * @return the max speed of the Train.
   */
  @Override
  public Float getMaxSpeed() {
    return super.getMaxSpeed();
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
