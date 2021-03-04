package problem1;

public class EmptyPriorityQueue implements PriorityQueue {

  /**
   * Is empty boolean.
   *
   * @return the boolean, true if PQ is empty false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return true;
  }

  /**
   * Add the given element to priority queue.
   *
   * @param priority the priority
   * @param value    the value
   * @return a copy of priority queue contains given element.
   */
  @Override
  public PriorityQueue add(Integer priority, String value) {
    Element element = new Element(priority, value);
    return new ConPriorityQueue(element, this);
  }

  /**
   * Return the value in the PQ that has the highest priority.
   *
   * @return the value in the PQ that has the highest priority.
   */
  @Override
  public String peek() {
    throw new InvalidCallException("Called last() on empty!");
  }

  /**
   * remove the element with the highest priority.
   *
   * @return a copy of the PQ without the element with the highest priority
   */
  @Override
  public PriorityQueue pop() {
    throw new InvalidCallException("Called last() on empty!");
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
    return "EmptyPriorityQueue{}";
  }
}
