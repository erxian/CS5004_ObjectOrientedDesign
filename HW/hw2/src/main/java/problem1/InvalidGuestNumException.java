package problem1;

/**
 * An InvalidGuestNumException class, when guests number is not valid throw
 * this exception
 */
public class InvalidGuestNumException extends Exception {

  public InvalidGuestNumException() {
    super("Guests number is not within 1 to maxOccupancy");
  }
}
