package problem1;

public class InvalidFoodQuantityException extends Exception{
  public InvalidFoodQuantityException() {
    super("available food quantity is over maximum food quantity");
  }

}
