package problem1;

/**
 * Represents the empty list of integers.
 */

public class Empty implements List {

  @Override
  public Integer size() {
    return 0;
  }

  @Override
  public Boolean isEmpty() {
    return true;
  }

  @Override
  public List add(Integer element) {
    return new Cons(element, this);
  }

  @Override
  public Integer last() throws InvalidCallException {
    throw new InvalidCallException("Called last() on empty!");
  }

  /**
   * Return true if element is in the list and false otherwise.
   *
   * @param element the element
   * @return the boolean
   */
  @Override
  public Boolean contains(Integer element) {
    return false;
  }

  /**
   * Return the element at index position.
   *
   * @param index the index
   * @return the element at index position
   * @throws InvalidCallException throw if the index is out of range.
   */
  @Override
  public Integer elementAt(Integer index) throws InvalidCallException {
    throw new InvalidCallException("Call element() at empty!");
  }


  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    else return true;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return 42;
  }

  @Override
  public String toString() {
    return "EmptySet{}";
  }
}