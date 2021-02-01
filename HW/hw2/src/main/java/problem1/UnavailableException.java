package problem1;

/**
 * An UnavailableException class, throws when the room is not available
 */
public class UnavailableException extends Exception {

  public UnavailableException() {
    super("Room not available exception");
  }
}