package problem2;

import java.util.Objects;

public class SetOfIntegers implements Set {
  private Node head;
  private int numNodes;

  /**
   * Default head is null, default size is 0.
   */
  public SetOfIntegers() {
    this.head = null;
    this.numNodes = 0;
  }
  /**
   * Private constructor that allows us to return a new copy from the producers.
   * @param head The head of the linked list.
   * @param numNodes The size of the linked list.
   */
  private SetOfIntegers(Node head, int numNodes) {
    this.head = head;
    this.numNodes = numNodes;
  }

  /**
   * Create an empty Set with no elements in it.
   *
   * @return an empty Set.
   */
  public static Set emptySet() {
    return new SetOfIntegers();
  }

  /**
   * Check if the Set is empty.
   *
   * @return True if Set is empty, false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return this.numNodes == 0;
  }

  /**
   * Add an integer to Set.
   *
   * @param n the integer needs add.
   * @return A new Set contains integer n.
   */
  @Override
  public Set add(Integer n) {
    /**
     * If the integer n exists, return a new SetOfIntegers which has same head
     * and node number of this SetOfIntegers.
     */
    if (this.contains(n)) {
      return this;
    }
    /**
     * If the Set head is null, create a newNode with integer n, return a new Set with
     * the head newNode and numNodes 1.
     */
    Node newNode = new Node(n, null);
    if (this.head == null) {
      return new SetOfIntegers(newNode, this.numNodes + 1);
    }
    /**
     * If Set head is not null, create a newHead having the same head with this,
     * iterate newHead and add integer n to the back, then return a new Set.
     */
    Node newHead = new Node(this.head.getItem(), this.head.getNextNode());
    Node currNode = newHead;
    while (currNode.getNextNode() != null) {
      currNode = currNode.getNextNode();
    }
    currNode.setNextNode(newNode);
    return new SetOfIntegers(newHead, this.numNodes + 1);
  }

  /**
   * Check if the Set contains integer n.
   *
   * @param n the integer waits to check.
   * @return True if this Set contains integer n, false otherwise.
   */
  @Override
  public Boolean contains(Integer n) {
    Node currNode = this.head;
    while (currNode != null) {
      if (currNode.getItem().equals(n)) {
        return true;
      }
      currNode = currNode.getNextNode();
    }
    return false;
  }

  /**
   * Remove an integer n from this Set.
   *
   * @param n the integer need remove.
   * @return A new set without integer n.
   */
  @Override
  public Set remove(Integer n) {
    /**
     * If the integer n exists, return a new SetOfIntegers which has same head
     * and node number of this SetOfIntegers.
     */
    if (!this.contains(n)) {
      return this;
    }

    /**
     * if the integer n is in the head of Set, set the next Node after head to
     * newHead, if the integer n is in the middle or tail of Set, iterate this
     * Set and find the current Node before removed Node, then set newSetCurr's
     * next node as current Node's next next node.
     */
    Node newHead = new Node(this.head.getItem(), this.head.getNextNode());
    Node currNode = this.head;
    Node newSetCurr = newHead;
    if (currNode.getItem().equals(n)) {
      newHead = currNode.getNextNode();
    } else {
      while (!currNode.getNextNode().getItem().equals(n)) {
        newSetCurr = newSetCurr.getNextNode();
        currNode = currNode.getNextNode();
      }
      newSetCurr.setNextNode(currNode.getNextNode().getNextNode());
    }
    return new SetOfIntegers(newHead, this.numNodes - 1);
  }

  /**
   * Count the size of this Set.
   *
   * @return An integer represents the size of this Set.
   */
  @Override
  public Integer size() {
    return this.numNodes;
  }

  /**
   * Check if two Set object is equal
   * @param o the Set object waits to compare
   * @return true if equal, false otherwise.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SetOfIntegers that = (SetOfIntegers) o;
    return numNodes == that.numNodes &&
        Objects.equals(head, that.head);
  }
  /**
   * Check if two Set object has same hashCode
   * @return true if has, false otherwise.
   */
  @Override
  public int hashCode() {
    return Objects.hash(head, numNodes);
  }

  /**
   * Return the Set details.
   * @return the Set details.
   */
  @Override
  public String toString() {
    return "Set{" +
        "head=" + head.toString() +
        ", numNodes=" + numNodes +
        '}';
  }
}
