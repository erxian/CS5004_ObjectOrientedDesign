package problem2;

/**
 * A LockerOccupiedException class, when locker has already been occupied with
 * mail throw this exception
 */
public class LockerOccupiedException extends Exception {
  public LockerOccupiedException() {
      super("The locker is occupied ");
  }
}
