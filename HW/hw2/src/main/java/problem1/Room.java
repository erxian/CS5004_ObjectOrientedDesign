package problem1;

/**
 * A Room class representing a hotel room with maxOccupancy, price and guest number.
 */
public class Room {

  private static int DEFAULT_NUM = 0;
  private int maxOccupancy;
  private float price;
  private int guestNum;

  /**
   * Constructor for the Room class.
   *
   * @param maxOccupancy The maximum number of people that can stay in the room
   * @param price        The cost of a single night’s stay. Must be greater than 0.
   * @param guestNum     - The number of guests currently booked into the room. This value should be
   *                     0 when the room is first created in the system
   */
  public Room(int maxOccupancy, float price, int guestNum) {
    this.maxOccupancy = maxOccupancy;

    this.IsValidPrice(price);
    this.price = price;

    this.validateDefault(guestNum);
    this.guestNum = guestNum;
    }

  /**
   * Gets the maximum number of people that can stay in the room
   *
   * @return the maximum number of people that can stay in the room
   */
  public int getMaxOccupancy() {
    return this.maxOccupancy;
  }

  /**
   * Gets the number of guests currently booked into the room
   *
   * @return the number of guests currently booked into the room
   */
  public int getGuestNum() {
    return this.guestNum;
  }

  /**
   * Sets the number of guests who will book into the room
   *
   * @param guestNum The number of guests book the room
   */
  private void setGuestNum(int guestNum) {
    this.guestNum = guestNum;
  }

  /**
   * Checks the room price when create a new room, should be greater than 0.
   * @param price The cost of a single night’s stay
   */
  private void IsValidPrice(float price) {
    int MIN_PRICE = 0;
    if (price <= MIN_PRICE)
      throw new IllegalArgumentException("Price must be greater than 0");
  }

  /**
   * Checks if the guests number is 0
   * @param guestNum The number of guests currently booked into the room.
   * This value should be 0 when the room is first created in the system
   */
  private void validateDefault(int guestNum) {
    if (guestNum != DEFAULT_NUM)
      throw new IllegalArgumentException("guest number must be 0");
  }

  /**
   * Checks the guests number when created a new room, must be 0.
   * @throws InvalidGuestNumException if the guests number is less than 0
   * or greater than maxOccupancy
   * @param guestNum The number of guests book the room
   */
  private void isValidateGuestNum(int guestNum) throws InvalidGuestNumException {
    if (guestNum <= DEFAULT_NUM || guestNum > this.getMaxOccupancy())
      throw new InvalidGuestNumException();
  }

  /**
   * Check if a room is available to book, if currently guests number is 0,
   * the room is available, otherwise unavailable.
   * @throws UnavailableException  if the room is not available
   * @return true if the room is available, false otherwise.
   */
  public boolean isAvailable() throws UnavailableException {
    if (this.getGuestNum() > DEFAULT_NUM)
      throw new UnavailableException();
    return true;
  }

  /**
   * Book a room with specific guests number
   *
   * @param guestNum The number of guests book the room
   * @throws UnavailableException  if the room is not available
   * @throws InvalidGuestNumException if the guests number is less than 0 or greater than
   *                                  maxOccupancy
   */
  public void bookRoom(int guestNum) throws UnavailableException, InvalidGuestNumException {
    this.isAvailable();
    this.isValidateGuestNum(guestNum);
    this.setGuestNum(guestNum);
  }
}

