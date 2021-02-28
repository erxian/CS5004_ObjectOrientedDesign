package problem1;

/**
 * Represents a non-emty list of integers
 *
 */
public class Cons implements List {
  private Integer first;
  private List rest;

  /**
   * Given an integer and a list create a new list with the
   * same elements as {@code rest} and with {@code first} prepended.
   *
   * @param first new element to add to the beginning of the list
   * @param rest the list we are going to use to add our new element
   */
  public Cons(Integer first, List rest) {
    this.first = first;
    this.rest = rest;
  }

  /**
   * Getter for property 'first'.
   *
   * @return Value for property 'first'.
   */
  public Integer getFirst() {
    return this.first;
  }

  /**
   * Getter for property 'rest'.
   *
   * @return Value for property 'rest'.
   */
  public List getRest() {
    return this.rest;
  }

  @Override
  public Integer size() {
    return 1 + this.getRest().size(); }

  @Override
  public Boolean isEmpty() {
    return false;
  }

  @Override
  public List add(Integer element) {

    return new Cons(element, this);
  }

  @Override
  public Integer last() {
    if (this.rest.isEmpty()) {
      return this.first;
    } else {
      return this.rest.last();
    }

  }


  private void checkIndex(Integer index) throws InvalidCallException {
    if (index >= this.size() || index < 0) throw new InvalidCallException(
        "The index is out of bound!");
  }

  /**
   * Return true if element is in the list and false otherwise.
   *
   * @param element the element
   * @return the boolean
   */
  @Override
  public Boolean contains(Integer element) {
    if (this.first.equals(element)) {
      return true;
    }
    return this.rest.contains(element);
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
    this.checkIndex(index);

    if (index.equals(0)) {
      return this.first;
    }
    return this.rest.elementAt(index - 1);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Cons cons = (Cons) o;

    if (getFirst() != null ? !getFirst().equals(cons.getFirst()) : cons.getFirst() != null)
      return false;
    return getRest() != null ? getRest().equals(cons.getRest()) : cons.getRest() == null;
  }

  @Override
  public int hashCode() {
    int result = getFirst() != null ? getFirst().hashCode() : 0;
    result = 31 * result + (getRest() != null ? getRest().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "Cons{"
        + "first=" + first
        + ", rest=" + rest
        + '}';
  }


}

