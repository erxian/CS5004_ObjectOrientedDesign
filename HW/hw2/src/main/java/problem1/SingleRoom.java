package problem1;

/**
 * A SingleRoom represent a hotel room with max occupancy 1 guest.
 */
public class SingleRoom extends Room {

  /**
   * Constructor for the SingleRoom class.
   *
   * @param price        The cost of a single night’s stay. Must be greater than 0.
   * @param guestNum     - The number of guests currently booked into the room. This value should
   *                     be
   */
  public SingleRoom(float price, int guestNum) {
    super(1, price, guestNum);
  }
}
