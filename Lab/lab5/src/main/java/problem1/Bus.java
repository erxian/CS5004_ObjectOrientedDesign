package problem1;

public class Bus extends Vehicle {

  /**
   * The Bus transit Bus
   * @param id the id of the bus
   * @param averageSpeed the average speed of the bus
   * @param maxSpeed the max speed of the bus
   */
  public Bus(String id, Float averageSpeed, Float maxSpeed) {
    super(id, averageSpeed, maxSpeed);
  }

  /**
   * Get the id of the Bus.
   *
   * @return the id of the Bus.
   */
  @Override
  public String getId() {
    return super.getId();
  }

  /**
   * Get the average speed of the Bus.
   *
   * @return the average speed of the Bus
   */
  @Override
  public Float getAverageSpeed() {
    return super.getAverageSpeed();
  }

  /**
   * get the max speed of the Bus.
   *
   * @return the max speed of the Bus.
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
