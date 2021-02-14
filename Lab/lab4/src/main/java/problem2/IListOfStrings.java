package problem2;

/**
 * A List represents an ordered, mutable collection of Strings.
 */
public interface IListOfStrings {

  /**
   * Add an item to the list.
   * @param item The item to add.
   */
  void add(String item);

  /**
   * checks whether or not the list is empty.
   * @return true if the list is empty, false otherwise.
   */
  boolean isEmpty();

  /**
   * The number of items in the list.
   * @return The number of items in the list.
   */
  int size();

  /**
   * Returns a sub list of the items that contain the given substring.
   * @param substring The substring to filter by.
   * @return A list of strings.
   */
  boolean contains(String substring);

  /**
   * Returns true if all the elements in this list are in the given list.
   * @param listOfStrings a list of strings
   * @return true if all the elements in this list are in the given list,
   * false otherwise
   */
  boolean containsAll(IListOfStrings listOfStrings);

  /**
   * Returns a sublist with all elements whose length is greater than the maximum length.
   * @param length the maximum String length
   * @return a sublist with all elements whose length is greater than the maximum length.
   */
  IListOfStrings filterLargerThan(int length);

  /**
   * check if the list has at least one duplicate element.
   * @return ture if the list has at lease one duplicate element, false otherwise.
   */
  boolean hasDuplicates();

  /**
   * Returns a list with no duplicate element.
   * @return a list with no duplicate element.
   */
  IListOfStrings removeDuplicates();

  /**
   * Gets the item at the specified index.
   * @param index The index to retrieve.
   * @return The item at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of bounds.
   */
  String get(int index) throws IndexOutOfBoundsException;
}
