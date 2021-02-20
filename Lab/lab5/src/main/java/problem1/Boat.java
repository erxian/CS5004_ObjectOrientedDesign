package problem1;

public class Boat extends Vehicle {

  /**
   * The Boat transit Boat
   * @param id the id of the Boat
   * @param averageSpeed the average speed of the Boat
   * @param maxSpeed the max speed of the Boat
   */
  public Boat(String id, Float averageSpeed, Float maxSpeed) {
    super(id, averageSpeed, maxSpeed);
  }

  /**
   * Get the id of the Boat.
   *
   * @return the id of the Boat.
   */
  @Override
  public String getId() {
    return super.getId();
  }

  /**
   * Get the average speed of the Boat
   *
   * @return the average speed of the Boat
   */
  @Override
  public Float getAverageSpeed() {
    return super.getAverageSpeed();
  }

  /**
   * get the max speed of the Boat.
   *
   * @return the max speed of the Boat.
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
