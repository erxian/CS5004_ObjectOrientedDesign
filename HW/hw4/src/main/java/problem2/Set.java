package problem2;

/**
 * Represents an non-ordered, non-duplicated  and immutable collection of Integers.
 */
public interface Set {

  /**
   * Check if the Set is empty.
   * @return True if Set is empty, false otherwise.
   */
  Boolean isEmpty();

  /**
   * Add an integer to Set.
   * @param n the integer needs add.
   * @return A new Set contains integer n.
   */
  Set add(Integer n);

  /**
   * Check if the Set contains integer n.
   * @param n the integer waits to check.
   * @return True if this Set contains integer n, false otherwise.
   */
  Boolean contains(Integer n);

  /**
   * Remove an integer n from this Set.
   * @param n the integer need remove.
   * @return A new set without integer n.
   */
  Set remove(Integer n);

  /**
   * Count the size of this Set.
   * @return An integer represents the size of this Set.
   */
  Integer size();
}
