package problem2;

/**
 * A RecipientNotMatchException class, when the recipient is not match with
 * the locker's recipient throw this exception.
 */
public class RecipientNotMatchException extends Exception {
  public RecipientNotMatchException()  {
    super("Recipient not match");
  }
}