package problem1;

/**
 * A FamilyRoom represent a hotel room with max occupancy 4 guest.
 */
public class FamilyRoom extends Room {

  /**
   * Constructor for the FamilyRoom class.
   *
   * @param price        The cost of a single night’s stay. Must be greater than 0.
   * @param guestNum     - The number of guests currently booked into the room. This value should
   *                     be
   */
  public FamilyRoom(float price, int guestNum) {
    super(4, price, guestNum);
  }
}
