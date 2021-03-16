package problem1;

/**
 * A DoubleRoom represents a hotel room with max occupancy 2 guests.
 */
public class DoubleRoom extends Room {

  /**
   * Constructor for the DoubleRoom class.
   *
   * @param price        The cost of a single night’s stay. Must be greater than 0.
   */
  public DoubleRoom(float price) {
    super(2, price);
  }
}
