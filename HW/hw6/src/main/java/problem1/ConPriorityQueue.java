package problem1;

import java.util.Objects;

public class ConPriorityQueue implements PriorityQueue {
  private Element first;
  private PriorityQueue rest;

  public ConPriorityQueue(Element first, PriorityQueue rest) {
    this.first = first;
    this.rest = rest;
  }
  /**
   * Is empty boolean.
   *
   * @return the boolean, true if PQ is empty false otherwise.
   */
  @Override
  public Boolean isEmpty() {
    return false;
  }

  /**
   * Add the given element to priority queue, sort the PQ according to
   * elements' priority form high to low. first element is always the
   * highest priority element.
   *
   * @param priority the priority
   * @param value    the value
   * @return a copy of priority queue contains given element.
   */
  @Override
  public PriorityQueue add(Integer priority, String value) {
    if (this.first.getPriority() < priority) {
      Element newElement = new Element(priority, value);
      return new ConPriorityQueue(newElement, this);
    } else {
      return new ConPriorityQueue(this.first, this.rest.add(priority, value));
    }
  }

  /**
   * Return the value in the PQ that has the highest priority.
   *
   * elements having same priority, the one added first will be chose.
   * e.g. element1 = (5, "cat"), element2 = (5, "dog), if element1 added
   * first, element2 added after element1. Then peek() will return the
   * value of element1: "cat".
   *
   * @return the value in the PQ that has the highest priority.
   */
  @Override
  public String peek() {
    return this.first.getValue();
  }


  /**
   * remove the element with the highest priority.
   *
   * elements having same priority, the one added first will be removed first.
   * e.g. element1 = (5, "cat"), element2 = (5, "dog), if element1 added
   * first, element2 added after element1. remove() method will remove element1.
   *
   * @return a copy of the PQ without the element with the highest priority
   */
  @Override
  public PriorityQueue pop() {
    return this.rest;
  }

  @Override
  public int hashCode() {
    int result = 31 * this.first.getPriority();
    result += Objects.hashCode(this.first);
    return result + this.rest.hashCode();
  }

  /**
   * In this implement, PQ is sorted already when adding,
   * so only when two PQ have the same elements with same oder,
   * they're equals.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConPriorityQueue conPriorityQueue = (ConPriorityQueue) o;
    if (!this.first.equals(conPriorityQueue.first)) return false;
    return this.rest.equals(conPriorityQueue.pop());
  }

  @Override
  public String toString() {
    return "ConPriorityQueue{"
        + "first=" + this.first
        + ", rest=" + this.rest
        + '}';
  }
}
