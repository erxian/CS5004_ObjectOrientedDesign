package problem1;

/**
 * store information about a trip made by a particular vehicle, including
 * The Vehicle type, Speed in miles per minute, Distance traveled in miles
 * and Trip duration in minutes.
 */
public class TripReport {
  private Vehicle vehicle;
  private Float speed;
  private Float distance;
  private Integer tripDuration;

  /**
   *
   * @param vehicle The Vehicle that took the trip
   * @param speed Speed in miles per minute
   * @param distance Distance traveled in miles
   * @param tripDuration Trip duration in minutes
   */
  public TripReport(Vehicle vehicle, Float speed, Float distance, Integer tripDuration) {
    this.vehicle = vehicle;
    this.speed = speed;
    this.distance = distance;
    this.tripDuration = tripDuration;
  }

  /**
   * Get the vehicle used for the trip.
   * @return the vehicle used for the trip.
   */
  public Vehicle getVehicle() {
    return this.vehicle;
  }

  /**
   * Get the speed of this trip
   * @return the speed of this trip
   */
  public Float getSpeed() {
    return this.speed;
  }

  /**
   * Get the distance of this trip
   * @return the distance of this trip
   */
  public Float getDistance() {
    return this.distance;
  }

  /**
   * Get the trip duration
   * @return the trip duration.
   */
  public Integer getTripDuration() {
    return this.tripDuration;
  }
}
