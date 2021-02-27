package problem2;

/**
 * The interface Set.
 */
public interface ISet {

  /**
   * Create EmptySet set.
   *
   * @return the empty set.
   */
  static ISet emptySet() {
    return new EmptySet();
  }

  /**
   * Is empty boolean.
   *
   * @return the boolean, true if the Set is empty false otherwise.
   */
  Boolean isEmpty();

  /**
   * Add Integer n to Set.
   * @param n Integer need add.
   * @return a new Set contains n.
   */
  ISet add(Integer n);

  /**
   * Check if Set contains Integer n
   * @param n Integer need check
   * @return a boolean, true if contains false otherwise.
   */
  Boolean contains(Integer n);

  /**
   * Remove the integer n.
   *
   * @param n the Integer need remove.
   * @return a new Set without n.
   */
  ISet remove(Integer n);

  /**
   * Size integer.
   *
   * @return the integer
   */
  Integer size();
}
