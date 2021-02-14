package problem2;

import java.util.Objects;

public class LinkedListOfStrings implements IListOfStrings {

  private Node head;
  private int numNodes;

  public LinkedListOfStrings() {
    this.head = null;
    this.numNodes = 0;
  }

  /**
   * Creates an empty list.
   * @return An empty list.
   */
  public static LinkedListOfStrings createEmpty() {
    return new LinkedListOfStrings();
  }

  /**
   * Add an item to the list.
   *
   * @param item The item to add.
   */
  @Override
  public void add(String item) {
    Node newNode = new Node(item, null);
    if (this.head == null)
      this.head = newNode;
    else {
      Node currNode = this.head;
      while (currNode.getNextNode() != null) {
        currNode = currNode.getNextNode();
      }
      currNode.setNextNode(newNode);
    }
    this.numNodes++;
  }

  /**
   * checks whether or not the list is empty.
   * @return true if the list is empty, false otherwise.
   */
  @Override
  public boolean isEmpty() {
    return this.numNodes == 0;
  }

  /**
   * The number of items in the list.
   *
   * @return The number of items in the list.
   */
  @Override
  public int size() {
    return this.numNodes;
  }

  /**
   * Returns a sub list of the items that contain the given substring.
   * @param item The substring to filter by.
   * @return A list of strings.
   */
  @Override
  public boolean contains(String item) {
    Node currNode = this.head;
    while (currNode != null) {
      if (currNode.getItem().equals(item)) {
        return true;
      }
      currNode = currNode.getNextNode();
    }
    return false;
  }

  /**
   * Returns true if all the elements in this list are in the given list.
   * @param listOfStrings a list of strings
   * @return A list of strings.
   */
  @Override
  public boolean containsAll(IListOfStrings listOfStrings) {
    Node currNode = this.head;

    while (currNode != null) {
      if (!listOfStrings.contains(currNode.getItem())) {
        return false;
      }
      currNode = currNode.getNextNode();
    }
    return true;
  }

  /**
   * Returns a sublist with all elements whose length is greater than the maximum length.
   * @param length the maximum String length
   * @return a sublist with all elements whose length is greater than the maximum length.
   */
  @Override
  public IListOfStrings filterLargerThan(int length) {
      IListOfStrings sublist = createEmpty();
      Node currNode = this.head;
      while (currNode != null) {
        if (currNode.getItem().length() > length) {
          sublist.add(currNode.getItem());
        }
        currNode = currNode.getNextNode();
      }
      return  sublist;
  }

  /**
   * check if the list has at least one duplicate element.
   * @return ture if the list has at lease one duplicate element, false otherwise.
   */
  @Override
  public boolean hasDuplicates() {
    IListOfStrings sublist = createEmpty();
    Node currNode = this.head;
    while (currNode != null) {
      if (sublist.contains(currNode.getItem())) {
        return true;
      }
      sublist.add(currNode.getItem());
      currNode = currNode.getNextNode();
    }
    return false;
  }

  /**
   * Returns a list with no duplicate element.
   * @return a list with no duplicate element.
   */
  @Override
  public IListOfStrings removeDuplicates() {
    IListOfStrings sublist = createEmpty();
    Node currNode = this.head;
    while (currNode != null) {
      if (!sublist.contains(currNode.getItem())) {
        sublist.add(currNode.getItem());
      }
      currNode = currNode.getNextNode();
    }
    return sublist;
  }

  /**
   * Helper method used by get and insert. Checks if the provided index is in bounds.
   * @param index The index to use.
   * @throws IndexOutOfBoundsException
   */
  private void checkBounds(int index) throws IndexOutOfBoundsException {
    if (index >= this.numNodes || index < 0)
      throw new IndexOutOfBoundsException();
  }

  /**
   * Gets the item at the specified index.
   *
   * @param index The index to retrieve.
   * @return The item at the specified index.
   * @throws IndexOutOfBoundsException if the index is out of bounds.
   */
  @Override
  public String get(int index) throws IndexOutOfBoundsException {
    this.checkBounds(index);
    Node currNode = this.head;
    int i = 0;
    while (i < index) {
      i++;
      currNode = currNode.getNextNode();
    }
    return currNode.getItem();
  }

  /**
   * Check if two LinkedListOfString object is equal
   * @param o the LinkedListOfString waits to compare
   * @return true if equal, false otherwise
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LinkedListOfStrings that = (LinkedListOfStrings) o;
    return numNodes == that.numNodes &&
        Objects.equals(head, that.head);
  }

  /**
   * Check if two LinkedListOfString object has same hash code
   * @return true if has same hash code, false otherwise
   */
  @Override
  public int hashCode() {
    return Objects.hash(head, numNodes);
  }

  /**
   * Return the detail of a LinkedListOfString object
   * @return the detail of a LinkedListOfString object
   */
  @Override
  public String toString() {
    return "LinkedListOfStrings{" +
        "head=" + head +
        ", numNodes=" + numNodes +
        '}';
  }
}
