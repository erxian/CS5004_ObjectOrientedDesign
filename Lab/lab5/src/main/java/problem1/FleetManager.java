package problem1;

/**
 * FleetManager keep track of the tripe report with a particular vehicle.
 */
public class FleetManager {
  /**
   * @param distance the distance traveled in miles.
   * @param vehicle the vehicle made the travel.
   * @return the TripReport of this particular vehicle.
   */
  public TripReport drive(Float distance, Vehicle vehicle) {
    Integer tripD = Math.round(distance / vehicle.getAverageSpeed());
    return new TripReport(vehicle, vehicle.getAverageSpeed(), distance, tripD);
  }

  /**
   *
   * @param duration Trip duration in minutes.
   * @param vehicle the vehicle made the travel.
   * @return the TripReport of this particular vehicle.
   */
  public TripReport drive(Integer duration, Vehicle vehicle) {
    Float distance = duration * vehicle.getAverageSpeed();
    return new TripReport(vehicle, vehicle.getAverageSpeed(), distance, duration);
  }

  /**
   *
   * @param speed The Speed in miles per minute of this vehicle.
   * @param distance the distance traveled in miles.
   * @param vehicle the vehicle made the travel.
   * @return the TripReport of this particular vehicle.
   */
  public TripReport drive(Float speed, Float distance, Vehicle vehicle) {
    if (speed > vehicle.getMaxSpeed()) {
      speed = vehicle.getMaxSpeed();
    }
    Integer duration = Math.round(distance / speed);
    return new TripReport(vehicle, speed, distance, duration);
  }

  /**
   *
   * @param duration Trip duration in minutes.
   * @param distance the distance traveled in miles.
   * @param vehicle The vehicle used to travel.
   * @return the TripReport of this particular vehicle.
   */
  public TripReport drive(Integer duration, Float distance, Vehicle vehicle) {
    Float speed = distance / duration;
    return new TripReport(vehicle, speed, distance, duration);
  }
}
