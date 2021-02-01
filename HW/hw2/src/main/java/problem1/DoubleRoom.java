package problem1;

public class DoubleRoom extends Room {

  /**
   * Constructor for the Room class.
   *
   * @param price        The cost of a single night’s stay. Must be greater than 0.
   * @param guestNum     - The number of guests currently booked into the room. This value should
   *                     be
   */
  public DoubleRoom(float price, int guestNum) {
    super(2, price, guestNum);
  }
}
