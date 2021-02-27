package problem1;

/**
 * Represents a List of Integers
 */
public interface List {

  /**
   * Returns the total number of elements in the list.
   *
   * @return number of elements in this list
   */
  Integer size();


  /**
   * Returns true if empty and false otherwise
   *
   */
  Boolean isEmpty();

  /**
   * Given a new element {@code element} prepend it to this list
   *
   * @param element new element to add to the list
   * @return updated list with {@code element} prependeds
   */
  List add(Integer element);


  /**
   * Return the last element of this list.
   *
   * @return the last element of this list.
   */
  Integer last();

  /**
   * Return true if element is in the list and false otherwise.
   * @param element the element
   * @return the boolean
   */
  Boolean contains(Integer element);

  /**
   * Return the element at index position.
   * @param index the index
   * @return the element at index position
   * @throws InvalidCallException throw if the index is out of range.
   */
  Integer elementAt(Integer index) throws InvalidCallException;
}
