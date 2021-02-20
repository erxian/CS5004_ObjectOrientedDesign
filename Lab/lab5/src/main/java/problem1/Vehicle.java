package problem1;

import java.util.Objects;

public abstract class Vehicle {

  /**
   * A transit vehicle includes bus, train and boat
   */
  private String id;
  private Float averageSpeed;
  private Float maxSpeed;

  /**
   *
   * @param id the id of the vehicle
   * @param averageSpeed the average speed of the vehicle
   * @param maxSpeed the max speed of the vehicle
   */
  public Vehicle(String id, Float averageSpeed, Float maxSpeed) {
    this.id = id;
    this.averageSpeed = averageSpeed;
    this.maxSpeed = maxSpeed;
  }

  /**
   * Get the id of the vehicle.
   * @return the id of the vehicle.
   */
  public String getId() {
    return this.id;
  }

  /**
   * Get the average speed of the vehicle
   * @return the average speed of the vehicle
   */
  public Float getAverageSpeed() {
    return this.averageSpeed;
  }

  /**
   * get the max speed of the vehicle.
   * @return the max speed of the vehicle.
   */
  public Float getMaxSpeed() {
    return this.maxSpeed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Vehicle that = (Vehicle) o;
    return id == that.id &&
        Float.compare(averageSpeed, that.averageSpeed) == 0 &&
        Float.compare(maxSpeed, that.maxSpeed) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId(), getAverageSpeed(), getMaxSpeed());
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "id=" + this.id +
        "averageSpeed=" + String.valueOf(this.averageSpeed) +
        "maxSpeed=" + String.valueOf(this.maxSpeed) +
        '}';
  }
}
