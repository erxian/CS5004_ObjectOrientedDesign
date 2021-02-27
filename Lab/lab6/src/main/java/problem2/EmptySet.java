package problem2;

public class EmptySet implements ISet {

  /**
   * Is empty boolean.
   *
   * @return the boolean, true if the Set is empty false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Add Integer n to Set.
   *
   * @param n Integer need add.
   * @return a new Set contains n.
   */
  @Override
  public ISet add(Integer n) {
    return new ConsSet(n, this);
  }

  /**
   * Check if Set contains Integer n
   *
   * @param n Integer need check
   * @return a boolean, true if contains false otherwise.
   */
  @Override
  public Boolean contains(Integer n) {
    return false;
  }

  /**
   * Remove the integer n.
   *
   * @param n the Integer need remove.
   * @return a new Set without n.
   */
  @Override
  public ISet remove(Integer n) {
    return this;
  }

  /**
   * Size integer.
   *
   * @return the integer
   */
  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public int hashCode() {
    return 31;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || this.getClass() != obj.getClass()) return false;
    return true;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
