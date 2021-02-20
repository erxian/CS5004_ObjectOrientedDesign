package problem1;
/**
 * Specifies the behavior of all vehicles.
 */
public interface IFleetManager {
  /**
   *
   * @param distance the distance traveled in miles.
   * @param vehicle the vehicle made the travel.
   * @return the TripReport of this particular vehicle.
   */
  TripReport drive(float distance, Vehicle vehicle);
}
