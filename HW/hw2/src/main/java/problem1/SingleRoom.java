package problem1;

/**
 * A SingleRoom represent a hotel room with max occupancy 1 guest.
 */
public class SingleRoom extends Room {

  /**
   * Constructor for the SingleRoom class.
   *
   * @param price        The cost of a single night’s stay. Must be greater than 0.
   */
  public SingleRoom(float price) {
    super(1, price);
  }
}
