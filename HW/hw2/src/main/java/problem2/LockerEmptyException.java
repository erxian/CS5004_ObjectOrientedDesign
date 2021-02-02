package problem2;

/**
 * A LockerEmptyException class, when there is no mail stored in a lock,
 * throw this exception.
 */
public class LockerEmptyException extends Exception {
  public LockerEmptyException()  {
    super("No mail item stores in this locker");
  }
}