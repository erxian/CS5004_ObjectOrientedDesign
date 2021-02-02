package problem2;

/**
 * A InvalidDimensionException class, when any single dimension of the mail
 * item is bigger than the locker throw this exception
 */
public class InvalidDimensionException extends Exception {
  public InvalidDimensionException()  {
      super("Mail dimension if bigger than lockers'");
  }
}
