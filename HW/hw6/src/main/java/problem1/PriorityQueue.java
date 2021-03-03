package problem1;

/**
 * The interface of Priority queue.
 */
public interface PriorityQueue {

  /**
   * Create empty priority queue.
   *
   * @return the empty priority queue.
   */
  static PriorityQueue createEmpty() {
    return new EmptyPriorityQueue();
  }

  /**
   * Is empty boolean.
   *
   * @return the boolean, true if PQ is empty false otherwise.
   */
  Boolean isEmpty();

  /**
   * Add the given element to priority queue.
   *
   * @param priority the priority
   * @param value    the value
   * @return a copy of priority queue contains given element.
   */
  PriorityQueue add(Integer priority, String value);

  /**
   * Return the value in the PQ that has the highest priority.
   *
   * @return the value in the PQ that has the highest priority.
   */
  String peek();

  /**
   * remove the element with the highest priority.
   *
   * @return a copy of the PQ without the element with the
   * highest priority
   */
  PriorityQueue pop();
}
